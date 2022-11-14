package stringmanipulations;

import java.util.Scanner;

public class StringManipulation4 {
    public static void main(String[] args) {

     //11) Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod yazınız.

        String s = " Tom ";
        String trim=s.trim();//"Tom"
        boolean a =s.equals(trim);
        System.out.println(a);

    // 12) Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod yazınız.

        String str = "Tom Hanks.";
        char ilk=str.charAt(0);
        char son=str.charAt(str.length()-1);
        boolean ilkHarf=ilk>='A' && ilk<='Z';
        boolean sonkrktr= son=='.';
        boolean ilkVeSon=ilkHarf && sonkrktr;
        System.out.println(ilkVeSon);

    //13) Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
        //Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
        //sembol olmalıdır.

        String sifre = "!1a23b4?es";
        boolean uzunluk=sifre.replaceAll("\\s","").length()>=8;
        boolean krakter=sifre.replaceAll("\\s","").replaceAll("[A-Za-z0-9]","").length()>0;
        boolean result= krakter && uzunluk;
        System.out.println(result);

    //14) Bir String’ in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek için kod yazınız.

        String str1="Java";
        boolean v=str1.contains("v");
        System.out.println(v);

        boolean v1=str1.replaceAll("[^v]","").length()>0;
        System.out.println(v1);

        boolean v2=str1.indexOf("v")!=-1;
        System.out.println(v2);

    // 15)Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.

           String gomlekFiyat = "$12.99";
           String kitapFiyat = "$35.99";
           String gf=gomlekFiyat.substring(1,6);   //gomlekFiyat.replaceAll("$","");
           String kf=kitapFiyat.substring(1,6);   //gomlekFiyat.replaceAll("$","");
          double x=Double.valueOf(gf);
          double y=Double.valueOf(kf);
          double toplam=x+y;
        System.out.println(toplam);

       // 16) Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.

//        Scanner scan =new Scanner(System.in);
//        System.out.println("lütfen adınızı  giriniz.");
//        String ad=scan.nextLine().toUpperCase();
//        System.out.println("lütfen soyadınızı giriniz.");
//        String soyad=scan.nextLine().toUpperCase();
//        char ilkad=ad.charAt(0);
//        char syd=soyad.charAt(0);
//
//        System.out.println(ilkad+""+syd);

        String isim="Tom Hanks";
        String first=isim.substring(0,1);
        String second=isim.split(" ")[1].substring(0,1);
        System.out.println(first+""+second);

        //17) Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.

        String cumle = "Vay be! Ali 13 yaşında ama üniversite öğrencisi.";
        int ch=cumle.length();
        int ch1=cumle.replaceAll("\\p{Punct}","").length();
        int fark=ch-ch1;
        System.out.println(fark);



    }
}
