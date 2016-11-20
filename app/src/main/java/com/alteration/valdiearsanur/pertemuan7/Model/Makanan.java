package com.alteration.valdiearsanur.pertemuan7.Model;

/**
 * Created by valdiearsanur on 11/8/2016.
 */

public class Makanan {
    public Makanan(String namanya, String deskripsinya) {
        this.nama = namanya;
        this.deskripsi = deskripsinya;
    }

    private String nama;

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    private String deskripsi;
}
