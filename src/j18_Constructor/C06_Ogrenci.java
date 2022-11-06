package j18_Constructor;

public class C06_Ogrenci {//ogrenci obj kalıphane

//fıelds

    String isim="Merve hanım";
    int yas;
String name;
int age;

    public C06_Ogrenci(String isim, int yas) {//2p li obj
       // this.isim = isim;//parametre isim değeri inst. obj isim değerine atandı
        //this.yas = yas;//parametre yas değeri inst. obj yas değerine atandı

        name=isim;//parametre isim değeri inst. obj name değerine atandı
        age=yas;//parametre yas değeri inst. obj age değerine atandı
        System.out.println("constaki isim:"+isim);//parametre isim değeri :saliha h
        System.out.println("constaki isim:"+this.isim);//inst.obj isim değeri:merve hanım
        System.out.println("constaki name:"+name);//inst. obj name değeri:null






    }
}
