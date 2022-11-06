package j15_Arrays;

import java.util.Arrays;

public class C_Deneme {
    public static void main(String[] args) {
int[]arr={67,97,20,30,47,57,60,95,24};
int sayi=30;
boolean flag=false;
for (int i=0; i<arr.length;i++){
    if (arr[i]==sayi){
        flag=true;
        break;
    }
}
       if (flag){
           System.out.println("aradığınız array burada vardır");
       }else {
           System.out.println("malesef aradığınız sayı bulunmadı");
       }

    }
}
