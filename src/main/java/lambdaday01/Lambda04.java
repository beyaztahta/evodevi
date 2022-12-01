package lambdaday01;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda04 {
     /*
       TASK :
        fields --> Universite (String)
                   bolum (String)
                   ogrcSayisi (int)
                   notOrt (int)
                   olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
                 */
     public static void main(String[] args) {

          Univercity unv1=new Univercity("bogazici","matematik",571,93);
          Univercity unv2=new Univercity("istanbulteknik","matematik",600,81);
          Univercity unv3=new Univercity("bogazici","hukuk",1400,71);
          Univercity unv4=new Univercity("marmara","bilg muh.",1080,77);
          Univercity unv5=new Univercity("odtu","gemi muh.",333,74);

          List<Univercity>list=new ArrayList<>(Arrays.asList(unv1,unv2,unv3,unv4,unv5));

          System.out.println(notOrtalaması(list));
          System.out.println("***********************");
          System.out.println(matematikBolumuVarMı(list));
          System.out.println("***********************");
          System.out.println(ogrencıSayısınaGoreUniSıra(list));
          System.out.println("***********************");
          System.out.println(matBolumSayısı(list));
          System.out.println("***********************");
          System.out.println(enBuyukNotOrt(list));
          System.out.println("***********************");
          System.out.println(enKucukNotOrt(list));

     }

     //task 01--> notOrt'larinin 74' den buyuk oldgunu kontrol eden prg. create ediniz.

     public static boolean notOrtalaması(List<Univercity>list){
        return list.
                stream().
                allMatch(t-> t.getNotOrtalama()>74);

     }

    //task 02-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden prg create ediniz.

     public static boolean matematikBolumuVarMı(List<Univercity>list){

          return list.stream().anyMatch(t-> t.getBolum().
                  toLowerCase().
                  contains("matematik"));
     }

     //task 03-->universite'leri ogr sayilarina gore b->k siralayiniz.

     public static List<Univercity> ogrencıSayısınaGoreUniSıra(List<Univercity>list){
            return list.
                  stream().
                  sorted(Comparator.comparing(Univercity::getOgrenciSayısı).reversed()).
                  collect(Collectors.toList());
     }

     //task 04-->"matematik" bolumlerinin sayisini  print ediniz.

     public static int matBolumSayısı (List<Univercity>list){
       return    (int)list.
                  stream().
                  filter(univercity -> univercity.getBolum().contains("matematik")).
                  count();
     }


     //task 05-->Ogrenci sayilari 550'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.

     public static OptionalInt enBuyukNotOrt (List<Univercity>list){
         return list.
                 stream().
                 filter(t-> t.getOgrenciSayısı()>550).
                 mapToInt(t-> t.getNotOrtalama()).
                 max();
     }

     //task 06-->Ogrenci sayilari 1050'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.

     public static OptionalInt enKucukNotOrt(List<Univercity>list){
         return list.
                  stream().
                  filter(univercity -> univercity.getOgrenciSayısı()<1050).
                  mapToInt(t-> t.getNotOrtalama()).
                  min();
     }





























     }
