package j18_Constructor;

public class ElektrikHesapRunner {
    public static void main(String[] args) {

ElektrikHesap fatura=new ElektrikHesap();

fatura.tüketimEkle(350);
fatura.tüketimEkle(50);
        System.out.println();
        fatura.odenecekTutar();
        System.out.println("Toplam tüketilen kw ="+fatura.toplamTuketim+"\n Toplam fatura bedeli = "+fatura.odenecekTutar());





    }
}
