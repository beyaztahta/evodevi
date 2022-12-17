package ifstatement00;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
       /*
        4) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.

        a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa
        yuvarla”
        b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla"

        */
        int number=126;
        if(number%10>=5){
            System.out.println("Son basamagı bir ust ondalıga yuvarla"+" "+(number/10+1)*10);
        }else{
            System.out.println("Son basamagı bir alt ondalıga yuvarla"+" "+(number/10)*10);
        }

   /*
   5) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"
    */
     int a=5;
     int b=8;
     int c=5;
     if(a==b || b==c){
         System.out.println("Eskenar Ucgen");
     }else if((a==b && b!=c)||(a==c && b!=c)||(b==c && a!=c)){
         System.out.println("Ikizkenar Ucgen");
     }else System.out.println("Cesitkener Ucgen");

/*
6) Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz
"16 km" yazmalıdır (sayı dinamik olacak)
b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
kodunuz "2" yazmalıdır (sayı dinamik olacak)
c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak

 mil*1.60934
 saniye/60/60
 fahrenayt -32)*5/9
 */
       double mil=10;
       double fahrenayt=83;
       double saniye=7200;


        String operator="fahreanytdan santigrata";
        if(operator.equals("milden km ye")){
            System.out.println(mil*1.60934);
        }else if(operator.equals("fahreanytdan santigrata")){
            System.out.println((fahrenayt-32)*5/9);
        }else if(operator.equals("saniyeden saate")){
            System.out.println( saniye/60/60);
        }

/*
7) Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.
b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.
d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi"
yazmalıdır.
e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad"
yazmalıdır.
Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda
görünmelidir. Örneğin; "ali3" için kodunuz "Baş harflerinde hata", "Ad veya soyadı eksik" ve
"Geçersiz Ad"
 */
    String tamIsim="Mehmet emin?";
    String ilkHarf=tamIsim.substring(0,1);
    String ikinciHarf=tamIsim.split("")[1].substring(0,1);
    int bosluk=tamIsim.trim().indexOf(" ");
    boolean ilkHarfBuyukMu=ilkHarf.charAt(0)>='A'&& ilkHarf.charAt(0)<='Z';
    boolean soyadınIlkHarfBuyukMu=ikinciHarf.charAt(0)>='A'&& ikinciHarf.charAt(0)<='Z';

   if(bosluk==-1){
       System.out.println("ad ve soyad eksik");
   }
   if(ilkHarfBuyukMu||soyadınIlkHarfBuyukMu){
       System.out.println("bas harflerinde hata");
   }
   if(tamIsim.equals(tamIsim.toUpperCase())){
       System.out.println("format hatası");
   }
   if(tamIsim.replaceAll("\\s","").length()==0) {
       System.out.println("isim girilmedi");
        }
   if(tamIsim.replaceAll("\\s","").replaceAll("[A-Za-z]","").length()>0){
            System.out.println("Gecersiz Isim");
        }

















    }
}
