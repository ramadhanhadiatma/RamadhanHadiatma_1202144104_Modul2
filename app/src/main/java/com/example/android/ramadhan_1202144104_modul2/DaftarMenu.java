package com.example.android.ramadhan_1202144104_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.LinkedList;
import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> judulList;
    private ArrayList<Integer> hargaList;
    private ArrayList<Integer> gambarList;
    //Daftar Judul
    private String[] Judul = {"Sop Iga Sapi", "Sop Buah", "Beef Burger", "Almond Cup", "Yoghurt Strawberry", "Brownies"};

    //Daftar Harga
    private int[] Harga = {25000,10000,15000,12000,12000,20000};

    //Daftar Gambar
    private int[] Gambar = {R.drawable.foto1, R.drawable.foto2, R.drawable.foto3, R.drawable.foto4,
            R.drawable.foto5, R.drawable.foto6};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        judulList = new ArrayList<>();
        hargaList = new ArrayList<>();
        gambarList = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler);


        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        adapter = new RecyclerViewAdapter(judulList, hargaList, gambarList);

        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);
    }

}