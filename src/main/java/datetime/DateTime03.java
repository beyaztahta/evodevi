package datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateTime03 {
    public static void main(String[] args) {
    //artık yıl sorusu
    LocalDate tarih= LocalDate.of(1998,12,3);
    boolean artıkYılMı=tarih.isLeapYear();
        System.out.println("artıkYılMı = " + artıkYılMı);

/*
1) Eğer saat
i) 24:00 ile 05:00 arasında ise konsola 'Uyku zamanı' yazdırınız.
ii) 08:00 ile 16:00 arasında ise konsola 'Çalışma zamanı' yazdırınız.
iii) 19:00 ile 22:00 arasında ise konsola 'Aile zamanı' yazdırınız.
iv) Diğerleri için konsolda 'Kişisel zaman' yazdırınız.
 */

        LocalTime bugun=LocalTime.now();
        int saat=bugun.getHour();

        if(saat>0 && saat<5){
            System.out.println("Uyku zamanı");
        }else if(saat>8 && saat<16){
            System.out.println("Calısma Zamanı");
        }else if(saat>19 && saat<22){
            System.out.println("Aile Zamanı");
        }else{
            System.out.println("Kisisel Zaman");
        }

//2) Japonya saat dilimi ile Almanya saat dilimi arasındaki saat farkını bulmak için kodu yazınız.

     LocalDateTime japan= LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
     System.out.println(japan);

    LocalDateTime alman=LocalDateTime.now(ZoneId.of("Europe/Berlin"));
     System.out.println(alman);

     long fark= ChronoUnit.HOURS.between(japan,alman);
        System.out.println("japonya ve almanya arasındaki saat fark = " + fark);

//3) Ali 5 Şubat 2015 TRT 10:00'da İstanbul' da, Mark 5 Şubat 2015 12:00 EST' de ABD' de
//doğmuştur. Ali'nin doğum saati ile Mark'ın doğum saati arasındaki saat cinsinden fark
//nedir?

 LocalDateTime ali=LocalDateTime.of(2015,2,5,10,0,0);
 LocalDateTime mark=LocalDateTime.of(2015,2,5,12,0,0);
 ZonedDateTime markınDy=mark.atZone(ZoneId.of("America/New_York"));

  long fark1=ChronoUnit.HOURS.between(ali,markınDy);
  System.out.println(fark1);

//4) Ali 5 Şubat 2015 saat 10:15 EST'de doğmuştur, Veli 6 Mart 2015 saat 12:25 EST'de
//doğmuştur. Ali ve Veli'nin doğum süreleri arasındaki fark nedir?

LocalDateTime alicik=LocalDateTime.of(2015,2,5,10,15);
LocalDateTime veli=LocalDateTime.of(2015,3,6,12,25);
long fark2=ChronoUnit.MINUTES.between(alicik,veli);
        System.out.println("fark2 = " + fark2);


   //5) Mark 23.02.2018 tarihinde saat 15:25'te GMT ' de doğmuştur, Mark'ın Japonya'daki tam
        //doğum tarihi ve saati nedir?

        LocalDateTime gmt=LocalDateTime.now(ZoneId.of("GMT"));
        LocalDateTime tokyo=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        long fark3=ChronoUnit.HOURS.between(gmt,tokyo);
        LocalDateTime tamTarih=LocalDateTime.of(2018,2,23,15,25).minusHours(fark3);
        System.out.println("tamTarih = " + tamTarih);


    }
}
