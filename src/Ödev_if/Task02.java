package Ödev_if;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int kacıncıGun = scan.nextInt();
        if (kacıncıGun<=0||kacıncıGun>=8){
            System.out.println("yanlış işlem yaptınız");
        }switch (100+kacıncıGun%7){
            case 1:
                System.out.println("pazartesi");
                break;case 2:
                System.out.println("salı");
                break;case 3:
                System.out.println("çarşamba");
                break;case 4:
                System.out.println("perşemb");
                break;case 5:
                System.out.println("cuma");
                break;case 6:
                System.out.println("cumartesi");
                break;case 7:
                System.out.println("pazar");
                break;















        }





    }
}

