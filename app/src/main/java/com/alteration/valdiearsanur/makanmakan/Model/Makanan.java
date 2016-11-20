package com.alteration.valdiearsanur.makanmakan.Model;

/**
 * Created by valdiearsanur on 16/10/2016.
 */

public class Makanan {

    private int id;
    private int gambar;
    private String nama;
    private String deskripsi;
    private String resep;
    private String caraMasak;
    private float ratingPopuler;
    private float ratingRasa;

    public Makanan(int idnya, int gambarnya, String namanya, String deskripsinya, String resepnya, String caranya, float rating_rasanya, float rating_populernya) {
        id = idnya;
        gambar = gambarnya;
        nama = namanya;
        deskripsi = deskripsinya;
        resep = resepnya;
        caraMasak = caranya;
        ratingPopuler = rating_rasanya;
        ratingRasa = rating_populernya;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDrawable() {
        return gambar;
    }

    public void setDrawable(int gambar) {
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getResep() {
        return resep;
    }

    public void setResep(String resep) {
        this.resep = resep;
    }

    public String getCaraMasak() {
        return caraMasak;
    }

    public void setCaraMasak(String caraMasak) {
        this.caraMasak = caraMasak;
    }

    public float getRatingPopuler() {
        return ratingPopuler;
    }

    public void setRatingPopuler(float ratingPopuler) {
        this.ratingPopuler = ratingPopuler;
    }

    public float getRatingRasa() {
        return ratingRasa;
    }

    public void setRatingRasa(float ratingRasa) {
        this.ratingRasa = ratingRasa;
    }
}
