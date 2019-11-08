package com.example.testingjava;
import androidx.appcompat.app.AppCompatActivity;

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
import java.util.List;

public class CustomListViewDemo extends AppCompatActivity {
    ListView clv1;
    ArrayList<Pojo> lst;
    CustomAdapter aa;
    FrameLayout fm1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view_demo);
        clv1 = (ListView)findViewById(R.id.clv1);
        fm1 = (FrameLayout)findViewById(R.id.fm1);
        lst = new ArrayList<>();
        lst.add(new Pojo("sanket", "10000",  R.drawable.cpu));
        lst.add(new Pojo("sandip", "20000",  R.drawable.server));
        lst.add(new Pojo("jay", "30000", R.drawable.code));
        lst.add(new Pojo("raj", "40000",  R.drawable.coding));
        lst.add(new Pojo("divyesh", "50000",  R.drawable.increase));

        lst.add(new Pojo("sanket", "10000",  R.drawable.cpu));
        lst.add(new Pojo("sandip", "20000",  R.drawable.server));
        lst.add(new Pojo("jay", "30000", R.drawable.code));
        lst.add(new Pojo("raj", "40000",  R.drawable.coding));
        lst.add(new Pojo("divyesh", "50000",  R.drawable.increase));


        aa = new CustomAdapter(getApplicationContext(), lst);
        clv1.setAdapter(aa);

        clv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "click = "+position,Toast.LENGTH_SHORT).show();
                /*Intent i = new Intent(CustomListViewDemo.this, MyFacebook.class);
                i.putExtra("id = ",position);
                startActivity(i);*/

                View v = LayoutInflater.from(getApplicationContext()).inflate(R.layout.activity_my_facebook, parent,false);
                fm1.addView(v);
                clv1.setVisibility(View.GONE);
                //fm1.setVisibility(View.VISIBLE);
            }
        });
    }

}
