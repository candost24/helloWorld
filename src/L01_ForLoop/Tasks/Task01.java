package L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari print eden ama;
       		- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
       		- Sayi 5’in kati ise sayi yerine “CAN'dır” yazdirin.
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz

*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen tamsayı giriniz");
        int say=scan.nextInt();

        if(say>100){// girilen sayının 100 den küçük olma şartı
            System.out.println("agam hani 100 den küçük olcaktı");
        }else {
            for (int i=1; i<say; i++){
                if(i%3==0 && i%5==0){//girilen sayıya kadar 3 ve 5 bölünme kontrlü
                    System.out.println("javaCan");

                } else if (i%3==0) {//girilen sayıya kadar 3 bölünme kontrolu
                    System.out.println("java");

                } else if (i%5== 0) {//girilen sayıya kadar 5 bölünme kontrolu
                    System.out.println("CAN'dır");

                }else System.out.println(i+"hiçbir şartı sağlamaz");
            }
        }







    }
}
