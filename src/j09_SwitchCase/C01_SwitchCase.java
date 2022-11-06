package j09_SwitchCase;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {
        /*
Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
programi izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
 karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
 ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
 Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
  Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
  çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
  Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

 ahan da TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
 */

        //task->kullanıcının girdiği rakamı yazıyla pirnt eden code creat ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("agam bir rakam giriniz");

        int sayi=sc.nextInt();
      switch (sayi){
          case 0:
              System.out.println("girilen rakam sıfır");
              break;
          case 1:
              System.out.println("girlen rakam bir");
              break;
          case 2:
              System.out.println("girlen rakam iki");
              break;
          case 3:
              System.out.println("girlen rakam üç");
              break;
          case 4:
              System.out.println("girlen rakam dört");
              break;
          case 5:
              System.out.println("girlen rakam beş");
              break;
          case 6:
              System.out.println("girlen rakam altı");
              break;
          case 7:
              System.out.println("girlen rakam yedi");
              break;
          case 8:
              System.out.println("girlen rakam sekiz");
              break;
          case 9:
              System.out.println("girlen rakam dokuz");
              break;
          default:
              System.out.println("agam adam gibi bir rakam gir");
      }












































    }
}
