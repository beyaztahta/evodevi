package forloops_01;

import java.util.Scanner;

public class ForLoop_1 {
    public static void main(String[] args) {

        //SORU1: Ekrana 10 kez "Java guzeldir"yazdıran kodu yazınız.
         String str="Java guzeldir";
         for( int i=1  ;i<11   ; i++ ){
             System.out.print(str+" ");
         }
        System.out.println();
//         int i=1;
//         while(i<11){
//             System.out.print(str+" ");
//             i++;

//         }
//        int i=1;
//        do{
//            System.out.println(str+" ");
//         i++;
//        }while(i<11);

        //SORU2:10 ile 30 (10 ve 30 dahil) aralarındaki sayıları aralarında virgul olarak yazdıran kodu yazınız.

//         for(int a=10; a<31; a++) {
//             System.out.print(a+",");
//         }
//         int a=10;
//         while(a<31){
//             System.out.print(a+",");
//             a++;
//         }
//        int k=10;
//        do{
//            System.out.print(k+",");
//            k++;
//        }while(k<31);
//        System.out.println();
      //SORU3:100den baslayarak 50 ye kadar olan sayıları aralarında virgul olarak aynı satırda yazdıran kodu yazınız.
//       for(int i=100; i>49   ; i-- ){
//           System.out.print(i+",");
//       }
//        System.out.println();

//          int t=100;
//          while(t>49){
//              System.out.print(t+",");
//              t--;
//          }
//        System.out.println();
//          int b=100;
//          do{
//              System.out.print(b+",");
//              b--;
//          }while(b>49);
//        System.out.println();

        //SORU5:Kullanıcıdan 100 den kucuk bir sayı alınız.1 den baslayarak girilen sayının 3 un katı olan sayıları yazdırın..

         Scanner input=new Scanner(System.in);
         System.out.println("100 den kucuk bir sayı giriniz.");
         int sayı=input.nextInt();
             for(int i=1; i<sayı; i++){
                 if(i%3==0){
                     System.out.print(i+",");
                 }
             }
        System.out.println();
     // SORU6: Kllunıcıdan 100den kucuk bir sayı isteyin.1 den baslayarak girilen sayının 3 un veya 5 in katı olan sayıları yazdırın

        System.out.println("Luten 100 den kucuk bir sayı giriniz.");
             int s=input.nextInt();
             for(int c=1; c<s ; c++){
                 if(c%3==0 && c%5==0){
                     System.out.print(c+",");
                 }
             }






















    }
}
