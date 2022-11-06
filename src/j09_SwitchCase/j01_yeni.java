package j09_SwitchCase;

import java.util.Scanner;

public class j01_yeni {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi = sc.nextInt();
        int onlarBasamagi=(sayi/10)%10;
        switch (onlarBasamagi){
            case 0:
                System.out.println("girmiş olduğunuz sayının onlar basamağındaki yeri SIFIR");
                break;
            case 1:
                System.out.println("girmiş oldunuz sayının  onlar badamağındaki yeri BİR");
                break;
            case 2:
                System.out.println("girmiş olduğunuz sayının onlar basamağındaki yeri İKİ");
                break;
            case 3:
                System.out.println("girmiş olduğunuz sayının onlar basamağındaki yeri ÜÇ");
            case 4:
                System.out.println("girmiş olduğunuz sayının onlar basamağındaki yeri DÖRT");
                break;
            case 5:
                System.out.println("girmiş olduğunuz sayının onlar basamağındaki yeri BEŞ");
                break;
            case 6:
                System.out.println("girmiş olduğunuz sayının onlar basamağındaki yeri ALTI");
            case 7:
                System.out.println("girmiş olduğunuz sayyının onlar basamağındaki yeri YEDİ");
            case 8:
                System.out.println("girmiş olduğunuz sayının onlar basamağındaki yeri SEKİZ");
            case 9:
                System.out.println("girmiş olduğunuz sayının onlar basamağındaki yeri DOKUZ");
                break;
            default:
                System.out.println("lütfen sayıları doğru giriniz");
        }
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
                break;
                case 2:
                System.out.println("salı");
                break;
                case 3:
                System.out.println("çarşamba");
                break;
                case 4:
                System.out.println("perşemb");
                break;
                case 5:
                System.out.println("cuma");
                break;
                case 6:
                System.out.println("cumartesi");
                break;
                case 7:
                System.out.println("pazar");}
        // Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız

        Scanner oku = new Scanner(System.in);
        System.out.print("gunNo = ");
        int gunNo = oku.nextInt();
        switch (gunNo%7){
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
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 0:
                System.out.println("pazar");
                break;
        }


        /*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen ayı giriniz");
        String ay=input.next().toUpperCase();
        switch (ay) {
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
                int yil = sc.nextInt();
                if (yil % 4 == 0) {
                    System.out.println("29 gün");
                } else System.out.println("28 gün");
                break;
        }
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

        Scanner pn = new Scanner(System.in);

        System.out.print("Notunuzu giriniz : ");
        int not = pn.nextInt();
        switch (not/10) {
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
                System.out.println("Hatalı Giriş Yaptınız Sanırım :( ");
        }


        }
}
