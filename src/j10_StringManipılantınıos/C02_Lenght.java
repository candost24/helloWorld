package j10_StringManipılantınıos;

public class C02_Lenght {
    public static void main(String[] args) {
        /*length() methodu girlen string in uzunluğunu:içişnde bulunan karakter sayısını return eder.
        butun kararkterlerin sayıp adadini veri*/
         String str="madem geldin dünyaya oturçalış javaya";
         int strKrtrSayisi=str.length();
        System.out.println(str);//mmadem geldin dünyaya otur çalış javaya
        System.out.println(strKrtrSayisi);//38
        System.out.println(str.length());//38


       String str1="";
        System.out.println(str1.length());
        String str2=" ";



        String str3=null;
        System.out.println(str3.length());//run tıme error
        // TRICK->
        /*null case sensitivedir.yani null veya null yazılamaz
        null bir değer değildir*/
        String name;// atanmamaış string metod çalışmaz cte verir.
       // name.concat(str1);



    }
}
