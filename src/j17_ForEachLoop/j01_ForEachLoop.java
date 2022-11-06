package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class j01_ForEachLoop {
    public static void main(String[] args) {

        /*
        *for-each loop for loop'un gelilmş halıdir.
        1. clean code- yazım kolaylığı
        2. code okuma kolaylıgı
        3. hata yapma riskini azaltır.

        * */

        List<Integer>sayiList=new ArrayList<>(List.of(16,5,2,33,22,27,41,24));
        //task ->list elemanlarını ayrı satırlara  print ediniz.

       for(int i=0; i< sayiList.size();i++){
            System.out.println(sayiList.get(i)+" ");
        }

        for (Integer a:sayiList){
            System.out.print(a+" ");
        }
        System.out.println(" **** task 2*****");

// task list elemanlarını ilk 3 elemanlarını hariç tek olanlarını print ediniz.
        for (Integer a:sayiList.subList(3,sayiList.size())){
            if (a%2==1){
                System.out.println(a+" ");


                //task list elemanlarinın 2 ile 5 dahil index  arasındaki (2,3,4,5) elemanların toplamını  print ediniz.
                int toplam=0;

                for (int b:sayiList.subList(2,6)){
                    toplam+=a;
                }
                System.out.println("toplam = " + toplam);

            }
        }


}



    }


