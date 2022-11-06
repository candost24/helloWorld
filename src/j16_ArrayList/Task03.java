package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // bir list te istenen bir sayının varlığını kontrol eden bir  list creat ediniz.

        ArrayList<Integer> listSayi = new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));

        Scanner sc=new Scanner(System.in);
        System.out.println("ağam hangi sayi arirsan : ");
        int ara =sc.nextInt();
        boolean varMi=false;

        for (int i=0; i<listSayi.size();i++){
            if(listSayi.get(i)==ara){
                varMi=true;
                System.out.println("sayi "+listSayi.get(i)+" tek bir sayının");
            }


        }


        if (!varMi){
            System.out.println("agam aradığın sayı MALESEF :( ");
        }



    }
}
