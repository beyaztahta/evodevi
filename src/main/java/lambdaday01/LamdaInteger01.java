package lambdaday01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaInteger01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

        for (Integer w : list) {
            System.out.print(w + " ");
        }
        System.out.println();
        hepsiniYazdır(list);
        System.out.println();
        negatifOlanıYazdır(list);
        System.out.println();
        ciftOlanıYazdır(list);
        System.out.println();
        System.out.println(kareleriListele(list));
    }

    // S1:listi aralarinda bosluk birakarak yazdiriniz //

    public static void hepsiniYazdır(List<Integer> liste) {
        liste.stream().forEach(Lambda01::print);
    }

    //S2: sadece negatif olanlari yazdir


    public static void negatifOlanıYazdır(List<Integer> liste) {
        liste.
                stream().
                filter(t -> t < 0).
                forEach(Lambda01::print);
        //pozitif olanlar icin:
        // filter(t->t>0).
    }

    public static void ciftOlanıYazdır(List<Integer> liste) {
        liste.
                stream().
                filter(t -> t % 2 == 0).
                forEach(Lambda01::print);
    }

    // S4: list in elemanlarin karelerinden yeni bir list olusturalim
    public static List<Integer> kareleriListele(List<Integer> liste) {
        return liste.
                stream().
                map(t -> t * t).
                collect(Collectors.toList());


    }



}
