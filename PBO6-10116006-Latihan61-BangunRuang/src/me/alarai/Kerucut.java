package me.alarai;

public class Kerucut extends BangunRuang{

    private double jari,tinggi;

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return (Math.PI * (jari * jari) * tinggi) / 3;
    }
}
