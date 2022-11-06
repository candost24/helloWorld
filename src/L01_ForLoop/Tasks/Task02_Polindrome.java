package L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task02_Polindrome {
    public static void main(String[] args) {

        /*
        * girlen ifadenin polindrome  olmasını kontroleden method create ediniz...
        * polindrome:her iki yönde okunduğunda eşit olan ifadeler
        * ey edip adanada pide ye
        *
        * */
        Scanner sc=new Scanner(System.in);
        System.out.println("bir metin giriniz: ");
        String str=sc.nextLine();

        polindrome(str);//string parametreli method call





    }

    private static void polindrome(String str) {
        String tersStr = "";//bos bir String kutu
        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr += str.charAt(i);//string i.ci karakterini tersStr ye ekler(concat)
        }
        System.out.println("girilen ifadenin tersi :" + tersStr);
        if (str.equalsIgnoreCase(tersStr)) {//str ile tersStr eşitlik kontrolü
            System.out.println("girilen ifade polindrome");
        } else System.out.println("girilen ifade polindrome değil");

    }
}
