package com.example.android.ramadhan_1202144104_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        Toast.makeText(getApplicationContext(), "Ramadhan Hadiatma_1202144104", Toast.LENGTH_LONG).show();

        final RadioGroup rRadio = (RadioGroup) findViewById(R.id.radio);
        Button bButton = (Button) findViewById(R.id.pesan);
        bButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = rRadio.getCheckedRadioButtonId();
                switch (id){
                    case R.id.dinein:
                        Intent intent = new Intent(MenuUtama.this, DineIn.class);
                        startActivity(intent);

                        Toast.makeText(getApplicationContext(),"Dine In",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.takeaway:
                        Intent intent1 = new Intent(MenuUtama.this, TakeAway.class);
                        startActivity(intent1);

                        Toast.makeText(getApplicationContext(),"Take Away",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

}
