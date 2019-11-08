package com.example.testingjava;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MyFacebook extends AppCompatActivity {
    Button status, newsfeed, profile, settigs, webpage;
    FrameLayout facebookFramelayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_facebook);

        status = (Button)findViewById(R.id.status);
        newsfeed = (Button)findViewById(R.id.newsfeed);
        profile = (Button)findViewById(R.id.profile);
        settigs = (Button)findViewById(R.id.settigs);
        webpage = (Button)findViewById(R.id.webpage);
        facebookFramelayout = (FrameLayout) findViewById(R.id.facebookFramelayout);

        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "status",Toast.LENGTH_SHORT).show();
                loadFragment(new StatusFragment());
            }
        });

        newsfeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "newsfeed",Toast.LENGTH_SHORT).show();
                loadFragment(new StatusFragment());
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "profile",Toast.LENGTH_SHORT).show();
            }
        });

        settigs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "facebookFramelayout",Toast.LENGTH_SHORT).show();
            }
        });

        webpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "webpage",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://www.google.com"));
                startActivity(i);
            }
        });
    }
    public void loadFragment(Fragment fragment)
    {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.facebookFramelayout, fragment);
        ft.commit();
    }
}
