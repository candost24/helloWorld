package j23_Varargs_StringBuilder.Varargs;

public class Task02 {
    public static void main(String[] args) {
        /*
        *
        * task->
        * girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayııyı çarpan METHPD create ediniz.
        * */
        System.out.println("toplaCarp2, 24, 23, 38, 33, 21, 59, 26, 10 "+toplaCarp(2, 24, 23, 38, 33, 21, 59, 26, 10));
int arrTop[]={24,23,38,33,21,59,26,10};
        System.out.println("toplaCarp(3,arrTop)="+toplaCarp(2,arrTop));

    }
    public static int toplaCarp(int carpilacakSayi,int...toplanacakSayılar){

        int topla=0;
        for (int a:toplanacakSayılar){
            topla+=a;

        }
        return carpilacakSayi*topla;
    }
}
