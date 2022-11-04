package forloops_01;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
     //Soru 1: Kullanıcıdan bir sayı alınız,sayı 100 den kucukse ekrana"Kazandınız!";aksi halde ekrana "Kaybettin!" yazdırınız.
        // Kullanıcı kazandıkca oyun devam edecektir.
        Scanner input=new Scanner(System.in);
//        int sayı=0;
//        do{
//            System.out.println("Lutfen bir sayı giriniz.");
//            sayı=input.nextInt();
//            if(sayı<100){
//                System.out.println("Kazandınız!");
//            }
//        }while(sayı<100);
//        System.out.println("Kaybettin!");

//     for(int sayı=0; sayı<100 ; sayı++){
//         System.out.println("Lutfen bir sayı giriniz.");
//         sayı=input.nextInt();
//         if(sayı<100){
//             System.out.println("Kazandınız!");
//         }
//     }
//        System.out.println("Kaybettin!");
//          int sayı=0;
//          while(sayı<100){
//              System.out.println("Lutfen bir sayı giriniz.");
//              sayı=input.nextInt();
//              if(sayı<100){
//                  System.out.println("Kazandınız!");
//              }
//              sayı++;
//          }
//        System.out.println("Kaybettin!");

     //Soru 2:Kullanıcıdan isimler alınız ,ilk harfinin buyuk olup olmadıgını kontrol ediniz.

        do{
            System.out.println("isim giriniz.");
            char ch=input.next().charAt(0);
            if(ch>='A'&& ch<='Z'){
                System.out.println("isminizi basarıyla girdiniz.");
            }else{
                System.out.println("isminizi yanlıs girdiniz isleminiz iptal edilmistir.");
                break;
            }
        }while(true);


























    }
}
