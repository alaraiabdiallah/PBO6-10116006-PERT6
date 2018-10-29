package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program menghitung bangun ruang
 * */
public class Main {

    public static void main(String[] args) {

        Bola bola = new Bola();
        bola.setJari(7);
        System.out.println("Bangun Ruang : Bola");
        System.out.println("Jari - jari bola : "+bola.getJari());
        System.out.println("Hasil V : "+String.format("%.1f",bola.hitungVolume()));
        System.out.println();

        Tabung tabung = new Tabung();
        tabung.setJari(10);
        tabung.setTinggi(21);

        System.out.println("Bangun Ruang : Tabung");
        System.out.println("Jari - jari tabung : "+tabung.getJari());
        System.out.println("Tinggi tabung : "+tabung.getTinggi());
        System.out.println("Hasil V : "+String.format("%.0f",tabung.hitungVolume()));
        System.out.println();

        Kerucut kerucut = new Kerucut();
        kerucut.setJari(14);
        kerucut.setTinggi(9);

        System.out.println("Bangun Ruang : Kerucut");
        System.out.println("Jari - jari kerucut : "+kerucut.getJari());
        System.out.println("Tinggi kerucut : "+kerucut.getTinggi());
        System.out.println("Hasil V : "+String.format("%.0f",kerucut.hitungVolume()));

    }
}
