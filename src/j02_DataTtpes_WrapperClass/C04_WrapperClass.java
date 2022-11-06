package j02_DataTtpes_WrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {
        String name="Haluk";
        int yas=33;
        System.out.println(name.toUpperCase());



        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
// ancak primitive data turlerinin boyle bir ozelligi yoktur
// primitive data turleri sadece degerleri saklarlar (container) ve herhangi bir özellik(method) vs bulundurmaz.
//Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
// olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
// ara çözüm imkanı sunmuştur.


        String tc="1234455";
        String id="98765";


      int yeniTC=  Integer.valueOf(tc);// tc String değerini int

      int yeniId=  Integer.valueOf(id);// tc String değerini int
        System.out.println("yeniId = " + yeniId);
        System.out.println((yeniId+yeniTC));
        String okulNo="98765";
      // int yeniOkulNo=Integer.valueOf(okulNo);
       // System.out.println("yeniOkulNo="+yeniOkulNo);

        System.out.println("madem geldin dünyaya otur çalış javaya");

        // TASK-> byte short int maximum ve minimum değerlerini print eden code yazınız

        byte maxByteDegeri = Byte.MAX_VALUE;
        byte minByteDegeri = Byte.MIN_VALUE;

        System.out.println("maxByteDegeri = " + maxByteDegeri);
        System.out.println("minByteDegeri = " + minByteDegeri);

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        int a=5;
        System.out.println(a);// 5
        System.out.println(5);// 5


    }
}

