package j20_PassByValue;

public class C04_PassByValue {

    static double etiketFiyatı;//güneş
    static double indirimOranı;//güneş




    public static void main(String[] args) {

        /*
        * eger bir methodda yapılan değişiklik kalıcı olsun istenirse
        * 1.değişiklik yapılan variable lar static olarak tanımlanır.
        *
        *
        *
        * */

        etiketFiyatı =100;
        System.out.println("indirim öncesi="+etiketFiyatı);
        indirimOranı =0.1;
        indir();
        indirimOranı=0.1;
        indir();
        indirimOranı=0.1;
        indir();

        System.out.println("indirim sonrası="+etiketFiyatı);// 72.9

    }

    public static void indir(){

        etiketFiyatı*=(1-indirimOranı);//etiket fiyatı indirimli hale geldi
        System.out.println("etiketFiyatı: " + etiketFiyatı);
    }
}
