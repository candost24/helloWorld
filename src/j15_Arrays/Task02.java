package j15_Arrays;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        // task-> girilen int array elemanlarını topalamını  print eden code creat ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("arraylerden kaçını istersin");
        int arrB=sc.nextInt();
        int arr[]=new int[arrB];
int toplam=0;//local var

for(int i=0;i<arrB;i++){
    System.out.println(i+". eleman giriniz");
    arr[i]=sc.nextInt();
    toplam+=arr[i];



}

        System.out.println("sayi toplamı"+toplam);
        for (int a:arr);
        System.out.println("sayi toplamı"+arr);
              {

        }
    }
}
