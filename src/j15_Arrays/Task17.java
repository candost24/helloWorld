package j15_Arrays;

public class Task17 {
    public static void main(String[] args) {

        //Task->SAYI ARR DEKİ EN BÜYÜK ELEMANI PRİNT EDEN CODE CREAT EDİNİZ

        int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};//24

        int maxEleman=sayi[0][0];
        for(int kat=1;kat<sayi.length;kat++){
            for (int daire=0;daire<sayi[kat].length;daire++){

            }
            if(sayi[kat][0]>maxEleman){
                maxEleman=sayi[kat][0];
            }
            System.out.println(maxEleman);
        }







    }
}
