package homeWork;

import java.util.Scanner;

public class _14_ComparisonOperators_bigger {

    public static void main(String[] args) {

     /*   Bir integer oluşturun ve değeri 13 olsun.
                Başka bir integer daha oluşturun ve değeri 10 olsun.
                Print kodunun içine Ilk int ,ikinci int'ten büyüktür yazın. (>,< simgeleri ile)
                Console' da 'true' yazısını görmelisiniz.        */

        //Kodu aşağıya yazınız.


        /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
         * bir method create ediniz.
         *
         *  getAsalMi(int sayi)
         *  	return true/false

         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz ");
        int getAsalMi = sc.nextInt();
        if (asalMi(getAsalMi)) {
            System.out.println("girilen sayı asal bir sayıdır.");

        } else {
            System.out.println("girilen sayı asal bir sayı değildir.");

        }

    }

    public static boolean asalMi(int getAsalMi) {
        int sayac = 0;
        for (int i = 2; i < getAsalMi; i++) {
            if (getAsalMi % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
            return true;
        } else {
            return false;
        }


    }
}