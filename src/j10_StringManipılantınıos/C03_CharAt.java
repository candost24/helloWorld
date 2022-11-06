package j10_StringManipılantınıos;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
        String sehir="Istanbul";
        char besinciİndexKrkt=sehir.charAt(5);
        System.out.println(besinciİndexKrkt);//b
        //son index karakteri->charAt(0)
        System.out.println(sehir.charAt(0));//ı
       // System.out.println(sehir.charAt(18));//rte vereir indx boyutunu aştı
        Scanner sc=new Scanner(System.in);
        System.out.println("birkelime gir");
      String kelime =sc.nextLine();
      if (kelime.length()%2!=0) {
          System.out.println(kelime.charAt((kelime.length() - 1) / 2));
      }else System.out.println("girilen karakterin orta karakteri yoktur");






    }
}
