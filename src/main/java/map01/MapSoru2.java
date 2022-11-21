package map01;

import java.util.*;

public class MapSoru2 {
    public static void main(String[] args) {
        /*
        Q1: Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır. Ürün sayılarını artan sırada yazdırınız.
         */
        Map<String,Integer>product=new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);
        System.out.println(product);//{Laptop=82, TV=53, Refrigerator=12, Music System=87, Mobile Phone=53}

        Object[] value=product.values().toArray();
        Arrays.sort(value);
        System.out.println(Arrays.toString(value));


      //   Q2:Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır. Ürün adlarını alfabetik sırayla yazdırınız.

        Map<String, Integer> product1 = new HashMap<>();
        product1.put("Laptop", 82);
        product1.put("TV", 53);
        product1.put("Refrigerator", 12);
        product1.put("Music System", 87);
        product1.put("Mobile Phone", 53);

        Set<String>keys=product1.keySet();
        List<String>key=new ArrayList<>(keys);
        Collections.sort(key);//listlerde alfabetik sıraya koymak için kullanıyoruz.
        System.out.println(key);

      //Q3:Bir String’ deki kelimelerin kaç defa tekrarlandığını ifade eden kod yazınız.(Büyük/küçük harfe duyarlı değil)

        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";
               s=s.replaceAll("\\p{Punct}","").toLowerCase();

            Map<String,Integer>words=new HashMap<>();//bir kelime kac kez tekrarlanmıs yanı apex=2 gibi olacagı ıcın map yazdık
            String[] arr=s.split(" ");
            for(String w:arr){
                Integer word=words.get(w);
                if(word==null){
                    words.put(w,1);
                }else{
                    words.put(w,word+1);
                }
            }
        System.out.println(words);

     //Q4:Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?

        List<Integer>myList=new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);

        Map<Integer,Integer>myMap=new HashMap<>();

        for(Integer w:myList){
            Integer sayı=myMap.get(w);
            if(sayı==null){
                myMap.put(w,1);
            }else{
                myMap.put(w,sayı+1);
            }
        }
        System.out.println(myMap);

        Collection<Integer>myValues=myMap.values();
        int sayac=0;
        for(Integer w:myValues){
            if(w>1){
                sayac++;
            }
        }
        System.out.println("Tekrarlanan sayı "+sayac+" adettir.");


    }
}
