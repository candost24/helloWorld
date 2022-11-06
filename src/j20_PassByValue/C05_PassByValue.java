package j20_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {



        double etiketFiyatı=100;//primitive
        double indirimOranı=0.1;//primitive
        System.out.println("indirim öncesi etiketFiyatı"+etiketFiyatı);


        etiketFiyatı=indirim(etiketFiyatı,indirimOranı);

        System.out.println("indirim sonrası etiketFiyatı"+etiketFiyatı);



    }
    public static double indirim(double fiyat,double Oran) {

        fiyat*=(1-Oran);
        System.out.println("indirimli fiyat:"+fiyat);
        return  fiyat;
    }


}
