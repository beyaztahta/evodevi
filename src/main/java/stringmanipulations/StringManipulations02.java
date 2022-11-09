package stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
        //SORU 1:"Java ogrenmek123 cok kolay @"cumlesini "Java ogrenmek cok guzel". seklinde yazdırran kodu yazınız.
        String str="Java ogrenmek123 cok kolay @";
        System.out.println(str.substring(0,13)+" "+"cok guzel");

        //SORU 2:String seklinde verilen asagıdaki fiyatların toplamını bulunuz..
        String str1="$13.99";
        String str2="$10.55";
     //IPUCU:Double.parseDouble
        str1=str1.substring(1,6);
        str2=str2.substring(1,6);
        double sayı1=Double.valueOf(str1);
        double sayı2=Double.valueOf(str2);
        System.out.println(sayı1+sayı2);

        /*SORU 3:Kullanıcıdan isim isteyin.
        "isim" a harfi iceriyorsa "Girdiginiz isim a harfi iceriyor"
         "isim" Z harfi iceriyorsa "Girdiginiz isim Z harfi iceriyor"
         İkisi de yoksa"Girdiginiz isim a ve Z harfi icermiyor"
         */
        Scanner input=new Scanner(System.in);
//        System.out.println("Lutfen isminizi giriniz.");
//        String isim=input.nextLine();
//        if(isim.contains("a")){
//            System.out.println("Girdiginiz isim a harfi iceriyor");
//        }else if(isim.contains("Z")){
//            System.out.println("Girdiginiz isim Z harfi iceriyor");
//        }else{
//            System.out.println("Girdiginiz isim a ve Z harfi icermiyor");
//        }
     //SORU 4: Kullanıcıdan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdırın.
//        System.out.println("Lutfen isminizi giriniz");
//        String ad=input.next().toUpperCase();
//        System.out.println("Lutfen soyadınızı giriniz");
//        String soyAd=input.next().toUpperCase();
//        if(ad.length()>soyAd.length()){
//            System.out.println("adınız soyadınızdan daha uzundur.");
//        }else {
//            System.out.println("soyadınız adınızdan daha uzundur.");
//        }
     //SORU 5:Kullanıcıdan 4 harfden olusan bir kelime isteyin ve kelimeyi tersten yazdırın.
//        System.out.println("Lutfen 4 harften olusan bir kelime giriniz.");
//        String s=input.next().toLowerCase();
//        String ters="";
//        for(int i=s.length()-1; i>=0 ;i--){
//            char ch=s.charAt(i);
//            ters=ters+ch;
//        }
//        System.out.println(ters);
     //SORU 6:
//        System.out.println("Lutfen 6 harften olusan bir kelime giriniz.");
//        String d=input.next().toUpperCase();
//        String trs="";
//
//        for(int k=d.length()-1; k>=0 ; k--){
//            char c=d.charAt(k);
//            trs=trs+c;
//        }
//        System.out.println(trs);
    /*SORU 7:Kullanıcıdan bir sifre girmesini isteyin.Asagıdaki sartları saglıyorsa "Sifre basarılı ile tamamlandı";
    sartlari saglamazsa "Islem basarısız,lutfen yeni bir sifre giriniz"
        -Ilk harf buyuk olmalı
        -Son harf kucuk olmalı
        -Sifre bosluk icermemeli
        -Sifre uzunlugu en az 8 karakter icermeli
     */
        System.out.println("Lutfen bir sifre giriniz.");
        String pwd=input.next();

        boolean ilk=pwd.charAt(0)>='A'&& pwd.charAt(0)<='Z';
        boolean son=pwd.charAt(pwd.length()-1)>='a' && pwd.charAt(pwd.length()-1)<='z';
        boolean space=!pwd.contains(" ");
        boolean uzunluk=pwd.length()>7;
        boolean gecerli=ilk && son && space && uzunluk;
       if(gecerli){
           System.out.println("Sifre basarılı ile tamamlandı");
       }else{
           System.out.println( "Islem basarısız,lutfen yeni bir sifre giriniz");
       }


    }

}

