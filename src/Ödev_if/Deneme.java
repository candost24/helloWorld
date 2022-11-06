package Ödev_if;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
  /*
        0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen  sayıları print eden coode create edinz.


         */
for (int i=1 ; i<100 ; i++){
    if (i%5==0 && i%4==0){
        System.out.println(" "+i);



            }
        }

 /*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */

Scanner sc=new Scanner(System.in);
     System.out.println("lütfen bir string giriniz");
     String str=sc.nextLine();
     rakamKrktToplam(str);


 }
 private static void rakamKrktToplam(String str){
   int rakamToplam=0;
   for (int i=0; i<str.length(); i++ ){

       if(str.charAt(i)>='0'  &&  str.charAt(i)>='9')
       rakamToplam++;
   }
     System.out.println(rakamToplam+"tane rakam");



 /*100'den 0'a kadar bütün tek sayıları yazdırınız.
        99-98-97-96....
        100 ve 0 dahil değildir.*/

        for(int i=1 ; i<100; i+=2){
            System.out.println("sayınız :"+i);
        }
        System.out.println();



//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15

for (int i=1 ;i<5 ;i++){
   int say=i;
   for (int j=0; j<5 ;i++){
       if (j<i){
           System.out.println(say+" ");
           say +=4-j;
       }

       }
   }
        System.out.println("");

/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */

    Scanner sc=new Scanner(System.in);
    System.out.println("lütfen isminizi giriniz giriniz");
    String isim=sc.nextLine();
     System.out.println("lütfen soyismi giriniz");
     String soyİsim=sc.nextLine();
     String isimSoyisim=isim.concat(" "+soyİsim).toUpperCase();
     int başlangıç=0;
     while (başlangıç<isimSoyisim.length()){
         System.out.println(isimSoyisim.charAt(+başlangıç)+" ");
         başlangıç++;
     }

// task-> girilen  5 sayının  en büyüğünü print den code create eediniz

     Scanner num=new Scanner(System.in);
     System.out.println("lütfen 5 tane say giriniz araka arkaya");
     System.out.println("yazdiginiz bu 5 sayinin en buyügünü bulacagız");
     int s=0;
     for (int i=1; i<=5; i++){
         System.out.println("sayıyı giriniz");
         int sayi=num.nextInt();

         if (sayi>s){
             s=sayi;
         }
     }


     System.out.println("girdiğiniz 5 sayı içerisinde en büyüğü: "+s);

     // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.


     Scanner enter=new Scanner(System.in);
     System.out.println("lütfen bir sayı giriniz");
     int numra=enter.nextInt();
     int say=1;
     while (say<=numra){
         System.out.println(say%2==1? say+".":" tek sayı");
         say++;

     }


      /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */

     Scanner top = new Scanner(System.in);
     int nu;
     int toplam=0;

     do{

         System.out.print("Bir Sayı Girin: ");
         nu = top.nextInt();
         toplam+=nu;

     }while(nu != 0);

     System.out.println("Sıfır (0) rakamını giridiğinizde girilen sayılar toplamı : " + toplam);


    // task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
    // do-while lopp

     Scanner kar = new Scanner(System.in);
     char karakter;
     do {
         System.out.print("lütfen bir karekter giriniz : ");
         karakter = kar.next().toLowerCase().charAt(0);
         System.out.println(karakter== 'x'?"jAVATAR":"javaCAN");
     } while (karakter != 'x');




 }





}
