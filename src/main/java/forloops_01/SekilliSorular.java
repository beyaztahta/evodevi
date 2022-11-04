package forloops_01;

import java.util.Scanner;

public class SekilliSorular {
    public static void main(String[] args) {
         /*
          1 2 3 4 5 6
           2 3 4 5 6
            3 4 5 6
             4 5 6
              5 6
               6
         */

        for(int i=1; i<=6;i++){
            for(int b=1; b<i;b++){
                System.out.print(" ");
            }for(int k=i;k<=6;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak sekilde yazdiriniz,
        // bosluk veya a harfi geldiginde bunlari yazmasin
//        Scanner input=new Scanner(System.in);
//        System.out.println("lutfen bir kelime giriniz.");
//        String str= input.nextLine();
//        for(int i=0; i<str.length() ; i++){
//            if(str.charAt(i)=='a' || str.charAt(i)==' '){
//                continue;
//            }
//            System.out.print(str.charAt(i));
//        }
//        System.out.println();

        /*
         *********
             *
             *
             *
             *
         */
         for (int i=1; i<=5   ;i++ ){
             for(int k=1; k<=9  ; k++  ){
                 if(i==1 || (i==2 && k==5)||(i==3 && k==5)||(i==4 && k==5)|| (i==5 && k==5) ){
                     System.out.print("*");
                 }else System.out.print(" ");
             }System.out.println();
         }
        System.out.println();
        /*

            *           sekildeki gorulen ucgeni yazdiriniz
          *   *
         *     *
        *       *
        *********

         */
        for(int a=1; a<=5;a++){
            for(int b=1; b<=9  ; b++){
                if((a==1 && b==5)|| (a==2 && (b==4 || b==6)||(a==3 && (b==3 || b==7))||(a==4 &&(b==2||b==8))|| a==5)){
                    System.out.print("*");
                }else System.out.print(" ");

            }System.out.println();
        }
        System.out.println();
        //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not: govde sabit sayi = 5 olsun
            /* tac uzunlugu => 6 iken

       ^
       ^^
       ^^^
       ^^^^
       ^^^^^
       ^^^^^^
       |||
       |||
       |||
       |||
       |||
*/
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen tac uzunlugu giriniz.");
        int tacUzunluk=input.nextInt();
        String yaprak="";
        for(int i=0; i<tacUzunluk ;i++){
            System.out.println(yaprak);
            yaprak+="^";
        }for(int i=0; i<6   ; i++){
            System.out.println("|||");
        }
        System.out.println();

    }


}
