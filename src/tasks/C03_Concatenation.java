package tasks;

public class C03_Concatenation {
    public static void main(String[] args) {
        String name="cebrail";
        String soyad="doğan";
        String yas="36";
        int a=7;
        int b=11;

        // birden çok string variable ile  farklı variable 'ler + ile işleme alınırsa
        //java birleştirme yaparak yeni bir string oluşturur

        System.out.println(name+soyad+a+b);//
        System.out.println(a+name+soyad+b);//
        System.out.println(a+b+name+soyad);//
        System.out.println(""+a+b);//
        System.out.println(name+soyad+(a+b));//
        System.out.println((a+b)+name+soyad);//
        System.out.println(a+name+soyad+b);//
        System.out.println(name+((a-b)+(a-b)));//


        char ch='1';
        System.out.println(name+ch);
        System.out.println(a+ch+name);
        System.out.println(name+(ch+b));
        System.out.println(a+name+ch);

        /* TRICK -> char data turu isleme girdigi variables'in turune gore farkli işlem yapar
        eger isleme girdigi variables  aritmetik bir islemse  ascii değeri ile işelm yapar ->
       */










    }
}
