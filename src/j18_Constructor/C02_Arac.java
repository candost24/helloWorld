package j18_Constructor;

public class C02_Arac {
    //Fiedles
    String marka;
    String model;
    int km=10;
    double motorHcm;
    boolean vitesAuto=false;
    boolean ikinciEl;
    int yıl;

    public static void main(String[] args) {
        C02_Arac arac1 = new C02_Arac();
       arac1.ikinciEl=true;
       arac1.marka="volvo";
       arac1.km=50000;
       arac1.model="xc60";
       arac1.motorHcm=2.4;

        System.out.println( arac1.marka+" "+arac1.model+" "+arac1.km+" "+arac1.yıl+" "+arac1.motorHcm+""+arac1.ikinciEl+" ");

       // tas-> 2. bir aracın tum field larını atayarak print ediniz


        C02_Arac myCar = new C02_Arac();
        myCar.ikinciEl=true;
        myCar.marka="honda";
        myCar.km=11;
        myCar.model="cıvıc";
        myCar.motorHcm=2.0;
        myCar.yıl=2022;


        System.out.println(myCar.marka+" "+myCar.model+" "+myCar.km+" "+myCar.model+" "+myCar.motorHcm+" "+myCar.yıl);
        System.out.println( "myCar="+myCar);
    }




}
