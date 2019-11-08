package com.example.testingjava;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
//import com.squareup.picasso.Picasso;
//import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso;

import java.util.List;
public class MyContactAdapter extends ArrayAdapter<Contact> {
    List<Contact> contactList;
    Context context;
    private LayoutInflater layoutInflater;

    public MyContactAdapter(Context context, List<Contact> objects) {
        super(context, 0, objects);
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        contactList = objects;
    }

    public Contact getItem(int position)
    {
        return contactList.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        RecyclerView.ViewHolder vh;
        TextView name, email;
        ImageView img;
        if (convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(R.layout.layout_row_jsonview, parent,false);
            img = (ImageView)convertView.findViewById(R.id.img);
            name = (TextView)convertView.findViewById(R.id.name);
            email = (TextView)convertView.findViewById(R.id.email);
            Contact item = getItem(position);
            Contact c1 = contactList.get(position);
            Picasso.get().load(item.getImg()).into(img);
                    //.load(item.getProfilePic()).placeholder(R.mipmap.ic_launcher).error(R.mipmap.ic_launcher).into(vh.imageView);

            //img.setImageResource(c1.getImg());
            name.setText(c1.getName());
            email.setText(c1.getEmail());
        }
        Contact item = getItem(position);
        //vh.name.setTe
        //return vh.rootView;
        return convertView;
    }
}