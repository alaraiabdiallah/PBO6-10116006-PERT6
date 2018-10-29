package me.alarai;
/*
 *
 * @author
 * NAMA  : Ala Rai AbdiAllah
 * Kelas : PBO 6
 * NIM   : 10116006
 * Deskripsi Program : Program Living Thing
 * */
public class Main {

    public static void main(String[] args) {
	    Human human = new Human();
	    human.setNama("Ala Rai AbdiAllah");
	    human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
}
