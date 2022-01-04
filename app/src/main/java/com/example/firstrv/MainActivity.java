package com.example.firstrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Model> list= new ArrayList<>();
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv);
        Adaptor adaptor = new Adaptor(this, list);
        recyclerView.setAdapter(adaptor);
        initData();


    }

    private void initData() {
        list.add(new Model("Barchyn" , R.drawable.ic_person));
        list.add(new Model("Damir" , R.drawable.ic_person));
        list.add(new Model("Azat" , R.drawable.ic_person));
        list.add(new Model("Aika" , R.drawable.ic_person));
        list.add(new Model("Gulya" , R.drawable.ic_person));
        list.add(new Model("Vika" , R.drawable.ic_person));
        list.add(new Model("Nadya" , R.drawable.ic_person));
        list.add(new Model("Dasha" , R.drawable.ic_person));
        list.add(new Model("Sasha" , R.drawable.ic_person));
        list.add(new Model("Askar" , R.drawable.ic_person));
        list.add(new Model("Amir" , R.drawable.ic_person));
        list.add(new Model("Kolya" , R.drawable.ic_person));
        list.add(new Model("Akylzat" , R.drawable.ic_person));

    }
}