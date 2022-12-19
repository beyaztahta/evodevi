package ifstatement00;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
        //3) Verilen ay numaralarından başlayarak tüm ay adlarını yazdıran bir kod yazınız.
        //Örnek: Ay numarası 9 ise konsolda kodunuz Eylül Ekim Kasım Aralık olacaktır.
    List<String> gelecekAylar=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir ay numarası giriniz.");
        int month=scan.nextInt();
        switch (month){
            case 1:
                System.out.println("Ocak");
            case 2:
                System.out.println("subat");
            case 3:
                System.out.println("mart");
            case 4:
                System.out.println("nisan");
            case 5:
                System.out.println("mayıs");
            case 6:
                System.out.println("haziran");
            case 7:
                System.out.println("temmuz");
            case 8:
                System.out.println("agustos");
            case 9:
                System.out.println("eylul");
            case 10:
                System.out.println("ekim");
            case 11:
                System.out.println("kasım");
            case 12:
                System.out.println("aralık");
                break;
            default:
                break;

        }
//        if(gelecekAylar.isEmpty()){
//            System.out.println("Gecerli bir ay numarsı giriniz.");
//        }else{
//            for (String w:gelecekAylar) {
//                System.out.println(" "+w);
//            }
//        }

        /*
        4) Cinsiyet "Erkek" ise "Erkek" yazdırınız.
      Cinsiyet "Kadın" ise "Kız" yazdırınız.
      Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.
       Not : Bu seçenekler dışındakilerini yoksayınız.
         */
        String cinsiyet="Erkek";
        switch (cinsiyet.toLowerCase()){
            case "erkek":
                System.out.println("Erkek");
                break;
            case "kadın":
                System.out.println("Kız");
                break;
            default:
                System.out.println("Digerleri");
        }

//5) Belirli bir yılın belirli bir ayındaki gün sayısını görüntülemek için bir kod yazınız.
//Örnek: 2000 yılının Şubat ayında gün sayısı 29.

     int ay=3;
     int yıl=1995;
     int gunSayısı=0;
     switch (ay){
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
             gunSayısı=31;
             break;
         case 4:
         case 6:
         case 9:
         case 11:
             gunSayısı=30;
             break;
         case 2:
             if((yıl%4==0)&&!(yıl%100==0)||(yıl%400==0)){
                 gunSayısı=29;
             }else{
                 gunSayısı=28;
             }
             break;
         default:
             System.out.println("gecersiz ay");
             break;
     }
        System.out.println(gunSayısı);


















    }
}
