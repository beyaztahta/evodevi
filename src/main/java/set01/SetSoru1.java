package set01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetSoru1 {
    public static void main(String[] args) {
        //1) Bir listede kaç farklı öğe olduğunu gösteren kodu yazınız.Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4
        List<Integer> myList=new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(7);
        myList.add(15);
        myList.add(7);
        System.out.println(myList);

        Set<Integer>mySet=new HashSet<>(myList);//tekrarsız kac eleman oldugunu soruyor.
        System.out.println("Tekrarsız eleman sayısı=  "+mySet.size());

      //2) Set ve Liste arasındaki ortak öğeleri yazdırmak için kod yazınız.
        List<Integer>sayı=new ArrayList<>();
        sayı.add(10);
        sayı.add(31);
        sayı.add(15);
        sayı.add(7);
        sayı.add(15);

        Set<Integer>sayı2=new HashSet<>();
        sayı2.add(15);
        sayı2.add(31);
        sayı2.add(2);
        sayı2.add(7);

        sayı2.retainAll(sayı);//retainAll methodu ortak olan ogeleri yazdırır.
        System.out.println(sayı2);

















    }
}
