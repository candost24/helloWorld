package j08_İfstaement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatemant {
    public static void main(String[] args) {
        /*TASK-> girilen yaşımn 18 den büyüklüğnü  kontrol eden  code create ediniz.
        */
        Scanner sc=new Scanner(System.in);
        System.out.println("yasınızı giriniz :");
        int yas=sc.nextInt();
      // if (yas>18){
      //     System.out.println("yasınız 18 den büyük");

            /*TASK-> girilen yaşımn 18 den büyüklüğnü  kontrol eden  code create ediniz.
            18 yaşındanb küçükse ehliyet alamazsınız print ediniz.
             */
        if (yas >= 18) {// verilen yaşın 18den büyük ve eşit olamasını kontrel eder
            System.out.println("yasınız 18 den küçük değil");
       System.out.println("ehliyet alamazsınız");
        }



    }
}
