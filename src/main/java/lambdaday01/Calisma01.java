package lambdaday01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Calisma01 {
         /*
              1) "LambdaPractice" olarak adlandırılan bir paket oluşturun
              2) "P01" olarak adlandırılan bir sınıf oluşturun
              3) 5 String elemanı olan bir String listesi oluşturun.
              4) 3 tanesi "A" harfi ile başlayacak
              5) Elemanlar "A" harfi ile başlıyorsa ve elemanların uzunluğu
              5'ten küçükse, bunları konsoldaki bir listede büyük harflerle yazdırın.
          */
         public static void main(String[] args) {

             List<String > liste=new ArrayList<>(Arrays.asList("ayva","armut","ananas","cennet hurması","elma"));
             uzunlukSıralama(liste);

         }
         public static void uzunlukSıralama(List<String > liste){
             liste.
                     stream().
                     filter(t-> t.toLowerCase().startsWith("a")).
                     filter(t-> t.length()<5).
                     forEach(t-> System.out.println(t.toUpperCase()+ " "));

         }
}
