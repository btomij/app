package com.joelin.userapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.joelin.userapp.Model.Product;
import com.joelin.userapp.adapter.adt_product;

import java.util.ArrayList;
import java.util.List;

public class SalesActivity extends AppCompatActivity {

    adt_product adpter;

    adt_product.ItemClickListener itemClickListener = new adt_product.ItemClickListener() {
        @Override
        public void onItemClick(int position) {
            Product value = adpter.getItem(position);

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);
        setUpViews();
        updateDatasource();
    }
    private void updateDatasource() {
        List<Product> values = new ArrayList<Product>();
        values.add(new Product(1, "1", 10, 0, "111"));
        values.add(new Product(2, "2", 20, 0, "222"));
        values.add(new Product(3, "3", 30, 0, "333"));
        values.add(new Product(4, "4", 40, 0, "444"));
        values.add(new Product(5, "5", 50, 0, "555"));
        values.add(new Product(6, "6", 60, 0, "666"));
        values.add(new Product(7, "7", 70, 0, "777"));
        values.add(new Product(8, "8", 80, 0, "888"));
        values.add(new Product(9, "9", 90, 0, "999"));
        adpter.setDatasource(values);
    }

    protected void setUpViews() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.listview);
        //noinspection ConstantConditions
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adpter = new adt_product(itemClickListener);
        recyclerView.setAdapter(adpter);

    }
}
