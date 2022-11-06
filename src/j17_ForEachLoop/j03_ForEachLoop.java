package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class j03_ForEachLoop {
    public static void main(String[] args) {
        // task-> iki string array elemanlarının  ortak olamasını kontrol eden code creat ediniz.
        String arr1[]={"nazım","gülsüm","dilek","erol","cüneyt","ciğdem"};
        String arr2[]={"musty","gülsüm","ayşe","enise","cüneyt","ciğdem"};
        List<String>ortakIsim=new ArrayList<>();

        for (String str1:arr1){
            for (String str2:arr2){
                if(str2.equalsIgnoreCase(str1)){// herbir çekirdek eşitliği kontrol
                    ortakIsim.add(str2);
                }
            }
        }
        if (ortakIsim.isEmpty()){//ortak isim list boşluk
            System.out.println("arraylerinizde ortak isim yok "+ortakIsim);
        }else System.out.println(ortakIsim);




    }
}
