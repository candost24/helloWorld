package j09_SwitchCase;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        //task->girlen haftanın gününü hafta içi veya hafta sonu olduğunu print eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("agam bir gün giriniz");
        String gün=sc.next();
        switch (gün){
            case "pazartesi":
            case"salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("girilen gün hafta içine aittir");
                break;
            case "cumartesi":
            case "pazar":
                    System.out.println("giilrn gün hafta sonudur");
                    break;
            default:
                System.out.println("hatalı gün girdiniz");



        }


    }
}
