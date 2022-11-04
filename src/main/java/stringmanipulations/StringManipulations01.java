package stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

       //Example 1:kullanıcıdan bir cumle ve bir harf isteyin.cumlede var olup olmadıgını yazdırın.
        Scanner input=new Scanner(System.in);
//        System.out.println("Lutfen bir cumle yaziniz");
//        String cumle = input.nextLine().toLowerCase();
//        System.out.println("Simdi de bir harf giriniz");
//        String harf = input.next().toLowerCase(); // toLowerCase() kullanarak buyuk-kucuk harf ayrımını ortadan kaldırdım.
//
//
//       //If versiyonu
//        if(cumle.contains(harf)) {
//            System.out.println("cumle icinde bu harf vardır.");
//        } else {
//            System.out.println("cumle icinde bu harf yoktur.");
//        }
//
        //Example 2:Bir string deki bir characterin tekrarlı veya tekrarsızı olup olmadıgını gosteren kodu yazınız.
//
//        String str="Helloooo";
//        char c='h';
//        if(str.indexOf(c)==str.lastIndexOf(c)){
//            System.out.println("tekrarsız");
//        }else{
//            System.out.println("tekrarlı");
//        }

      /*Example 3=Kullanıcıdan bir cumle ve bir kelime isteyin.Kelimenin cumledeki kllanımına bakarak asgıdaki,
     3 cumleden uygun olanı yazdırın i)Girilen kelime cumlede kullanılmamıs.
                                     ii)Girilen kelime ecumlede 1 kere kullanılmıs.
                                   iii)girilen kelime cumlede birden fazla kullanılmıs.
       */
//        System.out.println("lütfen bir cumle yazınız.");
//        String s=input.nextLine().toLowerCase();
//        System.out.println("Lütfen bir kelime giriniz.");
//        String k=input.next();
//        boolean b=s.contains(k);
//        if(s.contains(k)){
//            System.out.println("Girilen kelime cumlede kullanılmıs");
//        }else {
//            System.out.println("Girilen kelime cumlede kullanılmamıs.");
//        }

     /*
     Example 4:kullanıcıdan qgmail adrsini girmesini isteyin.
     @ g mail.com içermiyorsa "Lütfen gmail adresini dogru giriniz."
     @ g mail.com ile bitiyorsa"Email adrsiniz kaydedildi."
     @ g mail.com ile bitmiyorsa "Lutfen yazımı kontrol edin."
      */
        String mail="abc@gmail.com";
        String str1="@gmail.com";
        if(!mail.contains(str1)){
            System.out.println("lutfen gmail adresi giriniz");
        }else if(mail.endsWith(str1)){
            System.out.println("Email adresiniz kaydedildi ");
        }else System.out.println("lutfen yazimı kontrol edin");



       /*
       Example 5: Kullanıcıdan bir cumle isteyin.
       Cumle de "buyuk"kelimesi içeriyorsa tum cumleyi buyuk harf
       Cumle de "kucuk"kelimesi içeriyorsa tum cumleyi kucuk harf
       İkisini de icermiyorsa"Cumle kucuk ya da buyuk" kelimesini icermiyor.
        */
        System.out.println("Lutfen'buyuk'ya da'kucuk'kelimesini iceren bir cumle yazınız.");
        String cumle=input.nextLine();
        String b="buyuk";
        String k="kucuk";
        if(cumle.contains(b)){
            System.out.println(cumle.toUpperCase());
        }else if(cumle.contains(k)){
            System.out.println(cumle.toLowerCase());
        }else{
            System.out.println("Cumle kucuk ya da buyuk kelimesini icermiyor.");
        }

    }
      }

