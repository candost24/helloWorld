package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ö01_ArrayListÖdevler {
    public static void main(String[] args) {

  /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

        //    System.out.println("Count="+getCount());


        //}
        //public static Integer getCount(){
        //    int say=0;
        //    String Fruit="orange";
        //    ArrayList<String>listfruit=new ArrayList<>(List.of("Orange" , "Kiwi" , "Peach" , "Banana" , "Orange"));
        //    for (String fruit:listfruit){
        //        if (fruit.equals(fruit)){
        //            say++;
        //        }
        //    }
        //    return say;

  /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

        //    ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        //    System.out.println(getSum(arr));

        //}

        //public static Integer getSum(ArrayList<Integer> arr) {
        //    int toplam = 0;
        //    for (int i = 0; i < arr.size(); i++) {
        //        toplam += arr.get(i);
        //    }

        //    System.out.println("soru tamamdır aga :)");
        //    return toplam;




 /*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:
    Girdi:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */
        int sayıArr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ArrayList<Integer> sayılar = new ArrayList<>();
        for (int i = 0; i < sayıArr.length; i++) {
            for (int j = 0; j < sayıArr[i].length; j++) {
                sayılar.add(sayıArr[i][j]);

            }
        }

        System.out.println("Buyurun ArrayList'leriniz =" + sayılar);

 /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

        ArrayList<String> sehirList= new ArrayList<>(List.of("New jersey", "New york", "Ohio", "Florida", "Boston"));
        System.out.println("Cevap= "+getLength(sehirList));


    }

private static ArrayList<Integer> getLength(ArrayList<String> sehirList) {
        ArrayList<Integer>listDgr = new ArrayList<>();
        for (String c :sehirList ) {
            listDgr.add(c.length());

        }

        return listDgr;

 /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */



}
}
