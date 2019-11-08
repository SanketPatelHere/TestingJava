package com.example.testingjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
public class  CustomAdapter extends ArrayAdapter {
    Context context;
    int layout;
    ArrayList<Pojo> lst;

    public CustomAdapter(Context context, ArrayList<Pojo> lst) {
        super(context, R.layout.clv_layout);
        this.context = context;
        //this.layout = resource;
        this.lst = lst;
    }

    @Override
    public View getView(int position,View convertView, @NonNull ViewGroup parent) {
        TextView name, salary;
        ImageView img1;
        if(convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(R.layout.clv_layout,parent,false);
            name = (TextView)convertView.findViewById(R.id.name);
            salary = (TextView)convertView.findViewById(R.id.salary);
            img1 = (ImageView)convertView.findViewById(R.id.img1);

            Pojo p1 = lst.get(position);
            name.setText(p1.getName());
            salary.setText(p1.getSalary());
            img1.setImageResource(p1.getImg1());
        }
        return convertView;
    }

    @Override
    public int getCount() {
        return lst.size();
    }
}

