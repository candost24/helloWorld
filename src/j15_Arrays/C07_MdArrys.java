package j15_Arrays;

import java.util.Arrays;

public class C07_MdArrys {
    public static void main(String[] args) {


        int arr[][] = {
                {1, 2, 3}, //0. kat
                {10, 20}, //1. kat
                {101}//2. kat
        };//3 katlı apt


int toplama=0;
for (int kat=0; kat<arr.length ;kat++){
    for (int daire=0; daire<arr[kat].length ;daire++){
        toplama +=arr[kat][daire];
    }


    System.out.println("arr deki tum elemanlar toplamı:"+toplama);
}


    }
}
