package com.example.testingjava;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
//import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
public class MyFragment extends AppCompatActivity {
    Button fg1, fg2;
    FrameLayout fm1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_fragment);
        fg1 = (Button)findViewById(R.id.fg1);
        fg2 = (Button)findViewById(R.id.fg2);

        fg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentload(new FirstFragment());
            }
        });

        fg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentload(new SecondFragment());
            }
        });
        //Fragment aa = new FirstFragment();

    }

    public void fragmentload(Fragment fragment)
    {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fm1, fragment);
        ft.commit();
    }
}
