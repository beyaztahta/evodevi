package datacastingodevi;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //Example 1:Kullanıcıdan haftanın kacıncı gunu oldugunu sorun ve gun ismini yazdırın.
        Scanner input=new Scanner(System.in);
        System.out.println("Gun numarası giriniz=1,2,3,4,5,6,7 gibi..");
        byte gun=input.nextByte();
        switch (gun){
            case 1:
                System.out.println("pazar");
                break;
            case 2:
                System.out.println("pazarteesi");
                break;
            case 3:
                System.out.println("salı");
                break;
            case 4:
                System.out.println("carsamba");
                break;
            case 5:
                System.out.println("persembe");
                break;
            case 6:
                System.out.println("cuma");
                break;
            case 7:
                System.out.println("cumartesi");
                break;
            default:
                System.out.println("gecerli bir gun sayısı giriniz...");
        }
       //Example 2:Kullanıcıdan kacıncı ay oldugunu sorun ve ayı yazdırın.
        System.out.println("lütfen kacıncı ayda oldugunuzu giriniz.");
        byte ay=input.nextByte();
        switch(ay){
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;
            default:
                System.out.println("gecerli bşr ay numarası giriniz.");
        }


























    }

}
