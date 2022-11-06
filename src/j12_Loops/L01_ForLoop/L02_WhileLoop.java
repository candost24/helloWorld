package j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class L02_WhileLoop {
    public static void main(String[] args) {

 /*
        başlangıç ve bitiş değerleri net(bilinen değerler) olan tekrarlarda foor loop
        ama adım sayısı belli olmayıp bir şarta(duruma) bağlı olan tekrarlarda while lopp kullanılmalı
         */
        // task01-> 11 den 20'ye kadar olan tamasayıları print eden code create ediniz..

        int i=11;
        while (i<=20){


            System.out.println(i+"tamasayılar");
            i++;

        }
        //task02-> 7 kere javaCAN print eden code create ediniz.

int b=1;
        while (b<8){
            System.out.println(b+"javacan");
            b++;
        }

// task03-> 2 basamaklı tek sayıları yanyana print eden code create ediniz
b=11;
        while (b<100){
            System.out.println(b+" ");
            b+=2;
        }

      //task04-> girilen metni while loop ile tersden print eden code create ediniz

        System.out.println("*** task 04****");
        Scanner sc=new Scanner(System.in);
        System.out.println("bir metin giriniz : ");
        String  metin= sc.nextLine();
        int metinUzunluk=metin.length();

        while (metinUzunluk>=1){//metnin uzunlugu 0 a eşit ve buyuk iken
            System.out.print(metin.charAt(metinUzunluk-1));//
            metinUzunluk--;

        }

// task05-> girilen sayıya kadar toplamını  print eden code creat ediniz.

        System.out.println("AGAM nassıng:) birtamsayı giriniz:");
        int sayi=sc.nextInt();
        int toplam=0;
        while (sayi>0){//sayı 1 olana dek
            toplam+=sayi;// her döngüde sayıyı toplama ekle
            sayi--;// herdöngüde sayıyı 1 azalt ki döngü döndükçe dönmesin
        }
        System.out.println("agam girdiğin sayılar toplamı:"+toplam);

// task06->girilen

        int faktoriyel = 1;

        while (sayi > 0) {// sayı 1 olana dek body de ne varsa yap
            faktoriyel *= sayi;// her döngüde sayıyı toplama ekle
            sayi--;// her döngüde sayıyı 1 azalt ki dünta döndükçe dönmesin.!!
        }
        System.out.println("agam girdigin sayılar faktoriyeli : " + faktoriyel);




    }
}
