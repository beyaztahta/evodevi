package collectiıns;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkList0001 {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        ListIterator itr = liste.listIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

        while (itr.hasPrevious()) {
            System.out.println(itr.previous() + " ");
        }



        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]  bu listi
        //       [1, 3, 5, 6, 7] bu hale donusturun

        List<Integer> sayilar = new LinkedList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        System.out.println(tekrarsizListeOlustur(sayilar));

    }

    public static List<Integer> tekrarsizListeOlustur (List < Integer > sayiLer) {

        List<Integer> tekrarsizList = new LinkedList<>();
        for (int i = 0; i < sayiLer.size(); i++) {
            if (!tekrarsizList.contains(sayiLer.get(i))) {
                tekrarsizList.add(sayiLer.get(i));
            }

        }
        return tekrarsizList;
    }

}

