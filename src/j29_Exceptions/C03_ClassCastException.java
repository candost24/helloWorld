package j29_Exceptions;

public class C03_ClassCastException {
    public static void main(String[] args) {
        //ClassCastException ->Birbirine dönüştürülemeuyen data type'lar birbirine dönüştürüüldüğünde oluşan RTE exception dur.
      Object obj="javaCAN'lara selam olsun ";
      String str=(String) obj;//onject data type String data type casting yapılarak atandı
        System.out.println("str ="+ str);//javacanlara selam olsun

        Object sayi1=10;
       // String str2=(String) sayi1;//object datya type String data Type casting yapılarak atandı
        //System.out.println("str2 ="+ str2);//ClassCastException


        try {
            String str2 = (String) sayi1;
        }catch (ClassCastException e){
            System.out.println("agam ınteger object hiç stringe çevrilirmi:(");
        }
        try {
            String str3= (String)sayi1;
            System.out.println("agam try block da  bu yazıyı okuduysan excp fırlatmadı komut sorunsuz");


        }catch (ClassCastException e) {
            System.out.println("agam integer hiç Stringe çevrilirmi");
        }
        System.out.println("agam sorun handele edildi devamke");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur


    }
}
