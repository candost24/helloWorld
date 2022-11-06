package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForDenenme {
    public static void main(String[] args) {

        List<Integer> sayi1List=new ArrayList<>(List.of(16,5,4,8,9,10));
        for (int i=0;i<sayi1List.size();i++){
            System.out.println(sayi1List.get(i));
        }
for (Integer a:sayi1List){
    System.out.println(a+" ");
}
        System.out.println("kafanın güzel olduğu günler :)");
for (Integer a:sayi1List.subList(1,sayi1List.size())) {
    if (a%2==1){
        System.out.println("yazdır bakem bıradır"+a);
        //task list elemanlarinın 2 ile 5 dahil index  arasındaki (2,3,4,5) elemanların toplamını  print ediniz
        int toplam=0;
        for (Integer c:sayi1List.subList(2,5)){
            toplam+=c;
        }
        System.out.println("toplam= "+toplam);

int arr [][]={{12,2,},{4},{5,6,7}};
int çarpım=1;
for (int d []:arr){
   for (int e:d ){
       çarpım*=e;

    }

}
        System.out.println(çarpım);
    }

}




    }
}
