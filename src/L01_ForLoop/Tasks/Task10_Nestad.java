package L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task10_Nestad {
    public static void main(String[] args) {
/*

girilen bir ifadenin istenen harf sayısını print eden code creat ediniz

input: selam javaCAN'lar
output: a sayısı :3


*/

        Scanner sc=new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String cumle=sc.nextLine();
        System.out.println("sayılacak harfi griniz: ");
        char harf=sc.next().charAt(0);

        int harfSayisi=0;// ilkdeğer 0 atandıki saymada etki etmesin

        for (int i=0; i<=cumle.length()-1;i++){

            if (cumle.charAt(i)==harf){
                harfSayisi++;
            }

        }
        System.out.println("girdiğniz cümle: "+cumle+"de istdğiniz harf:"+harfSayisi+"kadar var");





    }
}
