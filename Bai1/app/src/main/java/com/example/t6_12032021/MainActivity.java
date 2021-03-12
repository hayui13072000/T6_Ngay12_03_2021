package com.example.t6_12032021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spnThings;
    List arrThings;
    ArrayAdapter adtThings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnThings=findViewById(R.id.spnThings);
        addData();
        adtThings=new ArrayAdapter(
               MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrThings);
        spnThings.setAdapter(adtThings);


    }

    private void addData(){
        arrThings=new ArrayList();
        arrThings.add("Hàng gia dụng");
        arrThings.add("Hàng gia dụng");
        arrThings.add("Hàng gia dụng");
        arrThings.add("Hàng gia dụng");
    }


}