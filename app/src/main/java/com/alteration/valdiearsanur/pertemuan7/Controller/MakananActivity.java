package com.alteration.valdiearsanur.pertemuan7.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.alteration.valdiearsanur.pertemuan7.Model.ListMakanan;
import com.alteration.valdiearsanur.pertemuan7.Model.Makanan;
import com.alteration.valdiearsanur.pertemuan7.R;

public class MakananActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        int indeks = intent.getIntExtra("indeksnya", 0);

        Makanan makan = ListMakanan.getInstance().getMakanannyaById(indeks);

        setTitle(makan.getNama());

        View content = (View) findViewById(R.id.content);
        TextView text_deskripsi = (TextView) content.findViewById(R.id.text_makanan);
        text_deskripsi.setText(makan.getDeskripsi());

    }
}
