package com.example.dz3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2 ;
    Button btn ;
    ArrayList <ItemModel> list;
    RecyclerView recyclerView ;
  MainAdapter adapter;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =findViewById(R.id.rv);
        adapter = new MainAdapter();

        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager  manager =  new LinearLayoutManager(this);

        recyclerView.setLayoutManager(manager);


        list =  new ArrayList<>();

         editText = findViewById(R.id.editText);
         editText2 = findViewById(R.id.editText2);

        adapter.addList(list);



        findViewById(R.id.btn).setOnClickListener(v -> {
            adapter.addModel(new ItemModel(editText.getText().toString(),editText2.getText().toString()));
        });

    }
}