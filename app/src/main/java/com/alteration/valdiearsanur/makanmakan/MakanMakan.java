package com.alteration.valdiearsanur.makanmakan;

import android.app.Application;

import com.alteration.valdiearsanur.makanmakan.Model.Makanan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by valdiearsanur on 18/10/2016.
 */

public class MakanMakan extends Application {

    private List<Makanan> makanannya;
    public int getLength() {
        return  makanannya.size();
    }

    public Makanan getMakanannya(int indeks) {
        if(indeks >= 0 && indeks < makanannya.size()) {
            return makanannya.get(indeks);
        } else {
            return null;
        }
    }

    public MakanMakan() {
        makanannya = new ArrayList<Makanan>();

        // makanan 1
        makanannya.add(
                new Makanan(
                        1,

                        R.drawable.soto_betawi_1,

                        "Soto Betawi",

                        "Soto Betawi merupakan soto yang populer di daerah Jakarta. Seperti halnya soto Madura dan soto sulung, soto Betawi juga menggunakan jeroan. Selain jeroan, seringkali organ-organ lain juga disertakan, seperti mata, terpedo, dan juga hati.\n\n"+
                        "Istilah soto Betawi hadir dalam kuliner masakan Indonesia sekitar tahun 1977-1978, namun bukan bearti tidak ada soto sebelum tahun tersebut. Yang memopulerkan dan yang pertama memakai kata soto Betawi adalah penjual soto bernama Lie Boen Po di THR Lokasari / Prinsen Park, tentunya dengan ciri khas cita rasa sendiri.\n\n"+
                        "Banyak penjual soto pada masa tahun-tahun tersebut, biasanya menyebut dengan soto kaki Pak \"X\" atau sebutan lainnya. Istilah soto Betawi mulai menyebar menjadi istilah umum ketika penjual soto tersebut tutup sekitar tahun 1991.\n\n",

                        "500 gr daging sapi\n"+
                                "Secukupnya air untuk merebus daging\n"+
                                "\nBahan yang dihaluskan/blender :\n"+
                                "6 butir baw merah\n"+
                                "4 siung baw putih\n"+
                                "1/2 sdt jinten\n"+
                                "1 sdt merica\n"+
                                "1/2 ruas jahe\n"+
                                "1/2 ruas kencur\n"+
                                "1 sdm ketumbar\n"+
                                "3 bh kemiri (sangrai dulu)\n"+
                                "\nBahan tambahan :\n"+
                                "3 lbr daun jeruk\n"+
                                "3 lbr daun salam\n"+
                                "1 tangkai sereh\n"+
                                "3 bh bunga lawang\n"+
                                "5 butir kapulaga (saya tdk pakai karena tidak ada dirumah)\n"+
                                "1 bks santan instan 65 ml\n"+
                                "250 ml susu cair\n"+
                                "1 bh tomat\n"+
                                "3 bh kentang\n"+
                                "\nBahan untuk membuat sambal :\n"+
                                "10 bh cabe kriting\n"+
                                "8 bh cabe rawit\n"+
                                "3 butir baw merah\n"+
                                "2 siung baw putih\n"+
                                "Secukupnya garam dan gula\n",

                        "1. Rebus daging sampai empuk. Angkat daging, potong kotak-kotak. (Air kaldu jangan dibuang)"+
                                "2. Blender bumbu halus"+
                                "3. Tumis bumbu halus",

                        4.4f,
                        3.4f
                )
        );


        // makanan 2
        makanannya.add(
                new Makanan(
                        2,

                        R.drawable.soto_banjar_1,

                        "Soto Banjar",

                        "Soto Banjar Deskripsi.\n\n",

                        "500 gr daging sapi\n"+
                                "Secukupnya air untuk merebus daging\n"+
                                "\nBahan yang dihaluskan/blender :\n"+
                                "6 butir baw merah\n"+
                                "4 siung baw putih\n"+
                                "1/2 sdt jinten\n"+
                                "1 sdt merica\n"+
                                "1/2 ruas jahe\n"+
                                "1/2 ruas kencur\n"+
                                "1 sdm ketumbar\n"+
                                "3 bh kemiri (sangrai dulu)\n",

                        "1. Rebus daging sampai empuk. Angkat daging, potong kotak-kotak. (Air kaldu jangan dibuang)"+
                                "2. Blender bumbu halus"+
                                "3. Tumis bumbu halus",

                        4.4f,
                        3.4f
                )
        );

        // makanan 2
        makanannya.add(
                new Makanan(
                        3,

                        R.drawable.soto_banjar_2,

                        "Soto Padang",

                        "Soto Padang Deskripsi.\n\n",

                        "500 gr daging sapi\n"+
                                "Secukupnya air untuk merebus daging\n"+
                                "\nBahan yang dihaluskan/blender :\n"+
                                "6 butir baw merah\n"+
                                "4 siung baw putih\n"+
                                "1/2 sdt jinten\n"+
                                "1 sdt merica\n"+
                                "1/2 ruas jahe\n"+
                                "1/2 ruas kencur\n"+
                                "1 sdm ketumbar\n"+
                                "3 bh kemiri (sangrai dulu)\n",

                        "1. Rebus daging sampai empuk. Angkat daging, potong kotak-kotak. (Air kaldu jangan dibuang)"+
                                "2. Blender bumbu halus"+
                                "3. Tumis bumbu halus",

                        4.4f,
                        3.4f
                )
        );
    }
}