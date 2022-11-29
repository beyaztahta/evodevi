package lambdaday01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda03 {
    public static void main(String[] args) {
        List<String> ikram=new ArrayList<>(Arrays.asList("triliçe","hacuvdilim","guvec","kokoreç","küsleme","arabaşı","waffle","kunefe","guvec"));
        tekrarsızBuyukHarf(ikram);
        System.out.println("\n************************");
        chracterTersSıralı(ikram);
        System.out.println("\n************************");
        characterElKckByk(ikram);
        System.out.println("\n************************");
        karakterSayıı7Ve7DenAzOlmaDurumu(ikram);
        System.out.println("\n************************");
        wIleBaslama(ikram);
        System.out.println("\n************************");
        xIleBiten(ikram);
        System.out.println("\n************************");
        karakterSayısıEnBuyukEleman(ikram);
        System.out.println("\n************************");
         ilkElamanHaric(ikram);


    }

  //  Task 1: List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.

     public static void tekrarsızBuyukHarf(List<String> ikram){
        ikram.
                stream()  ///akısı gtırdım
                .map(String::toUpperCase).//buyuk harf istedigi için listimde degişiklik olcak bu sebepten map kullandım
                sorted().// dogal sıralama istedigi
                distinct().//tekrarsız yazdırdım
                forEach(Lambda01::print);
     }


    // Task -2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..

    public static void chracterTersSıralı(List<String> ikram){
        ikram.
                stream().
                map(String::length).
                sorted(Comparator.reverseOrder()).
                distinct().
                forEach(Lambda01::print);
    }

    // Task-3 : List elemanlarini character sayisina gore kckten byk e gore print ediniz..

       public static void characterElKckByk(List<String> ikram){

        ikram.
                stream().
                sorted(Comparator.comparing(String::length)).
                forEach(Lambda01::print);
       }

    // Task-4 : List elmanlarinin hepsinin karakter sayisinin 7 ve 7 'den az olma durumunu kontrol ediniz.

        public static void karakterSayıı7Ve7DenAzOlmaDurumu(List<String> ikram){

            System.out.println(ikram.
                    stream().
                    allMatch(t -> t.length() <= 7));//false

            System.out.println(ikram.
                    stream().
                    allMatch(t -> t.length() <= 7) ? "7 karakterden az" : "7 karakterden fazla ");
        }

          // Task-5 : List elelmanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.

        public static void wIleBaslama(List<String> ikram){

            System.out.println(ikram.
                    stream().
                    noneMatch(t -> t.startsWith("w")));
                //ternary ile cozumu: noneMatch(t -> t.startsWith("w")) ? "w ile baslayan yemek yoktur":"w ile baslayan yemek var";
        }

    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.

    public static void xIleBiten(List<String> ikram){
        System.out.println(ikram.
                stream().
               // anyMatch(t -> t.endsWith("x")) ? "x ile bitiyor." : "x ile bitmiyor");
               anyMatch(t -> t.endsWith("x")));
    }

    // Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.

    public static void karakterSayısıEnBuyukEleman(List<String> ikram){
       Stream<String >sonIısm=ikram.
                stream().
                sorted(Comparator.comparing(t -> t.toString().length()).reversed()).
                limit(1);//limit methodu stream dondurdugu için sout calısmaz. o yuzen konteynıra koyduk.

        System.out.println(Arrays.toString(sonIısm.toArray()));//burada once stream olan akısı stringe cevirdik, sonra da arraye cevirdik.
    }

    // Task-8 : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.

    public static void ilkElamanHaric(List<String> ikram){

        ikram.
                stream()
                .sorted(Comparator.comparing(t-> t.charAt(t.length()-1))).
                skip(2).
                forEach(Lambda01::print);
    }





}
