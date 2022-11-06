package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass
{
    public static void main(String[] args) {
       // Scanner scan=new Scanner(System.in);//Scanner classından scan isminde  değerini System içinden olan

        //2 adım->Kullanıcıdan istenen veri için bildirimde bulunur->("...");
       // System.out.println("adınzı giriniz:");
        //3 adım->kullanıcının girdiği veri data type'ne göre  bir variable atanır.
       //String isim=scan.nextLine();
      //  System.out.println("isim="+isim);

        //Scanner sc=new Scanner(System.in);//1.ADIM
       // System.out.println("karenin kenarı giriniz");//2.adım

        System.out.println("günlük içtiğiniz çay sayısını giriniz:");
        Scanner sc = new Scanner(System.in);//1. adım
        System.out.println("isminiz giriniz : ");//2. adım
        // char ch = sc.nextLine().charAt(0);// kullanıcıdan gelen string ifadenin 0. index ilk  karakteririni alır
        // System.out.println("isminizin ilk karakteri :" + ch);
        // String isim=sc.nextLine();//kullanıcını girdiği tüm satırı isim'e atar
        String ad = sc.next();//kullanıcını girdiği ilk ifadeyi  ad'e atar
        System.out.println("ad = " + ad);
        // System.out.println("isim = " + isim);


         }



    }

