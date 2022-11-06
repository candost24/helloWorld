package j08_İfstaement_TernaryOperator;

import java.util.Scanner;

public class Ex05java {
    public static void main(String[] args) {
        /* task-> girilrn iki sayıyı seçilen dört işlemden birine uygulayıp  print eden code creat ediniz*/
        Scanner sc=new Scanner(System.in);

        System.out.print("1. sayıyı giriniz : ");
        double sayi1 = sc.nextDouble();

        System.out.print("2. sayıyı giriniz : ");
        double sayi2 = sc.nextDouble();
        System.out.println("+ için -> 1 seçiniz\n- için ->2 seçiniz\n* için -> 3 seçiniz\n/için-> 4 seçiniz");
        int seçim=sc.nextInt();
        if (seçim==1){
            System.out.println("toplama sonucu : " + sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
    } else if (seçim == 2) {
        System.out.println("cıkarma sonucu : " + sayi1 + "-" + sayi2 + "=" + (sayi1 - sayi2));
    } else if (seçim == 3) {
        System.out.println("carpma sonucu : " + sayi1 + "*" + sayi2 + "=" + (sayi1 * sayi2));
    } else if (seçim == 4) {
        System.out.println("bolme sonucu : " + sayi1 + "/" + sayi2 + "=" + (sayi1 / sayi2));

    } else System.out.println("agam ne istiyon adam akıllı bişey gir işlemini yapalım");



    }

}
