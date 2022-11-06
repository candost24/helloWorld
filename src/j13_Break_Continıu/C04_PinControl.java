package j13_Break_Continıu;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {

        // task-> String data typi bir pin datasının 3 giriş hakkında kontrol eden create ediniz.

        Scanner sc = new Scanner(System.in);

       String dgruPin="javaCAN";

       int girisHakki=3;

        while (true){
            System.out.println("AGAm pin giresen");
            String agaPin=sc.nextLine();
            if(agaPin.equals(dgruPin)){
                System.out.println("agam bugün ballısan gayet basarılı");
               break;

            }else {
                System.out.println("agam bugün nasipsizsin bi daha gir");
                girisHakki--;
                System.out.println("agam kalan canın : " + girisHakki);
                if (girisHakki == 0){
                    System.out.println("agam canın kalmadı bidahkine bekleme yapma dewamkeee :(");
                    break;
                }

            }


        }





    }
}
