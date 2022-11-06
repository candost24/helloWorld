package j08_İfstaement_TernaryOperator;

import java.util.Scanner;

public class Ex04java {
    public static void main(String[] args) {

/*
task ->girilen bir karekterin harf olup olmadığını kontrol eden code create ediniz..
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("bir kararkter giriniz: ");
        char krktr=sc.nextLine().charAt(0);
        if ((krktr>='A'&&krktr<='Z')||(krktr>='a'&&krktr<='z')){
            System.out.println("girdiğiniz karekter harfdir :)");
        } else System.out.println("girdiğiniz karakter harf değildir :(");


    }

}
