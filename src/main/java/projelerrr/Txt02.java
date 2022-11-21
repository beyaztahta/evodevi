package projelerrr;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Txt02 {

    /*Asagida verilen map'de yazilim dili java olan kisi isimlerini bir liste olarak donduren
     bir method yaziniz
    Map<Integer,String> map1 = new HashMap<>();
        map1.put(101, "Ali, Can, java");
        map1.put(102, "Veli, Yan, java");
        map1.put(103, "Ali, Yan, C#");
        map1.put(1905, "Can, Birtane, Java");

     */
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(101, "Ali, Can, java");
        map1.put(102, "Veli, Yan, java");
        map1.put(103, "Ali, Yan, C#");
        map1.put(1905, "Can, Birtane, Java");

        Set<Map.Entry<Integer,String>>liste=map1.entrySet();

        for(Map.Entry<Integer,String> w:liste){
            System.out.println(w);
        }







    }
}
