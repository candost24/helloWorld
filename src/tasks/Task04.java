package tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
   /*
 Task->
 Girilen iki kelimeden ilki çift sayıda kaqrakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
 ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
 name1= mehmet
 name2= ahmet
 Print ==> mehahmetmet
 */

        Scanner input=new Scanner(System.in);
        System.out.println("1.kelimeyi giriniz:");
        String str1=input.nextLine();

        System.out.println("2.kelimeyi giriniz:");
        String str2=input.nextLine();

        if (str1.length()%2==0){
            System.out.println(str1.substring(0,str1.length()/2)+str2+str1.substring(str1.length()));
        }else {
            System.out.println("str1 str2 eklenmez");
        }












    }
}
