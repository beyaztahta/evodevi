package forloops_01;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {
        //Example 1:  3 den 6 ya kadar tam sayıların toplamını bulan kodu yazınız.
          int sum=0;
       for(int i=3; i<7 ; i++) {
           sum=sum+i;
       }
        System.out.print(sum);
        System.out.println();
       //Example 2: 8 den 12 ye kadar tam sayıların toplamını bulan kodu yazınız.
      int toplam=0;
      for(int a=8; a<13 ; a++){
          toplam=toplam+a;
      }
        System.out.println(toplam);
        System.out.println();
      //Example 3:6 dan 3 e kadar olan tam sayıların carpımını bulunuz.
        int carpım=1;
        for(int b=6; b >2 ; b--){
            carpım=carpım*b;
        }
        System.out.println(carpım);
      //Example 4: Size verilen bir tam sayının rakamları toplamını bulunuz.
        int sayı=961;
        int sonuc=0;
        for(int c=961; c>0 ; c=c/10){
            sonuc=sonuc+c%10;
        }
        System.out.println(sonuc);

        //Example 5: Size verilen bir Stringi ekrana ters cevirerek yazdırınız.
        String c="Emin";
        String ters="";
        for(int i=c.length()-1; i>=0 ; i--){
            char ch=c.charAt(i);
            ters=ters+ch;
        }
        System.out.println(ters);

       //Example 6 : Kullanıcıdan aldıgınız bir kelimeyi  tersten yazdırınız.
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz.");
        String word=input.next();
        String trs="";
        for(int k=word.length()-1; k>=0; k--){
            char h=word.charAt(k);
            trs=trs+h;
        }
        System.out.println(trs);


































    }
}
