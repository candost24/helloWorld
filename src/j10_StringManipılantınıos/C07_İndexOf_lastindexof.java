package j10_StringManipılantınıos;

import java.util.Scanner;

public class C07_İndexOf_lastindexof {
    public static void main(String[] args) {

/* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

*/




        String str="good";
        System.out.println(str.indexOf('o'));
        System.out.println("d nin yeri index nosu: "+str.indexOf("d"));
        System.out.println("d nin yeri index nosu: "+str.indexOf("D"));




/** lastIndexOf()
                *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
 *  indexOf un sondan olan hali fakat index numaraları değişmez.
                *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
                *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
                */

String isim="mustafa nizamoğlu";
        System.out.println(isim.indexOf('a'));
        System.out.println(isim.lastIndexOf('a'));
        System.out.println(isim.lastIndexOf("fa"));


        /*
task
 Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz

 1-Girilen cumle java icermiyor
 2-Girilen cumle 1 tane java iceriyor
 3-Girilen cumlede birden fazla java var
 */


        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");

        String cümle=input.nextLine().toLowerCase();
        if (cümle.indexOf("java")==-1){
            System.out.println("girilen cümle java içermiyor");
        } else if (cümle.indexOf("java")== cümle.lastIndexOf("java")) {
            System.out.println("girilen cümle birtane java içeriyor");

        }else System.out.println("girilen cümlede birden fazla java var");


    }
}
