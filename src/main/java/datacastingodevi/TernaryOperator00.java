package datacastingodevi;

import java.util.Scanner;

public class TernaryOperator00 {
    public static void main(String[] args) {
        //Example 1:Kullanıcıdan iki sayı alın ve buyuk olmayan sayıyı yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz.");
        int sayı=scan.nextInt();
        System.out.println("ikinci sayıyı giriniz.");
        int sayı1=scan.nextInt();
        int sonuc= sayı>sayı1 ? sayı1 : sayı ;
        System.out.println(sonuc);

      //Example 2:Kullanıcıdan bir tam sayı alın ve sayının tek veya cift oldugunu yazdırın.
        System.out.println("Lutfen bir tam sayı giriniz");
        int a=scan.nextInt();
        String sonc=a%2==0 ? "CİFT":"TEK";
        System.out.println(sonc);

      //Example 3:Kullanıcıdan bir sayı alın ve sayının mutlak degerıni yazdırın.
        System.out.println("bir sayı giriniz.");
        int b=scan.nextInt();
        int mutlak=b<0 ? b*(-1) : b;
        System.out.println(mutlak);//negatif sayıların mutlak degeri -1 ile carpımıdır.

      //Example 4:Kullanıcıdan bir sayı alın.Sayı pozitif ise"SAYI POZITIF"degilse sayının karesini yazdırın.
        System.out.println("lutfen bir tam sayı giriniz");
        int x=scan.nextInt();
        Object result= x>0 ? "SAYI POZİTİF":x*x;
        System.out.println(result);

        /*Example 5:Kullanıcıdan bir tam sayı alın.Sayı 10 dan kucukse"Rakam",100 den kucukse"İki basamaklı sayı"
     degilse "Uc basamaklı ve daha buyuk sayı" yazdırın.
         */
        System.out.println("Tam sayı giriniz..");
        int t=scan.nextInt();
        String sonuc1= t<10 ?(t<100 ?"Rakam":"İki basamaklı sayı"):(t>=100 ?"Uc basamaklı ve daha buyuk sayı":"İki basmaklı sayı");
        System.out.println(sonuc1);

        /*Example 6:Kullanıcıdan bir harf isteyin.Kucuk harf ise consolda "kucuk harf",degilse "buyuk harf"yoksa"girdiginiz karakter
        harf degil"yazdırın.
         */

        System.out.println("Lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);
        boolean harfMi = (harf>='a' && harf<='z') || (harf>='A' && harf<='Z');
        boolean kucukHarfMi =  harf>='a' && harf<='z';

        String son = harfMi ? (kucukHarfMi ? "Girdiginiz karakter bir kucuk harftir" : "Girdiginiz karakter bir buyuk harftir")
                : ("Girdiğiniz karakter bir harf degildir");

        System.out.println(sonuc);
       /*Example 7:Kullanıcıdan bır dıkdorgenin uzun ve kısa kenar uzunlugunu isteyin.Verilen degerlere gore kare olup
       olmadıgını yazdırın
        */
        System.out.println("dikdotgenin uzun kenarını giriniz");
        int uzun=scan.nextInt();
        System.out.println("dıkdortgenın kısa kenarını gırınız");
        int kısa=scan.nextInt();
        String sekil=uzun==kısa ? "karedir":"dıkdortgendir";
        System.out.println(sekil);

        /*Example 8:Kullanıcıdan bir sayı alın,sayı 3 basamaklı ise sayı"uc basamaklı sayı",yoksa "uc basamaklı sayı degil"
        yazdırın
         */
        System.out.println("bir sayı giriniz");
        int s=scan.nextInt();
        String basamak= 99<s && 999>=s ? "uc bsamaklı sayı" :"uc basamaklı sayı degil";
        System.out.println(basamak);

    }
}
