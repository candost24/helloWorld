package Ödev_if;

import java.util.Scanner;

public class if1_ödev {
    public static void main(String[] args) {
         /*  İki tane int oluşturun. Birinci (1.) int 35. İkinci (2.) int 23.
        Eğer (if) Birinci int, İkinci int'den büyükse "int 1 is greater than 2" yazdırın.
        Eğer (if) Birinci int, İkinci int'den küçükse "int 1 is smaller than 2" yazdırın.  */

        //Kodu aşağıya yazınız.
        Scanner sc = new Scanner(System.in);
        int num1 = 25;
        int num2 = 35;
        if (num1 > num2) {
            System.out.println("int 1 is greater than 2");
        } else {
            System.out.println("int 1 is smaller than 2");
        }
        /*    str1 ve str2 isimli 2 tane String oluşturulmuştur.
          Eğer str1, str2'ye eşit ise "String 1 is equal to String 2" yazdırınız.
          Eğer str1, str2'ye eşit değil ise "String 1 is NOT equal to String 2" */
String  str1="eşitse";
String str2="eşit değilse";
if (str1==str2){
    System.out.println("String 1 is equal to String 2");
}else {
    System.out.println("String 1 is NOT equal to String 2");
}
 /* double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */
double double1=25;
double double2=35;
if (double1>double2){
    System.out.println("double 1 is greater than double");
}else {
    System.out.println("double 1 is smaller than double 2");
}
   /*  90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */
        double db1=90.25;
        double db2=90.25;
        if (db1>db2){
            System.out.println("Hello World");}
        else if (db1<db2){
            System.out.println("Not Hello World");}
        else {
            System.out.println("I love java");
        }
          /*      8. satırda int number oluşturulmuştur.
                Eğer int number 0 yazdırılırsa "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        if(number==0){
            System.out.println("Im nevtral");
        }
        else if (number>0) {
            System.out.println("I m positirf");
        }
        else {
            System.out.println("I m nagative");

        }


    }
}
