package j18_Constructor;

public class C03_StudentRunner {
    public static void main(String[] args) {

        C03_Student ogrc1=new C03_Student();
        ogrc1.ad="fatih";
        ogrc1.soyad="Ateş";
        ogrc1.sınıf=1;
        ogrc1.okulNo=1001;
        ogrc1.ortalama=77;
        ogrc1.takdir=false;


        System.out.println("ogrc1="+ogrc1);//ogrc1=j18_Constructor.C03_Student@

        ogrc1.mezuniyet();//agam diploman hayırlı olsun :)



        C03_Student ogrc2=new C03_Student();
        ogrc2.ad="furkanAli";
        ogrc2.soyad="doğan";
        ogrc2.sınıf=1;
        ogrc2.okulNo=2452;
        ogrc2.ortalama=95;
        ogrc2.takdir=true;
        System.out.println("ogrc2"+ogrc2);//ogrc1=j18_Constructor.C03_Student@
ogrc2.mezuniyet();//agam diploman hayırlı olsun :)
    }



}
