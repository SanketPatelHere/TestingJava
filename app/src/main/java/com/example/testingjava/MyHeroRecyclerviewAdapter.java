package com.example.testingjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyHeroRecyclerviewAdapter extends RecyclerView.Adapter<MyHeroRecyclerviewAdapter.MyHeroRecyclerviewAdapterViewHolder> {
    private Context context;
    private List<Hero> heroList;
    public MyHeroRecyclerviewAdapter(Context context, List<Hero> heroList)
    {
        this.context = context;
        this.heroList = heroList;
    }

    @Override
    public int getItemCount() {
        return heroList.size();
    }

    @Override
    public MyHeroRecyclerviewAdapter.MyHeroRecyclerviewAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from(context);
        View v = li.inflate(R.layout.hero_layout, parent, false);
        return new MyHeroRecyclerviewAdapterViewHolder(v);
    }
    public class MyHeroRecyclerviewAdapterViewHolder extends RecyclerView.ViewHolder
    {
        TextView name, team;
        ImageView img;
        public MyHeroRecyclerviewAdapterViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            team = itemView.findViewById(R.id.team);
            img = itemView.findViewById(R.id.img);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull MyHeroRecyclerviewAdapterViewHolder holder, int position) {
        Hero dp = heroList.get(position);
        holder.name.setText(dp.getName());
        holder.team.setText(dp.getTeam());
        //holder.img.setText(dp.get());

        Picasso.get().load(dp.getImageurl()).into(holder.img);
    }
}
