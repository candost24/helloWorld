package L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task12  {
    public static void main(String[] args) {

        /*
         task-> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin topaplamının
         hesap eden code create ediniz



        * */

        Scanner sc=new Scanner(System.in);
        System.out.println("5 sayı giriniz");
        int toplam=0;// ik değeri 0 olan toplama etki etmeyecek bir variable ...




for (int i=0 ;i<=5 ;i++){
    System.out.println(i+"sayıyı giriniz:");
    int sayı=sc.nextInt();
    if(sayı<=10 || sayı>=20){
        toplam+=sayı;
    }



}

        System.out.println("girdiğiniz sayıların istenen şartla toplamı"+toplam);




    }
}
