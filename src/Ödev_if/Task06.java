package Ödev_if;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz
		Scanner harf = new Scanner(System.in);

		System.out.print("VIP kısaltması harflerinin kelime karşılığını öğrenmek için harf giriniz: ");
		char vip=harf.next().toUpperCase().charAt(0);
		switch (vip) {
			case 'V':
				System.out.println("very");
				break;
			case 'I':
				System.out.println("Important");
				break;
			case'P':
				System.out.println("Person");
				break;
			default:
				System.out.println("Hatalı Giriş Yaptınız Sanırım:(");
		}



	}
}
