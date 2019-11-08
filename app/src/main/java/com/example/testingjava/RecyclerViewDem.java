package com.example.testingjava;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
public class RecyclerViewDem extends AppCompatActivity {
    RecyclerView rv1;
    ArrayList<Pojo> lst;
    MyAdapter aa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_dem);

        rv1 = (RecyclerView)findViewById(R.id.rv1);
        lst = new ArrayList<>();
        lst.add(new Pojo("aaaa","1111",R.drawable.cpu));
        lst.add(new Pojo("bbbbb","2222",R.drawable.server));
        lst.add(new Pojo("ccccc","3333",R.drawable.code));
        lst.add(new Pojo("ddddd","4444",R.drawable.coding));
        lst.add(new Pojo("eeeee","5555",R.drawable.increase));

        lst.add(new Pojo("aaaa","1111",R.drawable.cpu));
        lst.add(new Pojo("bbbbb","2222",R.drawable.server));
        lst.add(new Pojo("ccccc","3333",R.drawable.code));
        lst.add(new Pojo("ddddd","4444",R.drawable.coding));
        lst.add(new Pojo("eeeee","5555",R.drawable.increase));

        aa = new MyAdapter(this, lst);
        rv1.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        rv1.setAdapter(aa);
    }
}
