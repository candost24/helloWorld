package j09_SwitchCase;

import java.util.Scanner;

public class j1_ödev {
    public static void main(String[] args) {
        // Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız
        Scanner oku = new Scanner(System.in);
        System.out.print("gunNo = ");
        int gunNo = oku.nextInt();
        switch (gunNo){
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
            case 6:
                System.out.println("cumatesi");
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("mutlu günler");
        }



    }
}
