//Nama  : Kartika Aghni Safitri
//NIM   : 10119249
//Kelas : IF-6
//Tanggal Pengerjaan : 3 Juni 2022

package com.example.utspraktik_if6_10119249_kartikaaghnisafitri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tx_nik, tx_nama, tx_tgl_lahir, tx_jk, tx_hubungan;
    Button btn_ubah, btn_lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tx_nik=(TextView)findViewById(R.id.tx_nik);
        tx_nama=(TextView)findViewById(R.id.tx_nama);
        tx_tgl_lahir=(TextView)findViewById(R.id.tx_tgl_lahir);
        tx_jk=(TextView)findViewById(R.id.tx_jkelamin);
        tx_hubungan=(TextView)findViewById(R.id.tx_Hubungan);

        Intent i = getIntent();
        tx_nik.setText(i.getExtras().getString("Nik"));
        tx_nama.setText(i.getExtras().getString("Nama"));
        tx_tgl_lahir.setText(i.getExtras().getString("Tgl_lahir"));
        tx_jk.setText(i.getExtras().getString("Jk"));
        tx_hubungan.setText(i.getExtras().getString("Hub"));


        btn_lanjut=(Button)findViewById(R.id.lanjut);
        btn_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewDialog alert = new ViewDialog();
                alert.showDialog(MainActivity2.this, "Terima kasih laporan anda membantu kami dalam melakukan penangan kasus secara tepat");
            }
        });

        btn_ubah=(Button)findViewById(R.id.ubah);
        btn_ubah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}
