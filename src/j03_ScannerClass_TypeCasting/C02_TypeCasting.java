package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {

           /*
 byte < short < int < long < float < double
   Auto Widening Casting -> Kucuk data type'larini buyuk data typlearina
Java  otomatik olarak yapar.

 */
        boolean basarılı=true;
        //String basarı=basarılı;->




        double d=17;//double varible'a int 17 atandı k->
        System.out.println("d="+d);
        int sayi1=33;
        int sayi2=7;
        System.out.println(sayi1/sayi2);// 4
        /*
        java iki int sayiyi biribirine böldugunuzde sonucu int verir
         eğer bölme işleminde ondalık sonuç çıkarsa ondalık kısmı siler
         */

        byte b=127;
        int i=b;//k-> aw
        System.out.println("i="+i);//127
         int num=1453;
         double d1=num;//k->b aw
        // double->b    int->k
/*
 byte < short < int < long < float < double
 Explicit Narrowing Casting ->Buyuk data type'larini kucuk data type'larina cevirme islemini veri kaybndan dolayı
 Java otomatik olarak yapmaz. kod ile teyit ister...

 */
        double d2=14.53;
        int num2= (int) d2;//b->
        System.out.println("num2="+num2);
        int num3=150;
        byte b1=(byte) num3;
        System.out.println("b1="+b1);


    /* task->
     * Kullanicidan bir character girmesini isteyin ve
     * girilen karakteri ve ascii degerini yazin
     *
     * Ornek : Input  : a
     *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
     *
     *
     */
    Scanner sc=new Scanner(System.in);//1.adım
    System.out.println("ascii değeri istediğin karakteri gir:");//2 adım
    char ch=sc.nextLine().charAt(0);
    int chasciiDegeri=ch;
System.out.println(ch+"'ın chasciiDegeri = " + chasciiDegeri);//$'ın chasciiDegeri = 36
    // TASK ->
    int k = 5;

    int sonuc = ++k + k++ + k++ + --k + k-- + k;
		System.out.println("sonuc = " + sonuc);
        System.out.println("k = " + k);

}
}


