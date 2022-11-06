package j26_İnheritance.Inheritance01;

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

        Hayvancık hyvn = new Hayvancık();
        hyvn.hareket();
        hyvn.içme();
        hyvn.yeme();

        System.out.println("  ***   ");

        Mammal m1 = new Mammal();
        m1.sutBeslenme();//child mammal class call
        m1.dogum();//chil mammal class call
        m1.içme();//parent Hayvancık class call
        m1.yeme();//parent Hayvancık class call
        m1.hareket();//parent Hayvancık class call

        System.out.println("    ****    ");

        Paluk hamsi = new Paluk();//
        hamsi.ızgaraTava();//
        hamsi.hareket();//parent hayvancık class call
        hamsi.yeme();//parent hayvancık class call
        hamsi.içme();//parent hayvancık class call


        Kedi kd = new Kedi();
        kd.cırmala();
        kd.içme();
        kd.hareket();
        kd.yeme();
        kd.dogum();
        kd.sutBeslenme();

        System.out.println("    +++++     ");

        Koyun ky= new Koyun();
        ky.semir();
        ky.hareket();
        ky.yeme();
        ky.içme();



    }
}
