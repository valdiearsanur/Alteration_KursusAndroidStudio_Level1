package com.alteration.valdiearsanur.pertemuan7.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.alteration.valdiearsanur.pertemuan7.Model.ListMakanan;
import com.alteration.valdiearsanur.pertemuan7.Model.Makanan;
import com.alteration.valdiearsanur.pertemuan7.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public MainActivity thisActivity;
    private ListView listViewMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thisActivity = this;
        listViewMakanan = (ListView) findViewById(R.id.list_makanan);

        List<Makanan> semua_makanan = ListMakanan.getInstance().getMakanannya();

        ArrayList<String> makananList = new ArrayList<String>();
        for(int i=0; i < semua_makanan.size(); i++) {
            makananList.add(semua_makanan.get(i).getNama());
        }

        ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this, R.layout.layout_list, R.id.Itemname, makananList);
        listViewMakanan.setAdapter(listAdapter);


        listViewMakanan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(thisActivity, MakananActivity.class);
                intent.putExtra("indeksnya", position);
                startActivity(intent);
            }
        });
    }
}
