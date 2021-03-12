package com.example.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvGG;
    GoodsAdt adt;
    ArrayList<Goods> arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvGG=findViewById(R.id.lvGG);
        arr=new ArrayList<>();
        arr.add(new Goods("google", "80$", R.drawable.aha));

        arr.add(new Goods("google", "80$", R.drawable.aha));

        arr.add(new Goods("google", "80$", R.drawable.aha));

        adt=new GoodsAdt(this, R.layout.item_listview, arr);
        lvGG.setAdapter(adt);

    }
}