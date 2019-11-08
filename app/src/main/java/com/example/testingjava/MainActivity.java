package com.example.testingjava;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    Button lv, clv, rv, JsonObject, JsonArray, fg, fc, webpage, activity, sendemail;
    Button navigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (Button)findViewById(R.id.lv);
        clv = (Button)findViewById(R.id.clv);
        rv = (Button)findViewById(R.id.rv);


        JsonObject = (Button)findViewById(R.id.JsonObject);
        JsonArray = (Button)findViewById(R.id.JsonArray);
        fg = (Button)findViewById(R.id.fg);
        fc = (Button)findViewById(R.id.fc);
        webpage = (Button)findViewById(R.id.webpage);
        activity = (Button)findViewById(R.id.activity);
        sendemail = (Button)findViewById(R.id.sendemail);
        navigation = (Button)findViewById(R.id.navigation);
        lv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ListViewDemo.class);
                i.putExtra("name","ListViewDemo");
                startActivity(i);
            }
        });

        clv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CustomListViewDemo.class);
                i.putExtra("name","ListViewDemo");
                startActivity(i);
            }
        });

        rv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RecyclerViewDem.class);
                i.putExtra("name","ListViewDemo");
                startActivity(i);
            }
        });

        JsonObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, JsonDemo.class);
                i.putExtra("name","JsonObject");
                startActivity(i);
            }
        });

        JsonArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, JsonDemo.class);
                i.putExtra("name","JsonArray");
                startActivity(i);
            }
        });

        fg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MyFragment.class);
                i.putExtra("name","Fragment");
                startActivity(i);


            }
        });
        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MyFacebook.class);
                i.putExtra("name","Fragment");
                startActivity(i);


            }
        });

        webpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http:www.google.com"));
                i.setPackage("com.android.chrome");
                i.putExtra("name","Webpage");
                try
                {
                    startActivity(i);
                }
                catch (Exception e)
                {
                    i.setPackage(null);
                    getApplicationContext().startActivity(i);
                }


            }
        });
        sendemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);
                //email.putExtra("name","Send Email");
                email.setType("text/plain");
                email.putExtra(Intent.EXTRA_EMAIL, "sanketramaniu0@gmail.com");
                email.putExtra(Intent.EXTRA_SUBJECT, "Testing");
                email.putExtra(Intent.EXTRA_TEXT, "Write mail");
                //startActivity(Intent.createChooser(email, "Choose an email client from..."));
                startActivity(email);

            }
        });
       activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ActivityWork.class);
                i.putExtra("name","ActivityWork");
                startActivity(i);


            }
        });

        navigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ActivityWork.class);
                i.putExtra("name","ActivityWork");
                startActivity(i);


            }
        });
        /*ArrayList lst1 = new ArrayList();  //non-primitive = object =
        lst1.add(new Integer(3));
        Integer one = (Integer)lst1.get(0);
        int intOne = one.intValue();

        //wrapping = primitive = variable to non-primitive = object
        //ArrayList<Integer> lst2 = new ArrayList<Integer>();
        ArrayList<Integer> lst2 = new ArrayList<>();  //primitive = variable
        lst2.add(3);
        int first = lst2.get(0);

        ArrayList<Object> lst3 = new ArrayList<>();
        int second = lst2.get(1);

        Pojo p = new Pojo();
        ArrayList<Pojo> l1 = new ArrayList<>();
        l1.add(p);
        l1.get(2);
        l1.contains(p);
        l1.size();
        l1.remove(p);

        HashMap<String, String> h1 = new HashMap<>();
        h1.put("name", "sanket");
        h1.put("collge", "darshan");
        h1.put("salary", "10000");
        h1.put("extra", "not is removed");
        h1.get(0);
        h1.get("name");
        h1.remove(0);
        h1.remove("extra");

        show(new Integer(3));*/
        //ArrayList<String> e = new ArrayList<E>();
        //e.add("a");
        //ArrayList<Object> obb = new ArrayList<Pojo>();

       /* HashSet<String> hs = new HashSet();
        hs.add("pp");
        hs.add("qq");
        hs.add("rr");
        hs.add("ss");
        hs.addAll(l1);



        Hashtable<String, String> h2 = new Hashtable<>();
        h2.put("name","sanket");
        h2.put("college","darshan");
        h2.put("salary","10000");
        System.out.println("get = "+h2.get(0));
        System.out.println("get = "+h2.get("name"));
        System.out.println("h2 = "+h2);*/
    }

    /*public void show(int x)
    {
        Object a = new Object();
        Object b = new String();
        a.equals(b);
    }*/
}
