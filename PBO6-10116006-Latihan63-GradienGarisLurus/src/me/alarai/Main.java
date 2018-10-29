package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program Menghitung Gradien Garis Lurus
 * */
public class Main {

    public static void main(String[] args) {
	    Koordinat koor1 = new Koordinat(2,10,5,7);
        System.out.println("Garis yang melalui titik ("+koor1.getX1()+","+koor1.getY1()+") dan" +
                " ("+koor1.getX2()+","+koor1.getY2()+") memiliki gradien sebesar "+koor1.hitungGradien());
        Koordinat koor2 = new Koordinat(5,1,3,12);
        System.out.println("Garis yang melalui titik ("+koor2.getX1()+","+koor2.getY1()+") dan" +
                " ("+koor2.getX2()+","+koor2.getY2()+") memiliki gradien sebesar "+koor2.hitungGradien());
    }
}
