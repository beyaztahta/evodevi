package datacastingodevi;

import java.util.Scanner;

public class TypeCasting01 {
    public static void main(String[] args) {
        //soru 1: Kullanıcıdan ilk ve soy ismini alınız,ilk ve soy ismin ilk harflerini yazdırınız.
        Scanner input=new Scanner(System.in);
        System.out.println("ilk adınızı giriniz.");
        char isim=input.next().charAt(0);
        System.out.println("soyadınızı giriniz.");
        char soyAd=input.next().charAt(0);
        System.out.println(" " +isim+soyAd);

        /*soru 2: byte veri tipinde bir degisken olusturun;short,int,float ve double data tiplerinde birer
        degisken olusturup adım adım widening yaptırıp yazdırın.
       */
        byte age= 12;
        short a= age;
        System.out.println(a);

        int b= age;
        System.out.println(b);

        float c= age;
        System.out.println(c);

        double d=age;
        System.out.println(d);

        //soru 3: int veri tipinde bir degisken olusturun ve adım adım narrowing yapıp yazdırın
       int bolum=1584;
       short newBolum=(short)bolum;
        System.out.println("newBolum:"+newBolum);
       
        //soru 4:float veri tipinde bir degisken olusturun ve adım adım narrowing yapıp yazdırın
        float ondalık=1.2f;
        byte n =(byte)ondalık;
        System.out.println("newOndalık:"+n);
        
        //soru 5:double 255.36 sayısını int e ve sonrada olusturdugunuz int sayısını  byte cevirip yazdırın.
        double number=255.36;
        int newNumber=(int)number;
        System.out.println("newNumber = " + newNumber);
        byte newN1=(byte)newNumber;
        System.out.println("newN1:"+newN1);





    }
}
