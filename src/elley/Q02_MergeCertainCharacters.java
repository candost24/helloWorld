package elley;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("lütfen bir string giriniz");
        String str= sc.nextLine();
        System.out.println("birsayı giriniz");
        int sayi=sc.nextInt();
        System.out.println(ilkSonHarf(str, sayi));


    }
    private static String ilkSonHarf(String str, int sayi) {
        String ilkSonHarfler = str.substring(0,1) + str.substring(str.length()-1);
        System.out.println("ilkSonHarfler = " + ilkSonHarfler);
        String output ="";
        for (int i = 0; i < sayi; i++) { //birlesimden kac tane yazdiracaksam onu verir
            output+= ilkSonHarfler;
        }
        return output;
    }








}
