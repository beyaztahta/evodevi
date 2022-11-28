package lambdaday01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda02 {
    public static void main(String[] args) {

        List<Integer> sayı = new ArrayList<>(Arrays.asList(4,2,6,11,-5,7,3,15));

        cıftKareBul(sayı);
        System.out.println("\n *******************");
        tekKupBul(sayı);
        System.out.println("\n *******************");
        ciftKareKok(sayı);
        System.out.println("\n *******************");
        maxDegeri(sayı);
        System.out.println("\n *******************");
        ciftKareMaxDegeri(sayı);
        System.out.println("\n *******************");
        toplam(sayı);
        System.out.println("\n *******************");
        carpım(sayı);
        System.out.println("\n *******************");
        enKucukEleman(sayı);
        System.out.println("\n *******************");
        enKucukEleman1(sayı);
        System.out.println("\n *******************");
        enKucukBestenBuyukSayı(sayı);
        System.out.println("\n *******************");
        cıftElemanKareBul(sayı);

    }
// Task-1 : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz
      public static void cıftKareBul(List<Integer>sayı){
        sayı.
                stream().
                filter(Lambda01::ciftBul).
                map(t-> t*t).
                forEach(Lambda01::print);

      }

    // Task-2 : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print ediniz

    public static void tekKupBul(List<Integer>sayı){
        sayı.
                stream().
                filter(t->t%2!=0).
                map(t-> (t*t*t)+1).
                forEach(Lambda01::print);
    }
    public static int kare(int a){

        return a*a;
    }
    public static int kup(int a){

        return a*a*a;
    }
    public static boolean tekMı(int a) {

        return a % 2 != 0;

    }
    public static int kucukOlanDegeriBul(int a,int b){
        return(a<b)? a:b;
    }

    // Task-3 : Functional Programming ile listin cift elemanlarinin karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void ciftKareKok(List<Integer>sayı){
        sayı.stream().filter(Lambda01::ciftBul).map(Math::sqrt).forEach(t-> System.out.print(t+" "));
     }

    // Task-4 : list'in en buyuk elemanini yazdiriniz
    public static void maxDegeri(List<Integer>sayı){
        Optional<Integer>maxSayı=sayı.
                stream().
                reduce(Math::max);
        System.out.println(maxSayı);
    }

    // Structured yapı ile çözelim:

    public static void structuredMAxElBul(List<Integer> sayı) {
        int maxValue= Integer.MIN_VALUE;
        for(int i=0; i<sayı.size(); i++){
            if(sayı.get(i)>maxValue)maxValue=sayı.get(i);
        }

        System.out.println("max sayı= "+ maxValue);

    }

    // Task-5 : List'in cift elemanlarin karelerinin en buyugunu print ediniz
    public static void ciftKareMaxDegeri(List<Integer>sayı) {

        System.out.println(sayı.
                stream().
                filter(Lambda01::ciftBul).
                map(a -> a * a).
                reduce(Integer::max));

    }

    // Task-6: List'teki tum elemanlarin toplamini yazdiriniz.Lambda Expression...
    public static void toplam(List<Integer>sayı){

        int toplam=sayı.
                stream().reduce(0,(a,b)->a+b);
        System.out.println(toplam);
    }

    // Task-7 : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void carpım(List<Integer>sayı){
        //Lambda expression:
        int carpım=sayı.
                stream().
                reduce(1,(a,b)->a*b);
        System.out.println(carpım);

        //Method referance:
        Optional<Integer> carp=sayı.
                stream().
                reduce(Math::multiplyExact);
        System.out.println(carp);
    }

    // Task-8 : List'teki elemanlardan en kucugunu  print ediniz.

    public static void enKucukEleman(List<Integer>sayı){
        System.out.println(sayı.
                stream().
                reduce(Integer::min));

    }
    public static void enKucukEleman1(List<Integer>sayı){
        System.out.println(sayı.
                stream().
                reduce(Lambda02::kucukOlanDegeriBul));

    }

        // Task-9 : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.

        public static void enKucukBestenBuyukSayı(List<Integer>sayı) {

            System.out.println(sayı.
                    stream().
                    filter(t -> (t % 2 != 0) && (t > 5)).
                    reduce(Lambda02::kucukOlanDegeriBul));
        }

    // Task-10 : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.

    public static void cıftElemanKareBul(List<Integer>sayı){
        sayı.
                stream().
                filter(Lambda01::ciftBul).
                map(a->a*a).sorted().
                forEach(Lambda01::print);
    }


}
