package com.example.testingjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
//import android.widget.Toolbar;
//import com.nispok.snackbar.Snackbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class JsonDemo extends AppCompatActivity {
    Button jo, ja;
    private ArrayList<Contact> contactList;
    private LinearLayout parentView;
    private ListView lvjson;

    private MyContactAdapter adapter;
    private MyHeroRecyclerviewAdapter adapter2;
    ProgressDialog progressDialog;
    RecyclerView rv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_demo);

        jo = (Button) findViewById(R.id.jo);
        ja = (Button) findViewById(R.id.ja);

        //lvjson = (ListView)findViewById(R.id.lvjson);
        contactList = new ArrayList<>();
        parentView = findViewById(R.id.parentLayout);


        Intent i = getIntent();
        Bundle b = i.getExtras();
        String name = b.getString("name");
        if (name.equals("JsonObject")) {
            ja.setVisibility(View.GONE);
        } else if (name.equals("JsonArray")) {
            jo.setVisibility(View.GONE);
        } else {

        }
        jo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "JsonObject", Toast.LENGTH_SHORT).show();
                //Toast toast = Toast.makeText(getApplicationContext(), "click to load", Toast.LENGTH_SHORT);
                //toast.setGravity(Gravity.CENTER, 0, 0);
                //toast.show();
                progressDialog = new ProgressDialog(JsonDemo.this);
                progressDialog.setMessage("Loading...");
                progressDialog.show();

                GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
                Call<List<Hero>> call = service.getHeroes();
                call.enqueue(new Callback<List<Hero>>() {
                    @Override
                    public void onResponse(Call<List<Hero>> call, Response<List<Hero>> response) {
                        Log.i("Response = ",response+"");
                        //Toast.makeText(getApplicationContext(), "Response",Toast.LENGTH_SHORT).show();
                        progressDialog.dismiss();
                        List<Hero> heroList = response.body();
                        generateDataList(heroList);
                    }

                    @Override
                    public void onFailure(Call<List<Hero>> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), "Data Not Loaded",Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });


        ja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "JsonArray", Toast.LENGTH_SHORT).show();
            }
        });


    }
    public void generateDataList(List<Hero> heroList)
    {
        rv1 = (RecyclerView)findViewById(R.id.rv1);
        adapter2 = new MyHeroRecyclerviewAdapter(this, heroList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(JsonDemo.this);
        rv1.setLayoutManager(layoutManager);
        rv1.setAdapter(adapter2);
    }
}
