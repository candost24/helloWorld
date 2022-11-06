package j10_StringManipılantınıos;

import java.util.Scanner;

public class C06_SubString {
    public static void main(String[] args) {




        /*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */

         String str="java bielenin sırtı yere gelmez :) ";

        System.out.println(str.substring(10));
//str datasının son 10 karakterini print ediniz
        System.out.println(str.substring(str.length()-10));
  // il 10 karakterini print ediniz...
        System.out.println(str.substring(0,10));
//str datasının ilk  karakteriniz bulunuz...
        System.out.println(str.substring(0,1));
//girilen dört harfli kelimeyi print ediniz..
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen dört harfli kelime girinzi");
        String kelime=scan.next();
        if (kelime.length()!=4){
            System.out.println("agam sana dört harli gir demedikmi");
        }else {
            System.out.println(kelime.substring(kelime.length()-1));//e
            System.out.println(kelime.substring(2,3));//l
            System.out.println(kelime.substring(1,2));//a
            System.out.println(kelime.substring(0,1));//h



        }










    }
}
