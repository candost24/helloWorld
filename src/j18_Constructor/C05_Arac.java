package j18_Constructor;

public class C05_Arac {
    /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */


    int maxHız;
    String model;
    public C05_Arac(int maxHız){//1 pli cons
        this(180,"hacıMurat");//2 p'li cons. call edildi..ilk satıra yazılmalı
        // yoksa cte verir






        this.maxHız=maxHız;

    }
    public C05_Arac(){

    }
    public C05_Arac(int maxHız, String model) {// 2PLİ CONS.

        this.maxHız=maxHız;
        this.model=model;
        System.out.println("agam bu yazıyı okuduysan 2 pli cons.call edilmiştir :)");


    }
    public C05_Arac(String model,int maxHız){
        this.maxHız=maxHız;;
        this.model=model;
        System.out.println("2 pli cons call edilmiştir");
    }






}
