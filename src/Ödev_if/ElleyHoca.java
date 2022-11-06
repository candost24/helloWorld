package Ödev_if;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElleyHoca {
    public static void main(String[] args) {
        /*
        * kullanıcıdan istenilen boyutta random sayı
        * alarak bir liste olusturunuz ve bu listedeki tum cift sayıların carpımını return eden bir method yazınız
        * */
      ArrayList<Integer> a = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen istediğiniz boyutta sayı giriniz");
int range=sc.nextInt();

        for (int i=1;i<=range;i++){
            a.add((int)(Math.random()*100));

        }
        System.out.println("list:"+a);
        System.out.println(sayiCarp(a));
                  }

public static int sayiCarp(ArrayList<Integer>a) {
    int count=1;
int topla=0;
    for (int degisken:a){
       if(degisken%2==0){
           count*=degisken;
           topla+=count;
       }
    }

    return topla;
}


}
















