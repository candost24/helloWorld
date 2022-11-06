package j15_Arrays;

public class Task15 {
    public static void main(String[] args) {
        // task-> arr tum elemanlarının  çarpımını print edeen code create ediniz

        int sayi[][]={{1,2,3},{9,8}};

        int çarpım=1;//etki etmeyecek
        for (int kat=0;kat<sayi.length;kat++){//kat kontrolü
            for (int daire=0; daire<sayi[kat].length;daire++ ){
                çarpım*=sayi[kat][daire];

            }

            System.out.println(çarpım);
        }





    }
}
