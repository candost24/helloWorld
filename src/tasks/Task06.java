package tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
      /*
      girilen string'in son karakterini silen code create ediniz...

      */

        Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = sc.next();

        System.out.println(str.substring(0, str.length() - 1));












    }
}