package j22_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {

        //period -> iki tRİH arasında geçen tekraralanabilen zamanı tutar..

        LocalDate bugun=LocalDate.now();

        LocalDate fthBirthDay=LocalDate.of(1993,5,19);
        Period fark=Period.between(bugun,fthBirthDay);
        System.out.println("fark = " + fark);//fark =p-29Y-5M-7D

        System.out.println("fark.toTotalMonths()="+ fark.toTotalMonths());
        System.out.println("fark.getDays()= "+ fark.getDays());//fark datasının gun bilgisi

        Period period5Gun=Period.ofDays(5);//5 AYDA BİR TEKRARLANAN    PERİOD
        Period period7ay=Period.ofMonths(7);//7 AYDA BİR TEKRARLANAN    PERİOD
        Period periodX=Period.ofMonths(7).ofDays(21);//7 AYDA BİR TEKRARLANAN PERİOD


        bugun=bugun.plus(period5Gun);//bugune 5 gunluk period eklendi
        System.out.println("bugun = " + bugun);
        bugun=bugun.minus(period7ay);//bugune 7 aylık period geri gidildi
        System.out.println("bugun = " + bugun);
        bugun=bugun.plus(periodX);
        System.out.println("bugun = " + bugun);

//task -> 5.9.2022 de başlayan  kurs 9 ay olduğuna göre bitiş tarihini print eden code create ediniz.

        LocalDate kursBaslangıç=LocalDate.of(2022,9,5);
        System.out.println("kursBaslangıç = " + kursBaslangıç);
        Period kursSure=Period.ofMonths(9);// KUURS SUERESİ 9 ay olarak atandı
        System.out.println("kursBaslangıç.plus(kursSure)="+kursBaslangıç.plus(kursSure));

        System.out.println("kurs bitis tarihi : "+kursBaslangıç.plus(kursSure).format(DateTimeFormatter.ISO_DATE));
//ISO->International organizatıon for satandardzation

    }
}
