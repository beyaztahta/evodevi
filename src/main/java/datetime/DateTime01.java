package datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {


        //Anlık tarihi ekrana yazdıran kodu yazdırınız
        LocalDate anlık= LocalDate.now();
        System.out.println(anlık);

        //Anlık zamanı ekrana yazdıran kodu yazdırınız

       LocalTime time= LocalTime.now();
        System.out.println(time);

        //Anlık tarihi ve anlık zamanı ekrana yazdıran kodu yazdırınız
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);

        //Japonyadaki Anlık tarihi ve anlık zamanı ekrana yazdıran kodu yazdırınız

        LocalDateTime japan=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(japan);

        LocalDateTime bursa=LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(bursa);

        //Bugunden 789 gun sonra emekli olacagınıza gore ,emeklilik tarihini hesaplayan kodu yazınız.

        LocalDate date1=LocalDate.of(2022,11,06);
        LocalDate retireDate=date1.plusDays(789);
        System.out.println(retireDate);

        LocalDate date2=LocalDate.of(2022,11,3);
        LocalDate retire=date2.plusDays(1025);
        System.out.println(retire);

        //İki cocugunuzun dogum tarihleri arasındaki farkı hesapalyan kodu yazınız.

        LocalDate mehmetEmin=LocalDate.of(2017,02,28);
        LocalDate sumeyraGul=LocalDate.of(2023,8,28);

        Long diff= ChronoUnit.DAYS.between(mehmetEmin,sumeyraGul);
        System.out.println(diff);

      //Tom,Ali den 3 yıl 8 ay 13 gun sonra dogdu.Ali ise Veli den 1 yıl 15 gun once dogdu. Tomun dogum tarihi 18 ksaım 2011 ise Veli
        //ile Ali nin dogum tarihlerini bulunuz.
         LocalDate tom=LocalDate.of(2011, Month.NOVEMBER,18);
         LocalDate ali=tom.minusYears(3).minusMonths(8).minusDays(13);
         LocalDate veli=ali.plusYears(1).plusDays(15);
        System.out.println("Veli nin dogum tarihi " + veli);
        System.out.println("Ali nin dogum tarihi " + ali);

     //İstanbul un fethi ile cumhuriyetin kurulması arasında kac ay oldugunu gosteren kodu yazınız.

        LocalDate fetih=LocalDate.of(1453,05,29);
        LocalDate cumhuriyet=LocalDate.of(1923,10,29);
        Long ayFarkı=ChronoUnit.MONTHS.between(fetih,cumhuriyet);
        System.out.println(ayFarkı);

     // Kullanicidan dogdugu ay ve gun bilgilerini alarak burcunu hesaplatan kodu yaziniz
//
//        Scanner input=new Scanner(System.in);
//        System.out.println("lutfen dogdugunuz ayı yazı ile giriniz.");
//        String ay= input.next().toLowerCase();
//        System.out.println("lutfen dogdunuz gunu gririniz.");
//        int gun= input.nextInt();
//
//        String burc="";
//        if(ay.equalsIgnoreCase("ocak")){
//           if(gun>22){
//               burc="kova";
//           }else{
//               burc="oglak";
//           }
//        }if(ay.equalsIgnoreCase("subat")){
//            if(gun>20){
//                burc="balık";
//            }else{
//                burc="kova";
//            }
//        }if(ay.equalsIgnoreCase("mart")){
//            if(gun>21){
//                burc="koc";
//            }else{
//                burc="balık";
//            }
//        }if(ay.equalsIgnoreCase("nisan")){
//            if(gun>21){
//                burc="boga";
//            }else{
//                burc="koc";
//            }
//        }if(ay.equalsIgnoreCase("mayıs")){
//            if(gun>22){
//                burc="ikizler";
//            }else{
//                burc="boga";
//            }
//        }if(ay.equalsIgnoreCase("haziran")){
//            if(gun>23){
//                burc="ikizler";
//            }else{
//                burc="yengec";
//            }
//        }if(ay.equalsIgnoreCase("temmuz")){
//            if (gun > 23)
//                burc = "Aslan";
//            else
//                burc = "Yengec";
//        }
//        if (ay.equalsIgnoreCase("Agustos")) {
//            if (gun > 22)
//                burc = "Basak";
//            else
//                burc = "Aslan";
//        }
//        if (ay.equalsIgnoreCase("Eylul")) {
//            if (gun > 23)
//                burc = "Terazi";
//            else
//                burc = "Basak";
//        }
//        if (ay.equalsIgnoreCase("Ekim")) {
//            if (gun > 23)
//                burc = "Akrep";
//            else
//                burc = "Terazi";
//        }
//        if (ay.equalsIgnoreCase("Kasim")) {
//            if (gun > 22)
//                burc = "Yay";
//            else
//                burc = "Akrep";
//        }
//        if (ay.equalsIgnoreCase("Aralik")) {
//            if (gun > 22)
//                burc = "Oglak";
//            else
//                burc = "Yay";
//        }
//        System.out.println(gun+" " + ay+ " " + "tarihine dogduysanız burcunuz " + burc);

        //Mevcut saat diliminden ileri geri gitme
        //Mevcut saat diliminizden 2 saat ileriyi yazdirin

        LocalTime mevcutSaatDilimi= LocalTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm a");
        String format=dtf.format(mevcutSaatDilimi.plusHours(2));
        System.out.println(format);

        //Javadan aldıgınız Date ı "ay/gun/yıl" ve "gun/ay/yıl" olarak yazırınız.

        LocalDate dtf1=LocalDate.now();
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String str=dtf2.format(dtf1);
        System.out.println(str);

         DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("d/MMMM/yyyy");
         String str1=dtf3.format(dtf1);
         System.out.println(str1);
    //Japonya ile almanya arasındaki zaman farkını hesalayan kodu yazınız.
        LocalDateTime dtf4=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime dtf5=LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        Long fark=ChronoUnit.HOURS.between(dtf5,dtf4);
        System.out.println(fark);


    }
}