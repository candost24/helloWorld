package j15_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

/*
Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
Array olusturulurken 2 seyi declare etmeliyiz:
1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
2- uUzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
array= tepsiye benzer..
Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */
      //  array tanımlama...
      int a;// declare edilen ama atanamayan primative data
      int sayiArr[] ;// declare (tanımlanan) edilen ama atanamayan int type array

      String isimArr[] ={"muharrem","enise","cebrail","nazım","özge"};// hem tanımlama hem atama yapılan string array
      // string[] isimArr1= {"muharrem","enise","cebrail","nazım","özge"};// hem tanımlama hem atama yapılan string array

        sayiArr = new int[5];
        //[0,0,0,0,0]


        // Array a eleman ekleme...
        sayiArr[2]=34;
        sayiArr[0]=35;
        sayiArr[1]=34;
        sayiArr[3]=61;
        sayiArr[0]=34;// 0 index  array elemanı 34 değeri ile update edildi
        //array elamanları unıqe olmak zorunda değildir tekrarlı array elemanı olabilir

        // Array eleman sayısı boyut değeri

        System.out.println("sayiArr.length= "+sayiArr.length);//5

        // Array SON ELemanı...
        System.out.println("array son elemanı: "+isimArr[isimArr.length-1]);//özge
        isimArr[isimArr.length-1]="QA özge hanım";// array son eleman update edildi.

        // Array de olmayan eleman
        //okkalı bir TRICK-> sayiArr[11]=23;//cte vermez ama olmayan eleman rte verir->Array RUN tıme da oluşu

        // Array elemanları print etme ...

        for (int i=0; i<isimArr.length;i++){
            System.out.println(isimArr[i]+" ");
        }

        System.out.println();
        System.out.println("isimArr = "+isimArr);
     System.out.println(Arrays.toString(isimArr));//isim Array sitringe çevrildi.

for (int i=0; i< sayiArr.length;i+=2){
  System.out.print(sayiArr[i]+ " ");
}

      System.out.println();
      System.out.println("isimArr = " + isimArr);//isimArr = [Ljava.lang.String;@79698539 -> isimArr referans değeridir
      System.out.println(Arrays.toString(isimArr));//isim Array sitringe çevrildi.


//Array elemanları naturel(k->b:ascending b->k:descending, alfabetik) sıralama
        System.out.println(Arrays.toString(isimArr));//sıarlama öncesi-> [muharrem, enise, cebrail, nazım, QA Özge hanım]
        Arrays.sort(isimArr);//isimArr elemanları naturel sıralama yapıldı
        System.out.println(Arrays.toString(isimArr));//sıralama sonrası -> [QA Özge hanım, cebrail, enise, muharrem, nazım]




    }
}
