package map01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSoru1 {
    public static void main(String[] args) {
        // Q1:Tum integer yasların ortalamasını bulan kodu yazınız.
        Map<String,Integer>studentAges =new HashMap<>();
        studentAges.put("Ali",13);
        studentAges.put("Tom",21);
        studentAges.put("Brad",12);
        studentAges.put("Ajda",76);
        studentAges.put("Cuneyt",75);
        studentAges.put(null,55);
        studentAges.put(null,66);
        studentAges.put("Ayhan Isık",null);
        studentAges.put("Sadri Alısık",null);

        Collection<Integer>value=studentAges.values();
        double sum=0;
        int counter=0;
        for(Integer w:value){
            if(w!=null){
                sum+=w;
                counter++;
            }
        }
        System.out.println("Ortalama yas =" + sum/counter);

    //Q2:A ile baslamayan isimlerin içerdigi toplam karakter sayısını bulan kodu yazınız.

        Set<String>keys=studentAges.keySet();
        int s=0;
        for (String w:keys) {
            if(w!=null && !w.startsWith("A")){
               s+=w.length();
            }
        }
        System.out.println("A" + "ile baslamayan ve null içermeyen karakterlerin sayısı: "+ s);

     //Q3:Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır. Toplam ürün sayısını bulmak için kodu yazınız.
       Map<String,Integer>product=new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);

        Collection<Integer>urunSayısı=product.values();
        int toplam=0;
        for (Integer w:urunSayısı) {
            toplam+=w;
        }
        System.out.println("Toplam urun sayısı=" + toplam);

     //Q4:Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır. Ürünler arasında " Laptop " olup olmadığını
        // kontrol etmek için kodu yazınız.
        Map<String,Integer>product1=new HashMap<>();
        product1.put("Laptop", 12);
        product1.put("TV", 53);
        product1.put("Refrigerator", 12);
        product1.put("Music System", 87);
       //1.yol
        boolean laptopVarMI=product1.containsKey("Laptop");
        System.out.println("Aradıgınız listede laptop varsa true yoksa false alacaksınız : "+ laptopVarMI);
       //2.yol
        String bilgisayar="Laptop";
        if(product1.containsKey(bilgisayar)){
            System.out.println("Listede vardır.");
        }else {
            System.out.println("Listede yoktur.");
        }



    }
}
