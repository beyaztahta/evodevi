package stringmanipulations;

import java.util.Locale;

public class StringManipulation03 {
    public static void main(String[] args) {

        //1)Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        //ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        //yazdırınız.
        String sehir="hollanda";
        String str=sehir.substring(0,1).toUpperCase()+sehir.substring(1);
        System.out.println(str);

        //2) Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        //karakter sayısının toplamını yazdırınız.

        String str1="Goksel";
        String str2="Elif";
        String str3="Mehmet Emin";

      // int toplam=str1.length()+str2.length()+str3.replace(" ","").length();
        int toplam=str1.length()+str2.length()+str3.replaceAll("\\s","").length();
        System.out.println(toplam);

        //3) Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
        //konsolda yazdırınız.

          String a= "Miami 33018!!!" ;
         int b= a.replaceAll("\\s","").replaceAll("\\p{Punct}","").length();
        System.out.println("Toplam alfabetik ve sayısal karakter sayısı = "+ b);

        //4) Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
        //konsolda yazdırınız.

        String s= "1a3Bcf4!...";
        int sum =  s.replaceAll("[0-9]","").length();
        System.out.println(sum);

        //5) Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        //karakteri yazdırınız.

         String st = "Miami ";
         int ch=st.trim().length()-1;
         String sonKarakter=st.substring(ch,ch+1);
         System.out.println(sonKarakter);

         //6) Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
        //toplamını bulunuz.
        String ascıı="Miami";
        int ilk=ascıı.charAt(0);
        int son=ascıı.charAt(ascıı.length()-1);
        System.out.println(ilk+son);

        //7) Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda
        //yazdırınız.
        String word="tosbik";
        String sonuc= word.substring(1);

        System.out.println(sonuc);

        //8) Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
        //büyük harfle yazdırınız.

        String css="elmalı";
        int krktr=css.length()-1;
        String sss=css.substring(0,krktr).toUpperCase();
        System.out.println(sss);

        //9) Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm
        //karakterleri büyük harflerle yazdırınız.

        String kelime="elife";
        int snn=kelime.length()-1;
        String strr=kelime.substring(1,snn).toUpperCase();
        System.out.println(strr);

        //10) Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
        //olmadığını kontrol etmek için kod yazınız.

        String str5=" Tom Hanks ";
        String sil=str5.trim();
        String sil2=str5.replaceAll("\\s","");
        boolean ortadaBirBoslukVar=sil.length()-sil2.length()==1;// 1 bosluk varsa true vercek,yoksa false verecek
        System.out.println(ortadaBirBoslukVar);


    }
}
