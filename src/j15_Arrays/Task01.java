package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
//Task-> kullanıcdan alınan değerlerle bir int array elemanlarını bukukten kucuge   print eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("bir int array gir bakalım");
        int arrBoyut=sc.nextInt();
        int arr[]=new int[arrBoyut];
        for (int i=0; i<arrBoyut;i++){
            System.out.print(i+"index elemanı giriniz: ");
            arr[i]=sc.nextInt();

        }

        System.out.println("agam istediğin array :"+ Arrays.toString(arr));




    }
}
