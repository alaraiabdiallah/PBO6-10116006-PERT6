package me.alarai;

public class Bola extends BangunRuang{


    private double jari;

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double hitungVolume() {
        return (4 * Math.PI * (jari * jari * jari))/3;
    }
}
