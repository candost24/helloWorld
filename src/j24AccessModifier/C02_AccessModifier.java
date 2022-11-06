package j24AccessModifier;

public class C02_AccessModifier {
    public static void main(String[] args) {

        // C01_AccessModifier obj1 = new C01_AccessModifier();//private p'siz cons calll edilemz
        C01_AccessModifier obj2 = new C01_AccessModifier(23, 45);//publiv 2 p'li cons call edildi
        C02_AccessModifier semra = new C02_AccessModifier();
        //C01_AccessModifier obj4 = new C01_AccessModifier()//bu call edilemez

        System.out.println("obj2.defaultYas="+obj2.defaultYas);
        obj2.protectedMethod();
        System.out.println("obj2.publicYas="+obj2.publicYas);//48
        System.out.println("obj2.protectedYas="+obj2.protectedYas);//40
    }
}
