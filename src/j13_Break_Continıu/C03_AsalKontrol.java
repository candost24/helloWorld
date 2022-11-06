package j13_Break_Continıu;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("AGAm bir sayı giresen :");
        int sayi= sc.nextInt();
        boolean asalMi=true;

        for (int i=2 ; i<sayi; i++){
            if (sayi%i==0){// eğer sayi kendisine kadar olan sayılara tam bölünüyorsa
                asalMi=false;
                break;
            }
        }
if (asalMi){
    System.out.println("girilen sayı ASAL");
}else System.out.println("girilen sayı asal DEĞİL");







    }
}
