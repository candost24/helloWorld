package j23_Varargs_StringBuilder.Varargs;

public class Task03 {
    public static void main(String[] args) {

        // Task-> girilen sayı ilr girilen String lerin en uzun harf sayısını çarpıp printr eden code creat ediniz
        int sayi=5;
        String str1="muharrem";
        String str2="ugur";
        String str3="ebikGabık";

        carpStringEnUzun(sayi,str1,"javacan",str2,str3);//45




    }
public static void carpStringEnUzun(int carpacakSayi,String...str){

        String enUzun="";
        for (String a:str){
            if (a.length()>enUzun.length()){
                enUzun=a;
            }
        }
    System.out.println("agam istediğin değer:"+(carpacakSayi*enUzun.length())+" "+enUzun);
}





}
