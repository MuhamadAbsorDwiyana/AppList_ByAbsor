package com.uts.loginpage;

// Mahasiswa.java

public class Dosen {

    private String nama;
    private String jurusan;
    private int foto;
    private String keterangan;

    public Dosen(String nama, String jurusan, int foto, String keterangan) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.foto = foto;
        this.keterangan = keterangan;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public int getFoto() {
        return foto;
    }

    public String getKeterangan() {
        return keterangan;
    }
}