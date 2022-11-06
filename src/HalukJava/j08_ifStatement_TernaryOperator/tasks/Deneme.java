package HalukJava.j08_ifStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */
Scanner sc=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayi=0;
        int toplam=0;
while (sayi<=333){
    toplam=toplam+sayi;
    sayi++;
}
        System.out.println("Girilen sayı= "+sayi+"  Girilen sayıların toplamı: "+toplam);

/*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        System.out.println("lütfen birinci sayiyi giriniz");
        int başlangıç,bitiş,top=0;
        System.out.println("başlangıç saysıını lütfen giriniz");
        başlangıç=sc.nextInt();
        System.out.println("lütfen bitiş sayısını giriniz");
        bitiş=sc.nextInt();
        int[] sayılar=new int[bitiş];
        for (int i=başlangıç ; i<bitiş ; i++){
            sayılar[i]=sc.nextInt();
            top +=i;



        }

        System.out.println("girilen sayıların arasındaki sayıların toplamı: "+toplam);

//TASK03 girilen  tamsayı için carpim tablosunu print eden code create ediniz.
        //13x1=13 13X2=26 .......... 13x10=130


        System.out.println("lütfen bir sayı giriniz");
        int çrpmSyı=sc.nextInt();

        int çrpm=1;
        while (çrpm<10){
            System.out.println(çrpmSyı+"* "+çrpm+"="+çrpmSyı*çrpm);
            çrpm++;
        }

	/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */

int s1=999;
int s2=0;
        System.out.println("3 basamklı 4ve 6 ya tam bülünen sayılar");

while (s2<=s1){
    if (s1%4==0  &&  s2%6==0){
        System.out.println(s1+" ");


        s2--;
}

    System.out.println(s2+"adettir");

    }











}
}
