package j23_Varargs_StringBuilder.Varargs;

public class C02_Varargs {
    public static void main(String[] args) {

        /*
        *
        * arr ve varargs method:
        * */

        int arr[]={24,42,33,19,34,45,58,38};

        System.out.println("arrTopla(arr) = " + arrTopla(arr));//293
        System.out.println("varargs int deger toplam : "+varargsTopla(24, 42, 33, 19, 34, 45, 58, 38));//293
        System.out.println("varargs array değer toplam : "+varargsTopla(arr));//293
        // ahan da Trick köşesinde böğün :varargs method parametreleri array gibi tanımladığı için
        // varargs methoda parametre olarak array de verilebilir
        //task1->verilen array elemanları toplamını print eden method creat ediniz
        //task2->task1 varargs ile çalışınız

    }

    public static int arrTopla(int[]a){

        int toplam =0;
        for (int w:a){
            toplam+=w;
        }
        return toplam;
    }
    public static int varargsTopla(int...b){

        int toplam =0;
        for (int s:b){
            toplam+=s;
        }
        return toplam;
    }



}
