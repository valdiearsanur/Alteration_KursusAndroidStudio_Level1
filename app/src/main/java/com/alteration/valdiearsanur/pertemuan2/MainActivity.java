package com.alteration.valdiearsanur.pertemuan2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView input_idr;
    public TextView hasil_usd;
    public TextView hasil_sgd;

    public Button button_hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_idr = (TextView) findViewById(R.id.text_input_idr);
        hasil_usd = (TextView) findViewById(R.id.text_hasil_usd);
        hasil_sgd = (TextView) findViewById(R.id.text_hasil_sgd);

        button_hasil = (Button) findViewById(R.id.button_hasil);
        button_hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float usd = Float.parseFloat(input_idr.getText().toString()) * 0.000077f;
                float sgd = Float.parseFloat(input_idr.getText().toString()) * 0.00011f;

                hasil_usd.setText(String.valueOf(usd));
                hasil_sgd.setText(String.valueOf(sgd));
            }
        });
    }
}
