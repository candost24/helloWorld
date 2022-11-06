package j08_İfstaement_TernaryOperator;

public class C01_ifStament {
    public static void main(String[] args) {
        int krmYas = 45;
        int ismlYas = 63;
        if (krmYas == ismlYas) {
            System.out.println("aynı yasdasınız güzel insanlar");
            System.out.println("yoksa siz ikiz misiniz ? ");
        }
        if (krmYas >= 40)
            System.out.println("krm bey olgunluk yaşındasınız");
        System.out.println("bu yazıyı okuduysanız 12. satırdaki if'den bagımsız");
//if blok'da {} kullanılmazsa ilk; kadar olan komut çalışır veya çalışmaz

        if (krmYas + ismlYas > 100) {
            System.out.println("kerm bey ve ismal bey yaşları toplamı 100 den buyuk");
        }
        System.out.println("selam javacanlar");

        /*bagımsız if statement yapıları sadece kendi  sscop (kapsamlarını )run eder.
        birden fazla bagımsız if statement yapıları
        */

//ctrl+alt+l-->code reformat java format





    }
}
