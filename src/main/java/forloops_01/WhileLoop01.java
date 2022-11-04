package forloops_01;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        //soru 1: 3 ten 10 a kadar tam sayıları aynı satırda ekrana yazdıran kodu yazdırınız.
     //I.yol
//  for(int i = 3; i<11 ; i++ ){
//      System.out.println(i);
//  }
     //II.yol
//     int i=3;
//     while(i<11){
//
//         System.out.print(i+" ");
//         i++;
//     }
   //Soru 2: 17 den 4 e kadar tum cıft sayıları aynı satırda ekrana yazdıran kodu yazınız.
//        for(int i=17; i>3 ; i--){
//            if(i%2==0){
//                System.out.print(i+" ");
//            }
//        }
//         int i=17;
//         while(i>3){
//             if(i%2==0){
//                 System.out.print(i+" ");
//             }
//             i--;
//         }
        //Soru 3:12 den 67 ye kadar tum tam sayıların toplamını ekrana yzadıran kodu yazdırınız.
//        int sum=0;
//        for(int i=12; i<68 ;i++){
//            sum=sum+i;
//        }
//        System.out.println(sum);
//        int sum=0;
//        int i=12;
//        while (i<68) {
//           sum=sum+i;
//            i++;
//        }
//        System.out.println(sum);
      //Soru 4: Size verilen bir tam sayını rakamları toplamını ekrana yazdıran kodu yazdırınız.
//        int sayı=456;
//        int sonuc=0;
//        for(int sayı=456 ; sayı>0 ; sayı=sayı/10){
//            sonuc=sonuc+sayı%10;
//        }
//        System.out.println(sonuc);
//       while(sayı>0){
//           sonuc=sonuc+sayı%10;
//        sayı=sayı/10;
//       }
//        System.out.println(sonuc);
     //Soru 5:Kullanıcıdan aldıgınız bır sayının carpım tablosunun ekrana yazdırınız.
        Scanner input=new Scanner(System.in);
        System.out.println("carpım tablosunu gırmek icin bir sayı giriniz");
        int sayı=input.nextInt();
        int i=1;
        while(i<11){
            System.out.println(sayı+"x"+i+"="+sayı*i);
            i++;
        }



































    }
}
