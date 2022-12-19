package ifstatement00;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        /*
        1) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
        Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"
         */
       String password="1a 23cc";
       String sifre= password.replaceAll("\\s","").length()>7 ? "Gecerli Parola":"Gecersiz Parola";
       System.out.println(sifre);

       /*
       2) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
         a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
         b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
         c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "
        */
       int a=5,b=4,c=3;
      String result= a==b&&b==c ?"Eskenar Ucgen":(a==b&&b!=c || a==c&&b!=c ||b==c&&a!=c)?"Ikızkenar Ucgen":"Cesitkenar Ucgen";
      System.out.println(result);

      /*
      3) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
      a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa
      yuvarla”
       b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
       */
        Scanner input=new Scanner(System.in);
//        System.out.println("Lutfen 3 basamklı bir sayı giriniz.");
//       int sayı= input.nextInt();
//     String rst=(sayı%10>=5) ?"Son basamağı bir üst ondalığa yuvarla="+(sayı/10+1)*10:"Son basamağı bir alt ondalığa yuvarla="+(sayı/10)*10;
//     System.out.println(rst);

/*
4) Nested Ternary kullanarak Apex kodunu yazınız.
Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir
 */
        LocalDate date= LocalDate.of(1996,12,3);
        System.out.println("Artık yıl  = " + date.isLeapYear());

        int year=1996;
       String leap=year%100==0 ? ((year%400==0)? "artık yıl":"artık yıl degil"):((year%4==0)?"artık yıl":"artık yıl degil");
     /*
     5) Nested Ternary kullanarak;
     Şifreyi kontrol etmek için kodu yazınız.
     8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
     8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır.
     */

        String pswrd="Kxxxxxxxx";
        String sonuc=pswrd.length()>8 ? (pswrd.startsWith("i")?"gecerli":"gecersiz "):(pswrd.startsWith("K")? "gecerli":"gecersiz " );
        System.out.println(sonuc);

/*
      6) Bir sayının mutlak değerini hesaplamak için kodu yazınız.
      Pozitif sayılar ve sıfır mutlak değer için sayı ile aynıdır.
      Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarpınız.
 */
     int d=-5;
     int abs=d<0 ? -1*d: d;
     System.out.println(abs);
//7) Ternary kullanarak; 2 tamsayıdan küçük olanı konsola yazdıran bir program yazınız.

        int x=7;
        int y=32;
        int sayı1=x<y ? x:y;
        System.out.println("Kucuk olan sayı = " + sayı1);
//8) Sayı 3 basamaklı ise konsolda kodunuz "Bu sayı 3 basamaklıdır" olacaktır. Aksi takdirde,
//kodunuz " Bu sayı 3 basamaklı değildir" olacaktır.
        int i=-650;
        i=Math.abs(i);
        String basamak=(i>99&&i<1000) ? "Bu sayı 3 basamaklıdır":" Bu sayı 3 basamaklı değildir";
        System.out.println(basamak);

//9) Ternary kullanarak; konsolda tek sayılar için “Tek” , çift sayılar için “Çift” yazdırınız.

     int n=66;
     String n1=n%2==0 ? "CİFT":"TEK";
     System.out.println(n1);

//10) Ternary kullanarak; konsolda sayı pozitif ise “Pozitif” , negatif ise “Pozitif Değil” yazdırınız.
   System.out.println("Bir sayı giriniz.");
    int p=input.nextInt();
    String p1=p>0 ? "pozitif":"pozitif degil";
        System.out.println(p1);


    }


}
