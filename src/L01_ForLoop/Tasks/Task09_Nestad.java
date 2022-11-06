package L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task09_Nestad {
    public static void main(String[] args) {
        /*
        * task->girilen boyutta aşagıdaki şekli print eden code creta ediniz
        *
        * *
        * * *
        * * * *


        */

        Scanner sc=new Scanner(System.in);
        System.out.println("kare için boyut giriniz");
        int boyut=sc.nextInt();


        for (int i=1; i<=boyut ;i++){
            for (int j=1; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();//dumy
        }










    }
}
