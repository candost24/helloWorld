package L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /*
        * girilen iki sayı arasındaki çift sayıları print eden code create ediniz...
        *
        *
        * */
        Scanner sc=new Scanner(System.in);
        System.out.println("agam sayı gir");
        int sayi1=sc.nextInt();
        System.out.println("agam 2. sayıyı giriniz:");
        int sayi2=sc.nextInt();


        if (sayi1<sayi2){
            for (int i=sayi1; i<sayi2 ; i++){
                if (i%2==0){
                    System.out.println(i+" ");
                }
            }
        }





    }
}
