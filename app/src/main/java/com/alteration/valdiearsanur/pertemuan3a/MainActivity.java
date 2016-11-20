package com.alteration.valdiearsanur.pertemuan3a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText input_tinggi, input_berat;
    private TextView text_bmi, text_hasil;
    private Button button_hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_tinggi = (EditText) findViewById(R.id.input_tinggi);
        input_berat = (EditText) findViewById(R.id.input_berat);

        text_bmi = (TextView) findViewById(R.id.text_bmi);
        text_hasil = (TextView) findViewById(R.id.text_hasil);

        button_hitung = (Button) findViewById(R.id.button_hitung);


        button_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float tinggi = Float.parseFloat(input_tinggi.getText().toString()) / 100;
                float berat = Float.parseFloat(input_berat.getText().toString());

                float hasil = berat / (2*tinggi);

                text_bmi.setText(String.valueOf(hasil));

                if(hasil <= 17) {
                    text_hasil.setText("Under Weight");
                } else if(hasil >= 18 && hasil <= 24) {
                    text_hasil.setText("Normal Weight");
                } else if(hasil >= 25 && hasil <= 27) {
                    text_hasil.setText("Over Weigeth");
                }  else {
                    text_hasil.setText("Obesitas");
                }
            }
        });

    }
}
