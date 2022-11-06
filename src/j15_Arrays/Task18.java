package j15_Arrays;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {

        // task->sayi arr'deki iç arr'lerin toplamını yeni bir arr ye  atayıp  print eden code creat ediniz
        //int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};//24
        // output:int yeniArr[]={6,11,-7}


        int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};//24
        int yeniArr[]=new int[sayi.length];
       int topla=0;
        for(int i=0;i<sayi.length;i++){
            for(int j=0;j<sayi[i].length;j++){
                yeniArr[i]+=sayi[i][j];
               topla++;
            }
        }
        System.out.println(Arrays.toString(yeniArr));




    }
}
