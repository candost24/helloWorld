package Ödev_if;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("lütfen ayı giriniz");
		String ay=sc.next().toUpperCase();
		switch (ay){
			case "OCAK":
			case "MART":
			case "MAYIS":
			case "TEMMUZ":
			case "AĞUSTOS":
			case "EKİM":
			case "ARALIK":
				System.out.println("31 gün");
				break;
			case "NİSAN":
			case "HAZİRAN":
			case "EYLÜL":
			case "KASIM":
				System.out.println("30 gün");
				break;
			case "ŞUBAT":
				System.out.println("yılınızı giriniz");
				int yil= sc.nextInt();
				if (yil%4==0){
					System.out.println("29 gün");
				}else System.out.println("28 gün");
				break;





















		}

	}

}
