package lambdaday01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CanRunner {

     /*Can sınıfını kullanarak 4 nesne oluştur(
           private String sezonu;
            private String kursuAdı;
            private int ortalamaPuan;
            private int ogrenciSayısı;
            ) */

    //Onları bir listeye ekle
    //Tüm ortalama puanların 98'den az olup olmadığını kontrol edin
    //Tüm ders adlarının "Gün" kelimesini içerip içermediğini kontrol edin
    //Herhangi bir öğrenci sayısının 154 olup olmadığını kontrol edin
    // Herhangi bir mevsimin Kış olup olmadığını kontrol edin
    //Herhangi bir öğrenci sayısının 100 olup olmadığını kontrol edin
    //Öğeleri ortalama puana göre doğal sırayla sırala
    //Öğeleri öğrenci sayısına göre ters sırada sırala
    //Kurs adına göre öğeleri ters sırada sıralayın


    public static void main(String[] args) {
         Can can1=new Can("kıs","matematik",85,150);
         Can can2=new Can("yaz","matematik",75,80);
         Can can3=new Can("yaz","fen",65,154);
         Can can4=new Can("kıs","turkce",70,125);
         Can can5=new Can("kıs","fen",70,145);

         List<Can> list=new ArrayList<>(Arrays.asList(can1,can2,can3,can4,can5));
         System.out.println(tumOrt98DenAzMı(list));
         System.out.println("******************");
        System.out.println(gunKelımesıIcerıyorMu(list));
        System.out.println("******************");
        System.out.println(students154Number(list));
        System.out.println("******************");
        System.out.println(sezonKısMı(list));
        System.out.println("******************");
        System.out.println(students100Number(list));
        System.out.println("******************");
        System.out.println(ortamayaGoreSıralama(list));
        System.out.println("******************");
        System.out.println(ogrenciSayısınaGoreTerstenSıralama(list));
        System.out.println("******************");
        System.out.println(kursAdınaGoreTerstenSıralama(list));


    }
    //Tüm ortalama puanların 98'den az olup olmadığını kontrol edin

    public static boolean tumOrt98DenAzMı( List<Can> list){
       return  list.
               stream().
               allMatch(Can-> Can.getOrtalama()<98);  //true
    }

    //Tüm ders adlarının "Gün" kelimesini içerip içermediğini kontrol edin

    public static boolean gunKelımesıIcerıyorMu(List<Can> list){
        return list.
                stream().allMatch(Can-> Can.getKursAdı().contains("Gun"));  //false
    }

    //Herhangi bir öğrenci sayısının 154 olup olmadığını kontrol edin

   public static boolean students154Number(List<Can> list){
      return  list.
              stream().
              anyMatch(Can-> Can.getOgrenciSayısı()==154);//true
   }

   // Herhangi bir mevsimin Kış olup olmadığını kontrol edin

    public static boolean sezonKısMı(List<Can> list){
      return  list.
              stream().
              anyMatch(Can-> Can.getKurSezonu().toLowerCase().contains("kıs")); //true
    }
    //Herhangi bir öğrenci sayısının 100 olup olmadığını kontrol edin

    public static boolean students100Number(List<Can> list){
        return  list.
                stream().
                anyMatch(Can-> Can.getOgrenciSayısı()==100);//false
    }

    //Öğeleri ortalama puana göre doğal sırayla sırala

    public static List<Can> ortamayaGoreSıralama(List<Can> list){
        return list.
                stream().
                sorted(Comparator.comparingInt(Can::getOrtalama)).
                collect(Collectors.toList());

    }

    //Öğeleri öğrenci sayısına göre ters sırada sırala

    public static List<Can> ogrenciSayısınaGoreTerstenSıralama(List<Can> list){
        return list.
                stream().
                sorted(Comparator.comparing(Can::getOgrenciSayısı).reversed()).
                collect(Collectors.toList());

    }

    //Kurs adına göre öğeleri ters sırada sıralayın

    public static List<Can> kursAdınaGoreTerstenSıralama(List<Can> list){
        return list.
                stream().
                sorted(Comparator.comparing(Can::getKursAdı).reversed()).
                collect(Collectors.toList());

    }





}
