package com.example.dayal.coordinatorapp;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class DemoAdapter extends RecyclerView.Adapter {

    //Called when RecyclerView needs a new RecyclerView.ViewHolder
    // of the given type to represent an item.
    List<DemoItem> demoItems;
    Context context;
    public DemoAdapter(List<DemoItem> demoItems,Context context){
        this.demoItems=demoItems;
        this.context=context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row=inflater.inflate(R.layout.custom_row_demo, parent, false);
        return new DemoItemHolder(row);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder,int position){
        DemoItem currentItem=demoItems.get(position);
        DemoItemHolder  itemHolder=(DemoItemHolder) holder;
        DisplayMetrics displayMetrics=new DisplayMetrics();
        ((Activity)context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        Picasso.with(context).load(currentItem.imageUrl).placeholder(R.mipmap.androidimage).centerCrop().resize(displayMetrics.widthPixels,displayMetrics.heightPixels/3).into(itemHolder.mThumbnail);
    }
    @Override
    public int getItemCount() {
        return demoItems.size();
    }

    public class DemoItemHolder extends RecyclerView.ViewHolder {
        //RecyclerView.ViewHolder : A ViewHolder describes an item view and metadata about its
        // place within the RecyclerView
        ImageView mThumbnail;
        //TextView Title, Description;
        public DemoItemHolder(View itemView){
            super(itemView);
            mThumbnail=(ImageView)itemView.findViewById(R.id.thumbnail);
        }
    }
}



