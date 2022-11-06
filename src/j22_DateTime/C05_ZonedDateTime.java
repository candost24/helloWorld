package j22_DateTime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C05_ZonedDateTime {
    public static void main(String[] args) {

        //herhangi bir ülke -sehir ->local tarih ve zaman bilgisi tutar

        LocalDate trhZone=LocalDate.now(ZoneId.of("America/New_York"));//amarica /NewYorlocalinin k
        LocalDate trhZone1=LocalDate.now(ZoneId.of("Japan"));//amarica /NewYorlocalinin k


        System.out.println("trhZone = " + trhZone); //2022-10-25
        System.out.println("trhZone1 = " + trhZone1);//2022-10-26


        ZonedDateTime zdt1=ZonedDateTime.now(ZoneId.of("America/New_York"));
      //  ZonedDateTime zdt3=ZonedDateTime.now(ZoneId.of("America/"));//RTE->yerel saat dilimide tanımlamalıyız
        ZonedDateTime zdt2=ZonedDateTime.now(ZoneId.of("Japan"));

        System.out.println("zdt1 = " + zdt1);
        System.out.println("zdt2 = " + zdt2);
      //  System.out.println("zdt3 = " + zdt3);


    }
}
