package Ödev_if;

import java.lang.reflect.Array;

public class Arrays {
    public static void main(String[] args) {
           /*
        Task ->
        elemanları : Apple, Orange , Banana, Kiwi
        olan String Array (Dizi) crdeate edip print eden code create ediniz.

         */
        String arrays[]={"Apple","Orange","Banana","Kiwi"};
        System.out.println();
        System.out.println(java.util.Arrays.toString(arrays));

  /*          int Array oluşturun.
                elemanları : 13, 15,14,16,16
                Arrayin elemanlarını yazdırın.
     */

int array[]={ 13, 15,14,16,16};
System.out.println(java.util.Arrays.toString(array));
 /*  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        int arr[]={25,30,30,35,100};
        int toplam=0;
        for (int i:arr){

           toplam=toplam+i;

        }
        System.out.println("Array'den beklenen toplam ="+toplam);
 /*
        elemanları: "new jersey" , "new york", "boston","California" olan  String array  oluşturun ve
        Array'daki eleman sayısını yazdırınız.
        Cevap 4 olmalı.
         */


        String arrs[]={"new jersey" , "new york", "boston","California"};

        System.out.println("Toplam array sayısı:"+arrs.length);
 /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */
int arry[]={5,6,8,12,14,19};
int sncTopla=0;
int sncÇıkarma=0;
for (int i=0; i<arry.length;i++){
    if (arry[i]%2==0){

        sncTopla=sncTopla+arry[i];
    }else sncÇıkarma-=arry[i];

}
        System.out.println(sncTopla+sncÇıkarma+" sayısı=Çift ve Teklerin koşulandırma sonucundaki toplamı");


   /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */
        String arrsit[]={"Apple" , "Orange" , "Banana ", "Pineapple"};
         String strr="Apple";
         boolean flag=false;
         for (int i=0; i<arrsit.length; i++){
             if(arrsit[i]==strr){
                 flag=true;
                 break;
             }
         }


 /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */
int arrm[]={12,2,5,15,8};
int max=arrm[0];
for (int i=0; i<arrm.length; i++){
    if (arrm[i]>max){
        max=arrm[i];
    }
}

        System.out.println("maximum büyük değeri : "+max);


   /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */
int arrm1[]={14,19,5,21};
int min=arrm1[0];
for (int i=0; i<arrm1.length; i++){
    if (arrm1[i]<min){
        min=arrm1[i];
    }

    }
        System.out.println("Verilen değerler arasındaki en minnak değer :)"+min);


/*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        int arrm2[]={15,25,22,18,30};
        int says=arrm2.length;
        java.util.Arrays.sort(arrm2);
        System.out.println("Değerler içerisindeki en byük ikici eleman :"+arrm2[says-2]
        );

 /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */
        int sayi[]={12, 14 , 21 ,23 , 10 ,4};
        int top=0;
        for (int i=0; i<sayi.length; i++){
            System.out.println(top+=sayi[i]);

        }
        System.out.println("Sayıların ortalaması :"+top/sayi.length);


   /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */

        String s="Hello World";
        System.out.println(s.replace("o","K"));

  /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

String klm= "Removes white space from both ends of a string";
String arrk[]=klm.split(" ");
        System.out.println("String'deki kelime sayısı :"+arrk.length);

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

    // String symbl1="$12, $23, $10, $2, $5, $2";
    // symbl1=symbl1.replace("$"," ");
    // String symbl1Arr[]=symbl1.split(" ");
    // int tplm=0;
    // for (int i=0; i<symbl1.length(); i++){
    //     tplm+=Integer.parseInt(symbl1Arr[i]);
    // }

    // System.out.println("tplm ="+tplm);


   /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */
int[] veri={1,2,3};
int uzunluk= veri.length;
int[] tersdizi=new int[uzunluk];
for (int i=0; i<uzunluk; i++){
    tersdizi[uzunluk-i-1]=veri[i];

}
for (int i=0; i<uzunluk;i++){
    System.out.print(tersdizi[i]);
}


    }
}
