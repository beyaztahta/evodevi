package datacastingodevi;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        /*Example 1:Kullanıcıdan bır gun ismi yazmasını isteyin.Gecerli bir gun ismi girerse 1.,2.ve 3. harflerini buyuk
         digerlerini kucuk olarak yazdırın. gecerli br gun ismi girmezse "Gecerli bir gun ismi giriniz..."yazdırın
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz ");
        String gun=scan.next();
          if(gun.equalsIgnoreCase("pazar")){
           System.out.println("PAZar");
       }else if(gun.equalsIgnoreCase("pazartesi")){
            System.out.println("PAZartesi");
       }else if(gun.equalsIgnoreCase("salı")){
            System.out.println("SALı");
       }else if(gun.equalsIgnoreCase("carsamba")){
            System.out.println("CARsamba");
       }else if(gun.equalsIgnoreCase("persembe")){
           System.out.println("PERsembe");
       }else if(gun.equalsIgnoreCase("cuma")){
           System.out.println("CUMa");
       }else if(gun.equalsIgnoreCase("cumartesi")){
           System.out.println("CUMartesi");
       }else{
           System.out.println("Gecerli bir gun ismi giriniz.");
       }

    /*Example 2:Kullanıcıdan iki sayı isteyin,sayıların ikisi de pozitif ise toplamını yazdırın,
    ikisi de negatif ise carpımını yazdırın,ikiside farklı isaretli ise"Farklı isaretlerde islem yapamazsın",sayılardan
    sıfıra esit olan varsa "Sıfır carpmaya gore yutan elemandır"yazdırın.
     */
        System.out.println("lütfen iki sayı giriniz");
        int a=scan.nextInt();
        int b=scan.nextInt();
        if(a>0 && b>0){
            System.out.println(a+b);
        }else if(a<0 && b<0 ){
            System.out.println(a*b);
        }else if(a<0 && b>0 || a>0 && b<0){
            System.out.println("Farklı isaretlerde islem yapamazsın");
        }else if(a==0 || b==0){
            System.out.println("Sıfır carpmaya gore yutan elemandır");
        }else{
            System.out.println("Lutfen gecerli bir sayı giriniz...");
        }
    /*Example 3:Kullanıcıdan 100 uzerinden notunu isteyin.Notu harf sistemine cevirip yazdırın.
            50 den kucukse D,
            50-60 arası C,
            60-80 arası B,
            80 ve uzeri A
     */
        System.out.println("lutfen ders notunuzu giriniz..");
        double n=scan.nextDouble();
        if(n<50){
            System.out.println('D');
        }else if(n>=50 && n<=60){
            System.out.println('C');
        }else if(n>60 && n<80){
            System.out.println('B');
        }else if(n>=80){
            System.out.println('A');
        }else{
            System.out.println("Gecerli bir ders notu giriniz...");
        }
    /*Example 4:Kullanıcıdan maas icin bir teklif isteyin.Asagıdaki cevaplara gore sunları yazdırın:
              Teklif 80.000 uzerinde ise "Kabul ediyorum"
              60-80.000  arasında ise "Konusabiliriz"
              60.000 altında ise "Malesef kabul edimem..."
     */
        System.out.println("Lütfen bes basamaklı bir maas giriniz..");
        int m=scan.nextInt();
        if(m>80000){
            System.out.println("Kabul ediyorum");
        }else if(m>=60000 && m<80000){
            System.out.println("Konusabiliriz");
        }else if(m<60000){
            System.out.println("Malesef kabul edemem...");
        }
}
  }
