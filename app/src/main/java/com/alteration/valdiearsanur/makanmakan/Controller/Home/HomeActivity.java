package com.alteration.valdiearsanur.makanmakan.Controller.Home;

import com.alteration.valdiearsanur.makanmakan.Controller.Makanan.MakananActivity;
import com.alteration.valdiearsanur.makanmakan.Model.Makanan;
import com.alteration.valdiearsanur.makanmakan.MakanMakan;
import com.alteration.valdiearsanur.makanmakan.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private ListView listViewKota;
    private ArrayAdapter<String> listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        listViewKota = (ListView) findViewById(R.id.listview_kota);

        ArrayList<String> cityList = new ArrayList<String>();
        for(int i=0; i < getMakananLength(); i++) {
            cityList.add(getMakanan(i).getNama());
        }

        listAdapter = new ArrayAdapter<String>(this, R.layout.layout_list, R.id.Itemname, cityList);
        listViewKota.setAdapter(listAdapter);


        listViewKota.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Object o = listViewKota.getItemAtPosition(position);
                String str=(String)o; //As you are using Default String Adapter

                Toast.makeText(
                        getBaseContext(),
                        getMakanan(position).getNama(),
                        Toast.LENGTH_SHORT
                ).show();

                pindahActivity(position);
            }
        });
    }

    private void pindahActivity(int indeks) {
        Intent intent = new Intent(this, MakananActivity.class);
        intent.putExtra("indeksnya", indeks);
        startActivity(intent);
    }

    private int getMakananLength() {
        return  ((MakanMakan) this.getApplication()).getLength();
    }

    private Makanan getMakanan(int indeks) {
        return  ((MakanMakan) this.getApplication()).getMakanannya(indeks);
    }
}
