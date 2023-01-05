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


        int k = 120;
        while (k > 10) {
            if (k % 4 == 0 && k % 6 == 0) {
                System.out.println(k + " ");
            }
            k--;
        }


        // 2) Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        String str = "accessories";   //Örneğin; accessories ´ ces

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                System.out.print(ch + " ");
            }
        }
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            String st = str.substring(i, i + 1);
            if (str.indexOf(st) != str.lastIndexOf(st)) {
                if (!s.contains(st)) {
                    s = s + st;
                }
            }
        }

        System.out.println(s);
        //3) Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        //aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.
        String polindrom = "anna";
        String p = "";
        for (int i = polindrom.length() - 1; i > -1; i--) {
            String pl = polindrom.substring(i, i + 1);
            p = p + pl;
        }
        if (p.equals(polindrom)) {
            System.out.println("polindromdur.");
        } else System.out.println("polindrom degildir.");

        //while
        String g = "";
        int i = polindrom.length() - 1;
        while (i > -1) {
            String c = polindrom.substring(i, i + 1);
            g = g + c;
            i--;
        }
        // 4) Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        Integer num = 22384878;
        String distinct = String.valueOf(num);
        String x = "";
        for (int j = 0; j < distinct.length(); j++) {
            String v = distinct.substring(j, j + 1);
            if (distinct.indexOf(v) == distinct.lastIndexOf(v)) {
                x = x + v;
            }
        }
        System.out.println(x);

     /*
     5) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
          A A A A A
          A A A A A
          A A A A A
      */
        int rows = 6;
        int column = 9;
        for (int j = 1; j <= rows; j++) {
            String w = "--";
            for (int l = 1; l <= column; l++) {
                w = w + "A";
            }
            System.out.println(w);
        }

    }

    public static void yirmidortIleBolunenSayılar(int a, int b) {
        IntStream.rangeClosed(a, b).sorted().filter(t -> t % 4 == 0).filter(t -> t % 6 == 0).forEach(Lambda01::print);
    }

    public static void tekrarsızSayılar(int a) {
        IntStream.range(a, 1).distinct().forEach(Lambda01::print);
    }

}





