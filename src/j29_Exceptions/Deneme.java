package j29_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
// // LocalDate date=LocalDate.of(2022,11,33);//RTE -> DateTimeException
        try{
            LocalDate date=LocalDate.of(2022,11,29);//yukarıdakı localdatetime sınırları dışında giliş yapıldırsa  yukarıdaki kuşul düzltilerek yazılır
            //eger düzeltilmezse catch  yaklar ve hatadsını beliritr

            System.out.println("kardeşim try blok da  bu yazıyı okuduysan exception fırlatmadı fırlatmadı ");
        }catch (DateTimeException e) {
            System.out.println("agam ahanda hatan "+e.getMessage());
        }
        Scanner sc= new Scanner(System.in);
        System.out.println("kardeşim yışını girermisin");
        int age=sc.nextInt();
        try {
            if (18<age){
                throw new IllegalArgumentException();

            }else System.out.println("agam ehliyete başvura bilirsin"+age);
        }catch (IllegalArgumentException e) {
            System.out.println("kardeşim hatan bu"+e.getMessage());

        }



    }
}
