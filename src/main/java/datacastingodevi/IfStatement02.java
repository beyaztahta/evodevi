package datacastingodevi;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //soru 1: Kullanıcıdan dikdortgenın kenar uzunluklarını isteyin ve dikdortgenin kare olup olmadıgını yazdırın.
          Scanner scan=new Scanner(System.in);
        System.out.println("dikdortgenin uzun kenarını giriniz. ");
        int x=scan.nextInt();
        System.out.println("dikdortgenin kısa kenarını giriniz.");
       int y=scan.nextInt();
        if(x==y){
            System.out.println("kare");
        }else{
           System.out.println("dikdortgen");
        }

       /*soru 2:Kullanıcıdan bir gun alın;
         cuma==>müslümanlar icin kutsal bir gundur...
         cumartesi==>yahudiler icin kutsal gun...
          pazar==>hristiyanlar icin kutsal bir gundur... yazdırın.
      */
        System.out.println("bir gun ismi giriniz.");
        String gun=scan.next().toLowerCase();
        switch(gun){
            case"pazar":
                System.out.println("hristiyanlar icin kutsal bir gundur...");
                break;
            case"pazartesi" :
                System.out.println("haftaiçi");
                break;
            case"salı":
                System.out.println("haftaiçi");
                break;
            case"carsamba":
                System.out.println("haftaiçi");
                break;
            case"persembe":
                System.out.println("haftaiçi");
                break;
            case"cuma":
                System.out.println("müslümanlar icin kutsal bir gundur...");
                break;
            case"cumartesi":
                System.out.println("yahudiler icin kutsal gun...");
                break;
            default:
                System.out.println("gecerli bir gun ismi giriniz. ");
        }

     //soru 3:Kullanıcıdan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadıgını yazdırın.
        System.out.println("bir karakter giriniz:+,l,s,* gibi..");
        char ch=scan.next().charAt(0);

        if(ch>='a'&& ch<='z'|| ch>='A'&& ch<='Z'){
            System.out.println("girilen karakter harftir..");

        }else{
           System.out.println("karakterdir...");
       }

      /*soru 4:Kullanıcıdan yasını sorun
      ==>Eger yas 65 ten kucukse "Emekli olamazsın,calısmalısın.."
      ==>65 e esit ve buyukse "Emekli olabilirsin"
       */
        System.out.println("Lutfen yasınızı giriniz.");
        int yas=scan.nextInt();
        if(yas<65){
            System.out.println("Emekli olamazsın,calısmalısın..");
        }else if(yas>=65){
            System.out.println("Emekli olabilirsin");
        }else{
            System.out.println("gecerli bir yas giriniz...");
        }
        /*soru 5: Kullanıcıdan bir üçgenin üç kenar uzunlugunu giriniz.
        i)Uc kenar uzunlugu esıtse ekrana "ESKENAR UCGEN"
        ii)Diger durumlarda ekrana"ESKENAR UCGEN DEGİL"yazdırın
         */
        System.out.println("bir ucgenın uc kenar uzunlugunu giriniz.");
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();
        if(a==b &&b==c){
            System.out.println("ESKENAR UCGEN");
        }else if(a!=b && b!=c){
            System.out.println("ESKENAR UCGEN DEGİL");
        }else{
            System.out.println("gecerli bir tam sayı giriniz.");
        }

    }
}