package Ödev_if;

public class Tasks {
    public static void main(String[] args) {
           /*  I love java olan bir String oluşturun.
            Bu cümlenin toplam karakter sayısını yazdırın.   */

        //Kodu aşağıya yazınız.

        String klm="I love java";
        System.out.println(klm.length());

         /*    Sprint planning olan bir String oluşturun.
        Bu dizenin toplam karakter sayısını yazdırın.   */

        //Kodu aşağıya yazınız.

        String d="sprint planning";
        System.out.println(d.length());

         /*    paper olan bir String oluşturun.
          String'i büyük harfe çevirin ve yazdırın.
          örn: apple > APPLE   */

        //Kodu aşağıya yazınız.
        String e="paper";
        System.out.println(e.toUpperCase());

        /* OraNge olan bir String oluşturun.
           String'i küçük harfe çevirin ve yazdırın.
           örn: APPLE > apple  */

        //Kodu aşağıya yazınız.

        String k="OraNge";
        System.out.println(k.toLowerCase());
   /*  New Jersey olan bir String oluşturun.
        String'i büyük harfe çevirin ve yazdırın  */

        //Kodu aşağıya yazınız.
        String us=" New Jersey";
        System.out.println(us.toUpperCase());
        /*  New York olan bir String oluşturun.
            String'i küçük harfe çevirin ve yazdırın.  */

        //Kodu aşağıya yazınız.
        String us1=" New York ";
        String st1=us1.toLowerCase();
        System.out.println(st1);
 /*  PADDLE olan bir String oluşturun.
            String'i küçük harfe çevirin ve yazdırın.  */

        //Kodu aşağıya yazınız.

        String pad=" PADDLE";
        String çev=pad.toLowerCase();
        System.out.println(çev);
          /*  apple olan bir String oluşturun.
            String'in içinde app olup olmadığını doğrula.   */

        //Kodu aşağıya yazınız.
        String c="apple";
        if (c.contains("app")) {
            System.out.println(c+"'in içinde app vardır. ");
        }else System.out.println(c+"'in içinde app yoktur. ");
  /*  apple kelimesinden  oluşan bir String yaz.
            String'in içinde App olup olmadığını doğrula.  */

        //Kodu buraya yazınız.
        String u="apple";
        if (u.contains("App")) {
            System.out.println(u+"'in içinde App vardır. ");
        }else System.out.println(u+"'in içinde App yoktur. ");
  /*  orange kelimesinden oluşan bir String oluşturun.
            String'in Apple'a eşit olup olmadığını doğrulayın. */

        //Kodu aşağıya yazınız.
        String o="orange";
        String p="Apple";
        System.out.println(o.equals(p));
 /*  apple  olan  bir String oluşturun.
            String'in apple'a eşit olup olmadığını doğrulayın.
            Büyük harf veya küçük harf önemli değildir.    */

        //Kodu aşağıya yazınız.

        String ple="apple";

        System.out.println(ple.equals("apple"));

              /*  Florida kelimesinden bir String oluşturun.
            Florida kelimesinin içindeki, sadece  'o'  harfinin bulunduğu indexini yazdırın.  */

        //Kodu aşağıya yazınız.
        String fl="Florida";
        System.out.println(fl.indexOf('o'));

        /*  Thank you olan bir String oluşturun.
            Thank you içindeki, sadece  'y' harfinin bulunduğu konumu yazdırın.
            // Thank you Stringini oluşturun.  */

        //Kodu aşağıya yazınız.
        String th="Thank you";
        System.out.println(th.charAt(th.indexOf('y')));
  /*  String s1 = "      Clarus  Way          ";
            s1 String'inin önündeki ve arkasındaki boşlukları kaldırın.
            s1 String'ini yazdırın.  */

        //Kodu aşağıya yazınız.

        String s1 = "      Clarus  Way          ";
        System.out.println(s1.trim());

         /* Main method oluşturun.
            Mouse değerinde bir String oluştur.
            Mouse String'inin 2. sırasındaki karakteri yazdırın.  */

        //Kodu buraya yazınız.
        String m="Mouse";
        System.out.println(m.charAt(1));
 /*  String s1 = "    Chocolade     ";
            s1 String'inin başındaki ve sonundaki boşlukları kaldırın.
            s1 String'ini yazdırın.  */

        //Kodu buraya yazınız.

        String s2 = "    Chocolade     ";
        System.out.println(s2.trim());

    }
}
