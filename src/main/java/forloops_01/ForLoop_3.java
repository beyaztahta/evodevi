package forloops_01;

import java.util.Scanner;

public class ForLoop_3 {
    public static void main(String[] args) {
   //SORU1 :Kullanıcıdan iki tam sayı isteyin.Girilen sayılar ve aralarındaki tum sayıların toplamını ekrana yazdıran kodu yazınız
            Scanner input=new Scanner(System.in);
//            System.out.println("iki tam sayı giriniz.");
//            int a=input.nextInt();
//            int b=input.nextInt();
//            int sum=0;
//            for(int i=a; i<b+1   ; i++ ){
//                sum=sum+i;
//            }
//             System.out.println(sum);

   //SORU2:Kullanıcıdan 10 dan kucuk bir tam sayı isteyin.Girilen sayının faktoriyelini bulun.
        //5!=5*4*3*2*1
        System.out.println("10 ve 10 dan kucuk pozitif bir sayı giriniz.");
        int sayı=input.nextInt();
        int faktoriyel=1;

        for(int i=1;  i<=sayı ;i++){
         faktoriyel=faktoriyel*i;

        }
        System.out.println(sayı+"!"+"="+faktoriyel);

        /*SORU3:Kullanıcıdan pozitif bir rakam girmesini isteyin.Girilen rakama gore asagıdakı seklı cızdrın.
          *
          **
          ***
          ****
          */
        System.out.println("lutfen 10 dan kucuk pozitif bir sayı giriniz.");
        int s=input.nextInt();
        for(int i=1; i<5  ;i++){
            for(int k=1; k<=i  ; k++ ){
                System.out.print(s);
            } System.out.println();
        }
      //SORU4: Kullanıcıdan bir rakam isteyin ve carpım tablosunu olusturan kodu yazınız.
        System.out.println("carpım tablosunu girmek icin bir sayı giriniz.");
        int b=input.nextInt();

//        for(int i=1;i<11;i++){
//            System.out.println(b+"x"+ i +"="+(b*i));
//        }
        int d=1;
        while(d<11){
            System.out.println(b+"x"+d+"="+(b*d));
            d++;

        }




    }
}
