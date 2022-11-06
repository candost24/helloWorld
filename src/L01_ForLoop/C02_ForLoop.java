package L01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

// task -> girilen sayıdan 100 e kadar 4 un katı tamsayıları print eden code create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
        int sayi=sc.nextInt();


        if(sayi>100) {
            System.out.println("agam hani 100 den küçük girecektin:(");
        }else {
        for (int i=0; i<100; i++){//100 değeri for u çalıştırmaz,98 for u çalıştırır ama for içideki if i çaLışMAZ
            if (i%4==0){
                System.out.println(i+" ");
            }
        }





    }
}
}
