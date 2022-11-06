package L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task07_Nestad {
    public static void main(String[] args) {


        /*
        * girilen boyutta bir  kara için
        * // 0 0 0 0 1
		// 0 0 0 1 0
		// 0 0 1 0 0
		// 0 1 0 0 0
		// 1 0 0 0 0
		// için:
      * */


        Scanner sc=new  Scanner(System.in);


        System.out.println("kare için boyut giriniz : ");

        int boyut=sc.nextInt();

        for (int i = 1; i <=boyut ; i++) {//apt döngü
            for (int j = 1; j <=boyut ; j++) {//daire döngü


                if (i==j){
                    System.out.print("1  ");
                }else System.out.print("0  ");

            }
            System.out.println();
        }


















    }
}
