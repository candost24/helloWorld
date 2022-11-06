package j09_SwitchCase;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
        //girilen ay numarasına göre kaç gün çektiğini print den code creat deiniz
        Scanner sc=new Scanner(System.in);
        System.out.println("agam bir ay gir bakam");
        int ayNo= sc.nextInt();
        switch (ayNo){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girlen ay 31 gün çeker");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("giilen ay 30 gün içerir");
                break;
            case 2:
                System.out.println("yılınızı giriniz: ");
                int yil= sc.nextInt();
                if (yil % 4==0) {
                    System.out.println("girilen ay şubat ayı 29 gün içerir");
                }else System.out.println("girilen ay şubat ayı 28 gün içeriri");
                break;
            default:
                System.out.println("agam sen ne yaptın");
                }











        }










}
