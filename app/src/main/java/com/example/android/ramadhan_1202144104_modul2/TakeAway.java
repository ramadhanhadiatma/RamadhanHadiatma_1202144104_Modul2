package com.example.android.ramadhan_1202144104_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void pilihpesanan(View view) {
        Intent intent = new Intent(TakeAway.this, DaftarMenu.class);
        startActivity(intent);
    }
}
