package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTime02 {
    public static void main(String[] args) {

        //1) Ali'nin kaç gün yaşadığını bulan kodu yazınız.
        //Ali'nin doğum tarihi 12 Mayıs 2002'dir.

        LocalDate dt=LocalDate.of(2002,05,12);
        LocalDate bugunTarihi=LocalDate.now();

        long yasadıgıGunSayısı= ChronoUnit.DAYS.between(dt,bugunTarihi);
        System.out.println(" yasadıgıGunSayısı" + " "+  yasadıgıGunSayısı);

         LocalDate dgt=LocalDate.of(2002,03,6);
         LocalDate now=LocalDate.now();
         long fark=ChronoUnit.DAYS.between(dgt,now);

      //  2) Ali'nin kaç ay yaşadığını bulan kodu yazınız.
      //  Ali'nin doğum tarihi 4 Haziran 1997'dir.

      LocalDate date=LocalDate.of(1991,6,4) ;
      LocalDate localdate=LocalDate.now();

      Long ali=ChronoUnit.MONTHS.between(date,localdate);
      System.out.println("ali nin kac ay yasadıgı= " + ali);

      //3) Ali'nin doğum tarihi 4 Haziran 1997'dir. Ali'nin doğum tarihinden 2 yıl, 3 ay ve 12 gün
        //sonraki tam tarihi bulmak için kodu yazınız.

     LocalDate tarih=LocalDate.of(1997,6,4);
     LocalDate sonrakiTarih=tarih.plusYears(2).plusMonths(3).plusDays(12);
     System.out.println("Kesin Tarih "+" "+ sonrakiTarih);

     /*
     4) Ali, 29 Ekim 1923'ten 45 yıl 8 ay 5 gün sonra doğmuştur.
       Veli, 15 Eylül 1993'ten 24 yıl 2 ay 11 gün önce doğmuştur.
       Ali ve Veli'nin kesin doğum tarihini hesaplamak için kodu yazınız.
       Ali ve Veli'nin doğum tarihinin aynı olup olmadığını kontrol etmek için kodu yazınız.
      */
      LocalDate ekim=LocalDate.of(1923,10,29);
      LocalDate alininDogumTarihi=ekim.plusYears(45).plusMonths(8).plusDays(5);

      LocalDate eylul=LocalDate.of(1993,9,15);
      LocalDate velininDogumTarihi=eylul.minusYears(24).minusMonths(2).minusDays(11);

        System.out.println("Alini dogum tarihi: "+" "+alininDogumTarihi);
        System.out.println("Velinin dogum tarihi "+" "+velininDogumTarihi);
        System.out.println("*******************************************");

        if(alininDogumTarihi.equals(velininDogumTarihi)){
            System.out.println("Dogum tarihleri aynıdır.");
        }else System.out.println("Dogum tarihleri aynı degildir.");

    /*
         5) Veli, Ali'den 3 yıl 11 gün sonra doğmuştur.
          Ali size doğum tarihi bilgisini 24 Kasım 2012 olarak vermiştir.
          Veli'nin doğum tarihini hesaplamak için gerekli kodu yazınız.
     */
       LocalDate a=LocalDate.of(2012,11,12);
       LocalDate v=a.plusYears(3).plusDays(11);
        System.out.println("velinin dogum tarihi = " + v);

//6) Kendinizin ve çocuğunuzun doğum tarihi için Tarih Değerleri oluşturup, ardından farkı gün
//olarak hesaplayınız.

        LocalDate elif=LocalDate.of(1991,11,3);
        LocalDate mehmetEmin=LocalDate.of(2017,02,28);
       long diff=ChronoUnit.DAYS.between(elif,mehmetEmin);
        System.out.println("Annesi ile oglunun iki tarih arasındaki gun sayısı = " + diff);


        //7) Belirli bir tarihte yılın son 2 hanesini alınız.

        LocalDate bugunTarih = LocalDate.of(1996, 8, 21);
        int sonIkiRak = bugunTarih.getYear()%100;
        System.out.println("yilin son 2 hanesi : " + sonIkiRak);

     /*
     8) Belirli bir yılın "Artık yıl" olup olmadığını kontrol etmek için kodu yazınız.
    Artık Yıl:
      i) Bir yıl 100'e ve 400'e tam bölünüyorsa buna artık yıl denir. Örneğin; 2000 artık yıl, 1900
     değildir.
     ii) Bir yıl 100'e ve 4'e tam bölünemiyorsa artık yıl olarak adlandırılır. Örneğin; 2004 artık yıl, 2007
     değildir.
      */
      LocalDate artıkYıl=LocalDate.of(1996,04,07);
      boolean artıkYılMı=artıkYıl.isLeapYear();
      System.out.println("artıkYılMı = " + artıkYılMı);

      LocalDate artk=LocalDate.of(1991,11,3);
      boolean leapyear=artk.isLeapYear();
        System.out.println("leapyear = " + leapyear);

       // 9) İki farklı tarihin ay numaralarının toplamını bulunuz.

        LocalDate tarih1 = LocalDate.of(1996, 8, 21);
        LocalDate tarih2 = LocalDate.of(2015, 3, 12);
        System.out.println("ay numaraları toplam degeri: "+ tarih1.getMonth()+tarih2.getMonth());

        System.out.println("==========================");
        System.out.println("Gun numaraları carpımı: " + tarih1.getDayOfMonth()*tarih2.getDayOfMonth());

     //10) İki farklı tarih için saat farkını bulunuz.


        LocalDate tarihx = LocalDate.of(1996, 8, 21);
        LocalDate tarihy = LocalDate.of(2015, 3, 12);
        long saatFarki = ChronoUnit.HOURS.between(tarihx, tarihy);
        System.out.println("Saatler arasindaki fark : " + saatFarki);


    }
}
