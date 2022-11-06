package L01_ForLoop;

public class C03_NesteadForLoops {
    public static void main(String[] args) {

        /*
        * eger bir döngünün body sinde  bir döngü bulunuyorsa bu tür döngülere  nested-loop -> içiçe döngü
        * denir.
        * iç döngü dış dögünün her adımında çalışır.
        * içiçe döngülerede emn içteki döngü en önce çalışır
        * */


        for (int apt=0; apt<=10;apt++){
            System.out.println("apt"+apt);

            for(int daire=1; daire<6; daire++){
                System.out.println("apt"+apt+"için daire dögü"+daire);
            }

        }








    }
}
