package dersanlatımsoruları;

import java.util.Scanner;

public class Sorularr {
    public static void main(String[] args) {
         /*
      Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi
      oluşturmak için kod yazınız.
    a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
    b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
    c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
    d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
       */
      Scanner input=new Scanner(System.in);
//      System.out.println("iki tam sayı giriniz.");
//      double sayı1=input.nextDouble();
//      double sayı2=input.nextDouble();
//        System.out.println("+,-,*,/ isaretlerinden birini giriniz.");
//        char ch=input.next().charAt(0);
//        if(ch=='+'){
//            System.out.println("toplam="+(sayı1+sayı2));
//        }else if(ch=='-'){
//            System.out.println("cıkarma="+(sayı1-sayı2));
//        }else if(ch=='*'){
//            System.out.println("carpım="+(sayı1*sayı2));
//        }else if(ch=='/'){
//            System.out.println("bolum="+(sayı1/sayı2));
//        }else System.out.println("gecerlibir tam sayı giriniz...");


    /*
       Kullanicidan 100 den kucuk bir tamsayi isteyin. 1'den baslayarak
       girilen sayiya kadar tum sayilari yazdirin. Ancak:
       -Sayi 3 un kati ise sayi yerine "Java" yazdirin
       -Sayi 5 in kati ise sayi yerine "Guzeldir" yazdirin
       -Sayi hem 3'un hem de 5'in kati ise sayi yerine "Java Guzeldir" yazdirin
        */
        System.out.println("Lutfen 100 den kucuk 0 dan buyuk sayı giriniz.");
        int sayı=input.nextInt();
       if(sayı<101 && sayı>0){
         if(sayı%3==0 && sayı%5!=0){
             System.out.println("Java");
         }else if(sayı%5==0 && sayı%3!=0){
             System.out.println("Guzeldir");
         }else if(sayı%15==0){
             System.out.println("Java Guzeldir");
         }
           }else System.out.println("gecerli bir sayı giriniz.");

       }

    }

