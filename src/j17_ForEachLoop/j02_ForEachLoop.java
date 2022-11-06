package j17_ForEachLoop;

public class j02_ForEachLoop {
    public static void main(String[] args) {

        // task array elemanlarının çarpımını print eden code create ediniz...->with for -each

        int arr[][]={{2,3},{4},{5,6,7}};
     int çrpm=1;
     for (int kc[]:arr){
         for (int a:kc){
             çrpm*=a;
         }
     }
        System.out.println("çarpım = "+çrpm);


    }
}
