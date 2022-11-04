package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays03 {
    public static void main(String[] args) {
        //Soru1:[0,2,0,3,12,0] sıfırları en sona koyunuz.==>[2,3,12,0,0,0]
        int arr[]={0,2,0,3,12,0};
        int brr[]=new int[arr.length];
        int indeks=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                brr[indeks]=arr[i];
                indeks++;
            }
        }
        System.out.println(Arrays.toString(brr));
        //Soru2:[2,1,2,-3,2] gibi bir array de elemanın olup olmadıgını kontrol eden ve  kac kere tekrarlandıgını
        // gosteren kodu yazınız
//        int x[]={2,1,2,-3,2};
//        int eleman=2;
//        int counter=0;
//        for(int w:x) {
//            if (eleman == w) {
//                counter++;
//            }
//        }if(counter>0){
//                System.out.println(eleman+"array de "+ counter + "defa vardır..");
//            }else
//            {System.out.println(eleman +" arrayde yoktur.");}
        //Soru4:Size verilen bir cumledeki en uzun kelimeyı bulan kodu yazınız.
        //"Java kolaydır calısna,ne kolay ki calısmayana"

        String cumle="Java kolaydır calısana,ne kolay ki calısmayana...";
        cumle=cumle.replaceAll("\\p{Punct}","");
        System.out.println(cumle);

        String kelıme[]=cumle.split(" ");
        Arrays.sort(kelıme,Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(kelıme));
        System.out.println(kelıme[kelıme.length-1]);

       //Soru5: bir array olusturunuz ve elemanın olup olmadıgını ineksini soyleyerek bulunuz
        int nums[]={12,31,43,14};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int sayı=31;
       int idx= Arrays.binarySearch(nums,sayı);
        System.out.println(idx);
      //Soru6:Size verilen pozitif ve negatif sayılar iceren bir integer arraydeki "en buyuk negatif"ve "en kucuk pozitif"
        //elemanı bulunuz.
        int y[]={12,-2,6,-9,15};
        Arrays.sort(y);
        System.out.println(Arrays.toString(y));
        int buyuk=y[0];
        int kucuk=y[y.length-1];
        for(int w:y){
            if(w<0){
                buyuk=Math.max(buyuk,w);
            }if(w>0){
                kucuk=Math.min(kucuk,w);
            }
        }
        System.out.println(buyuk + "and" + kucuk);

     //Soru7:Bir stringdeki sesli harflerin sayısını bulan kodu yazınız.
        //a-e-o-ı-u-i/A-E-I-O-U
        String str="Java ogrenince para kazanmak kolay,ogrenmeyince ne kolay ki";
        str=str.toLowerCase();

        String harfler[]=str.split("");
        int counter=0;
        System.out.println(Arrays.toString(harfler));
        for(String w:harfler){
            switch(w){
                case "a":
                case "e":
                case "u":
                case "i":
                case "o":
                case "ı":
                    counter++;
            }
        }
        System.out.println(counter);











    }
}
