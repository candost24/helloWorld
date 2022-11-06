package j10_StringManipılantınıos;

import java.util.Scanner;

public class C05_Start_EndWith {
    public static void main(String[] args) {


/**
 * startsWith()
 *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 *  String'in basladigi characteri dogrular
 * endsWith()
 * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
 */

        String sehir = "istanbul";
        System.out.println(sehir.startsWith("i"));
        System.out.println(sehir.startsWith("is"));
        System.out.println(sehir.startsWith("s"));
        System.out.println(sehir.startsWith("t" ,2));

        System.out.println(sehir.endsWith("l"));
        System.out.println(sehir.endsWith("bul"));
        System.out.println(sehir.endsWith("bu"));

        String sstr="bul";
        System.out.println(sehir.endsWith(sstr));
        int yas=48;




        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen 3 harfli bir isim giriniz");
        String isim=sc.nextLine();
        if (isim.length()>=4){
            System.out.println("Girmiş olduğunuz isim malesef 3 harfi aşmaktadır");
        }else{
            String analiz=(isim.charAt(0) == isim.charAt(1) || isim.charAt(1) == isim.charAt(2) ||isim.charAt(1) ==
                    isim.charAt(2))? "benzer harfler bulunmakta" : "harflariniz farklı";



            //Task-> girilen e-mail hesabının  @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
            // @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print edn code creae ediniz.

            System.out.println("lütfen @gmail adrsizi giriniz:  ");
            String mail=sc.nextLine();
            if (mail.contains("@gmail.com")){
            if (mail.endsWith("@gmail.com")){
                System.out.println("doğru hesap girdiniz onaylanmıştır");
            }else {
                String s = ("geçerli hesap giriniz");
            }
            }
        }


// task-> girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code create ediniz->ternary kullanınız
        System.out.println("lütfen bir cümle giriniz ve aramış olduğunuz kelimeyi giriniz");
        String ali=sc.nextLine();
        String isa=sc.nextLine();
        System.out.println(ali.contains(isa)?"içeriyor":"içermiyor");

    }
}