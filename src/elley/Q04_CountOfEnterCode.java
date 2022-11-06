package elley;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        public static void main(String[] args) {

                String pin="cebrail 12345";
                int girisHakki=4;
Scanner scan=new Scanner(System.in);
            System.out.println("****hosgeldiniz****");

            while (true){

                System.out.println("pin kodu giriniz:");
                String girilenPin=scan.nextLine();
                if (pin.equals(girilenPin)){
                    System.out.println("basarılı giriş yaptınmız...");
                    break;

                }else {
                    System.out.println("yanlış giriş yaptınmız");
                    girisHakki--;
                    System.out.println("kalan giriş hakkınız:"+girisHakki);
                }if (girisHakki==0){
                    System.out.println("griş hakkınız kalmadı hattınız bloke oldu");
                    break;
                }
            }


}
}
