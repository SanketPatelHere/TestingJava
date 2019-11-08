package com.example.testingjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//RecyclerViewAdapter
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyAdapterViewHoler>
{
    Context context;
    ArrayList<Pojo> lst1;
    ArrayAdapter<Pojo> aa1;
    public MyAdapter(Context context, ArrayList lst1)
    {
        this.context = context;
        this.lst1 = lst1;
    }

    @Override
    public int getItemCount() {
        return lst1.size();
    }

    @Override
    public MyAdapter.MyAdapterViewHoler onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from(context);
        View v = li.inflate(R.layout.clv_layout, parent, false);
        return new MyAdapterViewHoler(v);
    }

    class MyAdapterViewHoler extends RecyclerView.ViewHolder
    {
        ImageView img1;
        TextView name, salary;
        public MyAdapterViewHoler(View itemView)
        {
            super(itemView);
            img1 = (ImageView)itemView.findViewById(R.id.img1);
            name = (TextView) itemView.findViewById(R.id.name);
            salary = (TextView) itemView.findViewById(R.id.salary);
        }
    }

    @Override
    public void onBindViewHolder(MyAdapterViewHoler holder, int position) {
        Pojo dp = lst1.get(position);
        holder.img1.setImageResource(dp.getImg1());
        holder.name.setText(dp.getName());
        holder.salary.setText(dp.getSalary());
    }
}
