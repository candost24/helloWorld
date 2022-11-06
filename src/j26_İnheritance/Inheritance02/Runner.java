package j26_İnheritance.Inheritance02;

import j26_İnheritance.Inheritance01.Koyun;
import j26_İnheritance.Inheritance01.Paluk;

public class Runner {

/*
 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
 3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
 4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları içim kullanılır.
 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
   denir.
 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
 9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/





    public static void main(String[] args) {

      Kedi k1=new Kedi();
        System.out.println("k1.a:"+k1.a);
        System.out.println("k1.c:"+k1.c);
        System.out.println("k1.d:"+k1.d);
        System.out.println("k1.m:"+k1.m);

/*
  Ayni isimli variable'lardan hangisinin kullanildi
olusturulan object'in data type'ina göre bilinir
Variable'i arastirmaya data type'i classindan baslanır.
*/


    k1.mA();//hayvancık class call
        k1.mC();//kedi class call
        k1.mM();// mamal class call
/*
 Method cagirilirken ayni isimli methodlardan
 hangisinin kullanilacagina Constructor karar verir.
 Methodlari arastirmaya Consctuctor ismini tasiyan
 class'dan baslayin ve parentlarda arastirmaya devam edin.
 */




Mammal k2=new Kedi("kevser");
        System.out.println("k2.c= "+k2.c);
        System.out.println("k2.a= "+k2.a);
        System.out.println("k2.m= "+k2.m);
        //k2.d->CTE K2  obj DATA TYPE MAMMAL CLASS D VARİABLE YOK CALL EDİLEMZ

k2.mA();//mA->hayvancık class meth call
k2.mC();//mC->kedi class meth call
k2.mM();//mM->mammal class meth call

        Hayvancık k3=new Kedi();
        System.out.println("k3.m="+k3.m);
        //k3.c->data type hayvancık class olduğ için classda olmayacak
        k3.mA();
        k3.mM();
        Mammal m1=new Mammal('$');
        System.out.println("m1.m="+m1.m);
        System.out.println("m1.a="+m1.a);
        System.out.println("m1.c="+m1.c);
        // m1.d-> parent Mammal Class Child Kedi Class'dan variable call edemez
        m1.mA();//hayvancık class call
        m1.mC();//mammal class call
        m1.mM();//mammal class call


    }
}
