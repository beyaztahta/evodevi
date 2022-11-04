package datacastingodevi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        /*Example 1:kullanıcıdan bir sifre yazmasını isteyin.Eger ilk harf buyuk harf ise 'A'olup olmadıgn kontrol edin.
        ilk harf'A'ise "gecerli şifre",degilse"gecersiz sifre"yazdırın.Eger ilk harf kucuk harf ise'z'olup olmadıgını
        kontrol edin.İlk harf 'z'ise "gecerli sifre",degilse"gecersiz sifre"yzdırın.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz.");
        String pwd=input.next();
        char ilkHarf=pwd.charAt(0);
        if(pwd.charAt(0)>='A'&& pwd.charAt(0)<='Z'){
        if(pwd.charAt(0)=='A'){
        System.out.println("Gecerli sifre");
        }else {
        System.out.println("Gecersiz sifre");
        }
          }else if(pwd.charAt(0)>='a'&& pwd.charAt(0)<='z'){
            if(pwd.charAt(0)=='z'){
                System.out.println("Gcerli sifre");
            }else {
                System.out.println("Gecersiz sifre");
            }
        }
    /*Example 2:Kullanıcıdan 4 basamaklı bir sayı isteyin.Girdigi bir sayı 5 e bolunuyorsa son rakamı kntrol edin.Son
    rakamı 0 ise "5 e bolunen cift sayı"yazdırın.Son rakamı 0 degilse "5 e bolunen tek sayı"yazdırın.Girdigi password
    5 bolunmuyorsa "Tekrar deneyin"yazdırın.
     */
        System.out.println("Lutfen 4 basamaklı bir sayı giriniz.");
        int s = input.nextInt();
        if (s % 5 == 0 && s % 2 == 0) {
            System.out.println("5 e bolunen cift sayı");
            }else if(s%5==0 && s%2!=0){
            System.out.println("5 e bolunen tek sayı");
           }else{
           System.out.println("Tekrar deneyin");
           }
       // 2.yol
        if(s%2==0){
            if(s%5==0){
                System.out.println("5 e bolunen cift sayı");
            }else{
                System.out.println("Tekrar deneyin");
            }
        }else if(s%2!=0){
            if(s%5==0){
                System.out.println("5 e bolunen tek sayı");
            }else{
                System.out.println("Tekrar deneyin");
            }
        }

    /*Example 3:Verilen yılı "Leap year "olup olmadıgını kontrol eden kodu yazınız.
    i)Yıl 100 e bolunurse 400 e de bolunmelıdır.
    ii)Yıl 100 bolunmezse 4 e bolunmelıdır.
     */
        System.out.println("lutfen bir yıl giriniz");
        int year= input.nextInt();
        if(year%100==0){
            if(year%400==0){
                System.out.println("Leap Year");
            }else{
                System.out.println("Leap year degil");
            }
        }else if(year%100!=0){
           if(year%4==0){
               System.out.println("Leap Year");
           }else{
               System.out.println("Leap year degil");
           }
        }




































    }
}