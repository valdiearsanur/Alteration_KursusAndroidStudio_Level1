package com.alteration.valdiearsanur.pertemuan3;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] fakta_seru;
    String[] colors;

    Random random_generator;
    int current_indeks;

    RelativeLayout layout_main;
    TextView label_title, label_fakta;

    Button button_generate, button_hide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fakta_seru = new String[] {
            "Copy paste pada komputer pertama kali ditemukan oleh Larry Tesler",
            "Kantor pertama Google adalah Garasi Mobil",
            "Koran cetak pertama yang bisa dibaca adalah Colombus Dispatch"
        };
        colors = new String[] {
            "#ff0099cc",
            "#FFAA66CC",
            "#FFAA1D15"
        };

        layout_main = (RelativeLayout) findViewById(R.id.activity_main);
        label_title = (TextView) findViewById(R.id.label_title);
        label_fakta = (TextView) findViewById(R.id.label_fakta);
        button_generate = (Button) findViewById(R.id.button_generate);
        button_hide = (Button) findViewById(R.id.button_hide);

        label_title.setText("Fakta Seru!");
        label_fakta.setText("");
        button_generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generate_fakta();
            }
        });

        button_hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hide_fakta();
            }
        });
    }

    private void generate_fakta() {
        random_generator = new Random();
        int max_indeks = fakta_seru.length;

        int indeks = random_generator.nextInt(max_indeks);
        while(indeks == current_indeks)
            indeks = random_generator.nextInt(max_indeks);

        current_indeks = indeks;

        label_title.setText("Tahukah kamu ?");
        label_fakta.setText(fakta_seru[indeks]);
        layout_main.setBackgroundColor(Color.parseColor(colors[indeks]));
    }

    private void hide_fakta() {
        label_title.setText("Fakta seru !");
        label_fakta.setText("Mau tau apa saja fakta-fakta seru ?");
    }
}
