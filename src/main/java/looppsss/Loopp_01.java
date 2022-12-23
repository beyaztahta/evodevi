package looppsss;

import lambdaday01.Lambda01;

import java.util.Comparator;
import java.util.stream.IntStream;

public class Loopp_01 {

    public static void main(String[] args) {
        //1) 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        //ardışık tam sayı arasında boşluk bırakarak yazınız.

        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
        yirmidortIleBolunenSayılar(11, 120);
        System.out.println();


        // 2) Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        String str = "accessories";   //Örneğin; accessories ´ ces

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                System.out.print(ch+" ");
            }
        }
        String s="";
        for (int i = 0; i < str.length(); i++) {
            String st=str.substring(i,i+1);
            if(str.indexOf(st) != str.lastIndexOf(st)){
                if(!s.contains(st)){
                    s=s+st;
                }
            }
        }

        System.out.println(s);




    }



    public static void yirmidortIleBolunenSayılar(int a, int b) {
        IntStream.rangeClosed(a, b).sorted().filter(t -> t % 4 == 0).filter(t -> t % 6 == 0).forEach(Lambda01::print);
    }


}





