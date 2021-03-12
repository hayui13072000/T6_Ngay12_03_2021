package com.example.bai2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GoodsAdt extends BaseAdapter {

    Context ctx;
    int layoutItem;
    ArrayList<Goods> arr;

    public GoodsAdt(Context ctx, int layoutItem, ArrayList<Goods> arr) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arr = arr;
    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view= LayoutInflater.from(ctx).inflate(layoutItem, parent, false);
        TextView name=view.findViewById(R.id.textView);
        TextView gia=view.findViewById(R.id.textView2);
        ImageView imgview=view.findViewById(R.id.imageView2);

        name.setText(arr.get(i).getName());
        gia.setText(arr.get(i).getPrice());
        imgview.setImageResource(arr.get(i).getImg());

        return view;
    }
}
