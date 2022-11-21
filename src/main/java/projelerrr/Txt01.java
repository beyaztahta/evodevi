package projelerrr;

import java.util.HashSet;

public class Txt01 {

    /*
        Main method altinda bir double hashSet olusturunuz.
        ve bu seti, adi setOlustur ve return tipi hashSet double olan
        ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.
        Adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul edecek ayri bir method olusturarak
        hashSetin degerlerinin toplamini alacaksiniz.
        Çıktı--> sonuc = 44.69
         */


    public static void main(String[] args) {

        HashSet<Double> nums = new HashSet<>();
        setOlustur(nums);
        toplamınıAl(nums);
    }

     static void toplamınıAl(HashSet<Double> nums) {
         Double toplam=0.0;
        for (Double w:nums) {
            toplam+=w;
        }
        System.out.println(toplam);
    }

   static HashSet<Double> setOlustur(HashSet<Double> nums) {
        double a = 3.23;
        double b = 3.10;
        double c = 5.12;
        double d = 10.12;
        double e = 23.12;

        nums.add(a);
        nums.add(b);
        nums.add(c);
        nums.add(d);
        nums.add(e);

      return nums;
    }


}
