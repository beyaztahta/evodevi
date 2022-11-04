package datacastingodevi;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
                            //IF STATEMENTS
        //Example 1:Kullanıcıdan bir sayı isteyin ve tek mi çift mi oldugunu yzdırın

        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int d=input.nextInt();
        if(d%2==0) {
            System.out.println("cift sayı");
        } else if (d%2!=0) {
            System.out.println("tek sayı");
        }

        //Example 2: Kullanıcıdan gun ismi alıp hafta sonu hafta içi olup olmadıgını yazdırın.
        Scanner day=new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz");
        String day1=day.next().toLowerCase();
        switch(day1){
            case "pazar":
                System.out.println("haftasonu");
                break;
            case"pazartesi":
                System.out.println("hafta ici");
                break;
            case "salı":
                System.out.println("hafta ici");
                break;
            case"carsamba":
                System.out.println("hafta ici");
                break;
            case"persembe":
                System.out.println("hafta ici");
                break;
            case"cuma":
                System.out.println("hafta ici");
                break;
            case"cumartesi":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("Gecerli bir gün ismi giriniz.");
        }

        //Example 3:Kullanıcıdan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun
        // isimlerini yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("'P'harfi ile baslayan gun ismi giriniz.");
        String gun=scan.next();
        if(gun.equalsIgnoreCase("pazar")) {
            System.out.println("pazartesi\nsalı");
        }else if(gun.equalsIgnoreCase("pazartesi")){
            System.out.println("pazar\npersembe");
        }else if(gun.equalsIgnoreCase("persembe")){
            System.out.println("pazar\npazartesi");
        }else{
            System.out.println("Verilen harf ile baslayan gun seciniz.");
        }






        }
    }

