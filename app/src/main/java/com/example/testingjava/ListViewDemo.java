package com.example.testingjava;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewDemo extends AppCompatActivity {
    ArrayList<String> lst;
    ListView lv1;
    ArrayAdapter<String> aa;

    FrameLayout fm1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_demo);
        lv1 = (ListView)findViewById(R.id.lv1);
        fm1 = (FrameLayout) findViewById(R.id.fm1);

        lst = new ArrayList<>();
        lst.add("aaa");
        lst.add("bbb");
        lst.add("ccc");
        lst.add("ddd");
        aa = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, lst);
        lv1.setAdapter(aa);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "select = "+id, Toast.LENGTH_SHORT).show();
                /*Intent i = new Intent(ListViewDemo.this, MyFacebook.class);
                i.putExtra("id = ",position);
                startActivity(i);*/

                View v = LayoutInflater.from(getApplicationContext()).inflate(R.layout.activity_my_facebook, parent ,false);
                fm1.addView(v);
                lv1.setVisibility(View.GONE);
                //fm1.setVisibility(View.VISIBLE);

                //return v;
            }
        });
    }
}

