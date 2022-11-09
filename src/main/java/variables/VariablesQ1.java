package variables;

import java.util.Scanner;

public class VariablesQ1 {
    public static void main(String[] args) {
        //1)Herhangi bir 3 öğenin fiyatları için double data tipinde değişkenler oluşturunuz. Fiyatların
       // toplamını konsola yazdırınız.

       double sapka=13.66;
       double gomlek=11.90;
       double etek=12.55;
        System.out.println((sapka + gomlek + etek));


        // 2) Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu
       // değişkenlerin değerlerinin çarpımını konsolda yazdırınız.

       float t=11.35f;
       Long x=15L;
       int y=2;
        System.out.println((t * y * x));


        //3) Basit faizi bulmak için bir kod yazınız.
        //Not: Basit faiz formülü = anapara * oran * yılDegeri /100

       int anaPara=654, yıl=3 , oran= 2;
       int basitFaizFormulu=anaPara * oran * yıl /100;
        System.out.println(basitFaizFormulu);


       // 4) Bir String ve iki long data tipinde değişken oluşturunuz. Konsolda bu long değişkenlerin
      //  toplamını ve çarpımını String ile yazdırınız.
         String str="ali";
         Long a=15L, b=20L;
        System.out.println(str+(a+b));
        System.out.println(str+(a*b));

        //5) Değerleri farklı olan iki boolean data tipinde değişken oluşturunuz ve bu değerleri iki
        //ardışık değer arasında boşluk bırakacak şekilde aynı satırda yazdırınız.

        boolean yas=true;
        boolean emekliMi=false;
        System.out.println(yas +" "+ emekliMi);

      //6) 3 öğe (kitap, defter ve laptop) fiyatı için long data tipinde değişkenler oluşturunuz.
        //Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız.

        Long kitap=15L,defter=16L, laptop=45L;
        Long toplamFiyat=(2*kitap)+(4*defter)+(3*laptop);
        System.out.println("Toplam fiyat= " + toplamFiyat+"TL");


        //  7)Kullanıcan iki tam sayı istayin. İki tamsayıyı yerlerini değiştirmek için bir kod yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("iki tam sayı giriniz.");
        double sayı1=scan.nextDouble();
        double sayı2=scan.nextDouble();
        System.out.println("Sayılar degistirilmeden once : "+ sayı1+"-" + sayı2);
//        sayı1=sayı2+sayı1;
//        sayı2=sayı1-sayı2;
//        sayı1=sayı1-sayı2;

        double temp=sayı1;
        sayı1=sayı2;
        sayı2=temp;

        System.out.println("Sayılar degistikten sonra : "+ sayı1 + "-"+ sayı2);


    }
}
