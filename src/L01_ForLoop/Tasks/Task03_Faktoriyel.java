package L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task03_Faktoriyel {
    public static void main(String[] args) {
        /*
        * Task-> girilen sayının faktoriyelini hesaplayan method creat ediniz
        * sayi!=1*2*3*4*.....*sayi
        * */
        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
        int sayi=sc.nextInt();
        System.out.println(faktoriyel(sayi));// int parametreli method call



    }
    private static int faktoriyel(int sayi){

        int faktoriyel=1;
        for (int i=1; i<=sayi; i++){
            faktoriyel*=i;
        }
        return faktoriyel;
    }



}
