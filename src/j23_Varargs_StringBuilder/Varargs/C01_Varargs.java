package j23_Varargs_StringBuilder.Varargs;

public class C01_Varargs {
    public static void main(String[] args) {


// verilenn iki sayı toplamını print eden code creat ediniz
int sayi1=24;
int sayi2=27;
int sayi3=46;
int sayi4=10;

topla(sayi1,sayi2);
topla(sayi3,sayi2);
topla(sayi1,sayi4);
//verilen üçsayı toplamını creat eden code creat ediniz
topla(sayi1,sayi4,sayi3);
        System.out.println("   ***  varags method   ***   ");

        toplaVarargs(sayi1,23,sayi2,sayi3);// 4 p
        toplaVarargs(44,23,62,sayi1,sayi3);// 5 p
        toplaVarargs(sayi2,sayi3);// 2 p

// verilen string'lerin en fazla karaktere sahip olanı print eden method creatediniz->>parametre sayısı belirli değil
        enUzunKelime("aga","fatih","zeyyid");
        enUzunKelime("sümeyra","cebrail","ali");
    }
    public static void topla(int a, int b){
        System.out.println("sayılar toplamı:"+(a+b));
    }

public static void topla(int a,int b,int c){

    System.out.println("sayılar toplamı:"+(a+b+c));
}
public static void toplaVarargs(int...a){
        int toplam=0;
        for (int w:a){
            toplam+=w;
        }

    System.out.println("sayıların toplamı:"+toplam);
}

public static void enUzunKelime(String...str){

        String enUzun="";

        for (String w:str){

            if (w.length()>enUzun.length()){
                enUzun=w;
            }
        }
    System.out.println("enUzunKelime:"+enUzun);
}








}
