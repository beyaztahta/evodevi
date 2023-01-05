package looppsss;

public class Loopp_02 {
    public static void main(String[] args) {
        /*
        6) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
A
A A
A A A
A A A A
         */
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            String s = "";
            for (int j = 1; j <= i; j++) {
                s = s + "A";
            }
            System.out.println(s + " ");
        }
        //7) Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
        //3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
        int num = 5;
        for (int i = 1; i < 11; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }
        //8) 20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
        //bırakarak yazdırmak için gereken kodu yazınız.

        for (int i = 20; i > 2; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //9) String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        String s = "Ali Can?";
        s = s.replaceAll("[^a-z]", "");
        String t = "";
        for (Integer i = 0; i < s.length(); i++) {
            String r = s.substring(i, i + 1);
            t = t + r + '*';
        }
        System.out.println(t);
//10) Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
//işaretiyle yazdırmak için gereken kodu yazınız.
//Örneğin; 75.4238 ´ *4*2*3*8
        double sayı = 75.4238;
        String str1 = String.valueOf(sayı);
        System.out.println(str1);
        int idx=str1.indexOf(".");
        String ondalık=str1.substring(idx+1);
        String r="";
        for (int i = 0; i < ondalık.length(); i++) {
            String k=ondalık.substring(i,i+1);
            r=r + "*"+k ;
        }
        System.out.println(r);

        //while:
        double sayı1=102.654;
        String s1=String.valueOf(sayı1);
        int noktaVeOncesi=s1.indexOf(".");
        String decimal=s1.substring(noktaVeOncesi+1);

        String w="";
        int i = 0;
        while (i <decimal.length()) {
            String a=decimal.substring(i,i+1);
            w= w + "*" +a;
            i++;
        }
        System.out.println(w);

    }
}
