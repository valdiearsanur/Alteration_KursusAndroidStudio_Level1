package com.alteration.valdiearsanur.pertemuan7.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by valdiearsanur on 11/8/2016.
 */
public class ListMakanan {
    private static ListMakanan ourInstance = new ListMakanan();

    public static ListMakanan getInstance() {
        return ourInstance;
    }

    private List<Makanan> makanannya;

    // get all
    public List<Makanan> getMakanannya() {
        return makanannya;
    }

    // set all
    public void setMakanannya(List<Makanan> makanannya) {
        this.makanannya = makanannya;
    }

    // get by id
    public Makanan getMakanannyaById(int id) {
        if(id < 0 || id >= makanannya.size()) return makanannya.get(0);

        return makanannya.get(id);
    }

    private ListMakanan() {
        makanannya = new ArrayList<Makanan>();

        makanannya.add(new Makanan(
                "Soto",
                "Soto, sroto, sauto, tauto, atau coto adalah makanan khas Indonesia seperti sop yang terbuat dari kaldu daging dan sayuran. Daging yang paling sering digunakan adalah daging sapi dan ayam, tetapi ada pula yang menggunakan daging babi atau kambing. Berbagai daerah di Indonesia memiliki soto khas daerahnya masing-masing dengan komposisi yang berbeda-beda, misalnya soto Madura, soto Kediri, soto Lamongan, soto Jepara, soto Semarang, soto Kudus, soto Betawi, soto Padang, soto Bandung, sroto Sokaraja, soto Banjar, soto Medan, dan coto Makassar. Soto juga dinamai menurut kandungannya, misalnya soto ayam, soto babat, dan soto kambing.\n\n"+
                        "Cara penyajian soto berbeda-beda sesuai kekhasan di setiap daerah. Soto biasa dihidangkan dengan nasi, lontong, ketupat, mi, atau bihun disertai berbagai macam lauk, misalnya kerupuk, perkedel, emping, sambal, dan sambal kacang. Ada pula yang menambahkan telur puyuh, sate kerang, jeruk limau, dan koya."
        ));

        makanannya.add(new Makanan(
                "Rendang",
                "Rendang atau randang adalah masakan daging bercita rasa pedas yang menggunakan campuran dari berbagai bumbu dan rempah-rempah. Masakan ini dihasilkan dari proses memasak yang dipanaskan berulang-ulang dengan santan kelapa. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga kering dan berwarna hitam pekat. Dalam suhu ruangan, rendang dapat bertahan hingga berminggu-minggu. Rendang yang dimasak dalam waktu yang lebih singkat dan santannya belum mengering disebut kalio, berwarna coklat terang keemasan.\n\n"+
                        "Rendang dapat ditemukan di Rumah Makan Padang di seluruh dunia. Masakan ini populer di kalangan masyarakat Indonesia dan negara-negara di Asia Tenggara, seperti Malaysia, Singapura, Brunei, Filipina, dan Thailand. Di daerah asalnya, Minangkabau, rendang disajikan dalam berbagai upacara adat dan perhelatan istimewa. Meskipun rendang merupakan masakan tradisional Minangkabau secara umum, masing-masing daerah di Minangkabau memiliki teknik memasak dan penggunaan bumbu yang berbeda."
        ));
    }


}
