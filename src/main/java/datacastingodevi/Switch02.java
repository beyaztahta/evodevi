package datacastingodevi;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*Example 1:Kullanıcıdan bir sayı girmesini isteyin.Girilen sayı:
        i) 10 ise==> iki basamaklı en kucuk sayı sayı
        ii)100 ise ==>uc basamaklı en kucuk sayı
        iii)1000 ise==>dort basamaklı en kucuk sayı
        ...==>girdigin sayıyı degistir yazdırın.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz.");
        int sayı=input.nextInt();
        switch(sayı){
            case 10:
                System.out.println("iki basamaklı en kucuk sayı sayı");
                break;
            case 100:
                System.out.println("uc basamaklı en kucuk sayı");
                break;
            case 1000:
                System.out.println("dort basamaklı en kucuk sayı");
                break;
            default:
                System.out.println("girdigin sayıyı degistir");
        }
     /*Example 2:Kullanıcıdan SDET kelimesindeki harflerden birini yazmasını ıstreyin.kullanıcı S==>SOFTWARE,D==>DEVELOPER,
     E==>ENGINEER,T==>IN TESTING yazdırın.*/
        System.out.println("lütfen'SDET' kelinesindeki harflerden birini yazınz");
        String harf=input.next();
        switch(harf){
            case "S":
                System.out.println("SOFTWARE");
                break;
            case "D":
                System.out.println("DEVELOPER");
                break;
            case"E":
                System.out.println("ENGINEER");
                break;
            case"T":
                System.out.println("IN TESTING");
                break;
            default:
                System.out.println("Size verilen harflerden birini giriniz..");
        }
        //Example 3:kullanıcıdan gun ismi alıp "hafta ici"ve "hafta sonu"oldugunu yazdırın.
        System.out.println("bir gun ismi giriniz.");
        String gun=input.next();
        switch(gun){
            case "pazar":
                System.out.println("hafta sonu");
                break;
            case"pazartesi":
                System.out.println("hafta ici");
                break;
            case"salı":
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
                System.out.println("gecerli bir gun giriniz..");
        }

    }
}
