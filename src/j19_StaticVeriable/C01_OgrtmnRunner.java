package j19_StaticVeriable;

public class C01_OgrtmnRunner {
    public static void main(String[] args) {

C01_Ogrtmn hc1=new C01_Ogrtmn("cüneyt",11);


        System.out.println("hc1.tecrube="+hc1.tecrube);
        System.out.println("hc1.isim="+hc1.isim);
//hc1.okul="kabadaş";
        System.out.println("hc1.okul="+hc1.okul);

        C01_Ogrtmn hc2=new C01_Ogrtmn("bekir",7);
        System.out.println("hc2.tecrube="+hc2.tecrube);
        System.out.println("hc2.isim="+hc2.isim);
//hc2.okul="kabatas";
        System.out.println("hc2.okul="+hc2.okul);

        C01_Ogrtmn hc3=new C01_Ogrtmn("nazım",13);
        System.out.println("hc3.tecrube="+hc3.tecrube);
        System.out.println("hc3.isim="+hc3.isim);
        hc3.okul="kabayas";

        System.out.println("hc3.okul="+hc3.okul);

hc1.evlilikYıldonumu();//obj ile nana static meth. call
C01_Ogrtmn.maasHesabla();//ClassName ile static method call
hc2.maasHesabla();//obj ile static meth call->bad practice






    }
}
