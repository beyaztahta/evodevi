package forloops_01;

import java.util.Scanner;

public class WhileLoops_1 {
    public static void main(String[] args) {
        //Soru1:3 ten 13 e kadar tum tek tam sayıları ekrana yazdıran kodu yazınız.
//        int i=3;
//        while(i<14){
//            if(i%2!=0){
//                System.out.print(i+",");
//            }
//            i++;
//        }
     //Soru2:for ve while kullanarak 3 basamaklı sayılardan 15 ,20 , ve 90 na bolunen tam sayıları yazan kodu yazınız.

//       for(int i=100; i<1000 ;i++){
//           if(i%15==0 && i%20==0){
//
//           }else if(i%20==0 && i%90==0){
//
//           }else if(i%15==0 && i%90==0)
//               System.out.print(i+"-");
//       }
//        System.out.println();
      ////......
//        int k=100;
//       while(k<1000){
//           if(k%15==0 && k%20==0){
//
//           }else if(k%90==0 && k%20==0){
//
//           }else if(k%15==0 && k%90==0)
//               System.out.print(k+" ");
//           k++;
//       }
       //Soru3:Kullanıcıdan baslangıc ve bitis degerlerini alın.baslangıc ve bitis dahil aralarındaki tum cift tam sayıları
        //while loop kullanarak ekrana yazdıran kodu yazınız.
        Scanner input=new Scanner(System.in);
//        System.out.println("baslangıc degeri soyleyınız");
//        int ilk=input.nextInt();
//        System.out.println("bitis degerini soyleyınız");
//        int son=input.nextInt();
//
//        int i=ilk;
//        while(i<=son){
//            if(i%2==0){
//                System.out.print(i+"-");
//            }
//            i++;
//        }
//        System.out.println();
     //Soru4:Kullanıcıdan baslangıc ve bitis harfi alın.Baslangıc harfınde baslayıp  bitis harfinde biten harfleri buyuk
        //olarak ekrana yazdıran kodu yazınız.
        System.out.println("Lutfen bir harf giriniz.");
        char ilk=input.next().toUpperCase().charAt(0);
        System.out.println("Lutfen ikinci bir harf giriniz.");
        char son=input.next().toUpperCase().charAt(0);
        char i=ilk;
        while(i<=son){
                System.out.print(i+"-");

            i++;
        }



    }
}
