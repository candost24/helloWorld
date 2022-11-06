package j10_StringManipılantınıos;

public class C09_Replace_ReplaceAll {
    public static void main(String[] args) {

        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini (update -set) saglar. Sonuc String'dir..
         *

         */

        String str="java canlara selam olsun java ile bolcana offer";
        System.out.println( str.replace('a','@'));//j@v@ c@nl@r@ sel@m olsun j@v@ ile bolc@n@ offer
        /** ReplaceFirst
         * Replace ile aynı sadece ilk bulunanı değiştirir
         */
        System.out.println( str.replaceFirst("a","@"));


// replaceAll() method u replace() methoduna benzer ama 2 fark vardır
//1-replace() methodu char kabul eder ama replaceAll kabul etmez
//2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)
        //(Regular Expressions)
//   \\s bosluk (
//   \\S bosluk disindaki tum karakterler
//   \\w harfler ve rakamlar (a z A Z, 0 9)
//   \\W harfler ve rakamlar disindaki tum karakterler
//   \\d rakamlar 0 9
//   \\D rakamlar disindaki tum karakterler


        str="javaCanlara selam olsun :) java ile 123455544 offer ***";
        System.out.println(str.replaceAll("\\s",  "+"));
        System.out.println(str.replaceAll("\\S",  "+"));
        System.out.println(str.replaceAll("\\w",  "+"));
        System.out.println(str.replaceAll("\\W",  "+"));
        System.out.println(str.replaceAll("\\d",  "+"));
        System.out.println(str.replaceAll("\\D",  "+"));
/*
* task girilen ismini  ve 16 haneli kredi karetı no bigilerini aşagıdaki formatta print eden code create ediniz
* isim soyisim:M**** B******
* kart no:**** **** **** 1234
* 
*  */
String isim="çiğdem";
String soyad="şen";
String kartNo="12345678987654321l";
String yeniisim=isim.charAt(0)+isim.substring(1).replaceAll("\\w","*");
String yeniSoyisim=isim.charAt(0)+isim.substring(1).replaceAll("\\w","*");
String yeniKartNO="**** **** **** ****"+kartNo.substring(2);
        System.out.println("isim-soyisim:"+yeniisim+""+yeniSoyisim+" kart no:"+yeniKartNO);









    }
}
