package Ödev_if;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		TASK :
		Girilen not değerini aşağıdaki tabloya göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */

        Scanner scan = new Scanner(System.in);

        System.out.print("Notunuzu giriniz : ");
        int not = scan.nextInt();
switch (not/10){
    case 1:
    case 2:
    case 3:
    case 4:
        System.out.println("D");
        break;
    case 5:
    case 6:
        System.out.println("C");
        break;
    case 7:
    case 8:
        System.out.println("B");
        break;
    case 9:
    case 10:
        System.out.println("A");
        break;
    default:
        System.out.println("lütfen notunuzu 1-100 aralığında giriniz saygılarımla :)");







}

    }


}
