package j22_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {

        LocalTime gece=LocalTime.of(00,17);
        LocalTime oglen=LocalTime.of(13,24);


        Duration fark= Duration.between(gece, oglen);//OGLEN ZAMANI İLE GECE ARASINDAKİ FARKI ATANIR
        System.out.println("fark = " + fark);
        System.out.println("fark.getSeconds() = " + fark.getSeconds());//fark bilgiisindeki saniye datası alındı

        System.out.println("fark.getSeconds() = " + fark.getNano());
        System.out.println("fark.getSeconds() = " + fark.toHours());
        System.out.println("fark.getSeconds() = " + fark.toMinutes());//fark bilgiisi dakikakaya atanır
        System.out.println("fark.getSeconds() = " + fark.toMillis());



    }
}
