package com.alteration.valdiearsanur.pertemuan6a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {


    TextView name, gender, age, height, email, phone, country;

    String namenya, gendernya, emailnya, phonenya, countrynya;
    int agenya;
    float heightnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        LinearLayout parent = (LinearLayout) this.findViewById(R.id.activity_hasil);

        name = (TextView) parent.findViewById(R.id.name);
        gender = (TextView) parent.findViewById(R.id.gender);
        age = (TextView) parent.findViewById(R.id.age);
        height = (TextView) parent.findViewById(R.id.height);
        email = (TextView) parent.findViewById(R.id.email);
        phone = (TextView) parent.findViewById(R.id.phone);
        country = (TextView) parent.findViewById(R.id.country);

        namenya = getIntent().getStringExtra("namenya");
        gendernya = getIntent().getStringExtra("gendernya");
        agenya = getIntent().getIntExtra("agenya", 0);
        heightnya = getIntent().getFloatExtra("heightnya", 0f);
        emailnya = getIntent().getStringExtra("emailnya");
        phonenya = getIntent().getStringExtra("phonenya");
        countrynya = getIntent().getStringExtra("countrynya");

        name.setText(namenya);
        gender.setText(gendernya);
        age.setText(String.valueOf(agenya));
        height.setText(String.valueOf(heightnya));
        email.setText(emailnya);
        phone.setText(phonenya);
        country.setText(countrynya);

    }
}
