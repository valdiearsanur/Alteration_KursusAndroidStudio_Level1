package com.alteration.valdiearsanur.pertemuan6a;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    MainActivity thisActivity;
    EditText name, age, height, email, phone;
    RadioGroup gender;
    RadioButton selected_gender;
    Spinner country;
    Button register;

    String namenya, gendernya, emailnya, phonenya, countrynya;
    int agenya;
    float heightnya;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout parent = (RelativeLayout) findViewById(R.id.activity_main);

        thisActivity = this;

        name = (EditText) parent.findViewById(R.id.name);
        age = (EditText) parent.findViewById(R.id.age);
        height = (EditText) parent.findViewById(R.id.height);
        email = (EditText) parent.findViewById(R.id.email);
        phone = (EditText) parent.findViewById(R.id.phone);
        gender = (RadioGroup) parent.findViewById(R.id.gender_group);
        country = (Spinner) parent.findViewById(R.id.country);
        register = (Button) parent.findViewById(R.id.register);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R .array.item_countries, android.R.layout.simple_spinner_dropdown_item);
        country.setAdapter(adapter);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gender.getCheckedRadioButtonId() == -1) {
                    Snackbar.make(v, "Form tidak boleh kosong", Snackbar.LENGTH_LONG).show();
                    return;
                }

                selected_gender = (RadioButton) findViewById(gender.getCheckedRadioButtonId());

                namenya = name.getText().toString();
                gendernya = selected_gender.getText().toString();
                agenya = Integer.parseInt(age.getText().toString());
                heightnya = Float.parseFloat(height.getText().toString());
                emailnya = email.getText().toString();
                phonenya = phone.getText().toString();
                countrynya = country.getSelectedItem().toString();

                if(!(namenya == "" || gendernya == "" || agenya == 0 || heightnya == 0f || emailnya == "" || phonenya == "")) {
                    Intent intent = new Intent(thisActivity, HasilActivity.class);
                    intent.putExtra("namenya", namenya);
                    intent.putExtra("gendernya", gendernya);
                    intent.putExtra("heightnya", heightnya);
                    intent.putExtra("agenya", agenya);
                    intent.putExtra("emailnya", emailnya);
                    intent.putExtra("phonenya", phonenya);
                    intent.putExtra("countrynya", countrynya);

                    startActivityForResult(intent, 0);
                } else {
                    Snackbar.make(v, "Form tidak boleh kosong", Snackbar.LENGTH_LONG).show();
                }
            }
        });
    }
}
