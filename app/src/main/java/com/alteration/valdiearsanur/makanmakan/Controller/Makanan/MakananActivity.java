package com.alteration.valdiearsanur.makanmakan.Controller.Makanan;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.alteration.valdiearsanur.makanmakan.MakanMakan;
import com.alteration.valdiearsanur.makanmakan.Model.Makanan;
import com.alteration.valdiearsanur.makanmakan.R;

import java.util.ArrayList;
import java.util.List;

public class MakananActivity extends AppCompatActivity {

    private int indeks;
    private Makanan makanan;
    private DeskripsiFragment fragment_deskripsi;
    private ResepFragment fragment_resep;
    private CaramasakFragment fragment_caramasak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        Intent intent = getIntent();
        indeks = intent.getIntExtra("indeksnya", 0);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarnya);
        setSupportActionBar(toolbar);
        setupViewPager();
    }

    private void setupViewPager() {
        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpagernya);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        makanan = getMakanan(indeks);

        fragment_deskripsi = new DeskripsiFragment();
        fragment_deskripsi.setDeskripsi(makanan.getDeskripsi());

        fragment_resep = new ResepFragment();
        fragment_resep.setResep(makanan.getResep());

        fragment_caramasak = new CaramasakFragment();
        fragment_caramasak.setCaraMasak(makanan.getCaraMasak());

        adapter.addFrag(fragment_deskripsi, "Deskripsi");
        adapter.addFrag(fragment_resep, "Resep");
        adapter.addFrag(fragment_caramasak, "Cara Masak");

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabnya);
        tabLayout.setupWithViewPager(viewPager);
    }

    private Makanan getMakanan(int indeks) {
        return  ((MakanMakan) this.getApplication()).getMakanannya(indeks);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    static class ViewPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
