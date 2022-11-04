package forloops_01;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {
        //Example 1:Ekrana 15 kere "Hello"yazdırınız.
        for(int i=1 ; i<16  ; i++ ){
            System.out.println("hello");
        }
        System.out.println();
        //Example 2:4 den 7 ye kadar tum sayıları ekrana yazdıran kodu yazdırınz.
       for(int k=4 ; k<8   ;  k++  ){
            System.out.print(k+"  ");
        }
        System.out.println();
        //Example 3:14 den 5 e kadar tum sayıları ekrana yazdıran kodu yazdırınız
        for(int m=14 ; m>4 ; m-- ){
            System.out.print(m+" ");
        }
        System.out.println();
       //Example 4:14 den 5 e kadar tum cıft sayıları yazdırınız
        for( int a=14 ; a>4   ; a--  ){
            if(a%2==0){
                System.out.print(a+" ");
            }
        }
        System.out.println();
        //Example 5: 28 den 157 ye kadar olan tum tek sayıları ekrana yazdırınız.
        for( int b=28; b<158 ; b++){
            if(b%2!=0){
                System.out.print(b+" ");
            }
        }
        System.out.println();
        //Example 6:"Java" Stringini "J*a*v*a*"Stringine ceviren kodu yazınız.
        String str="Java";
        for( int c=0 ; c<str.length() ; c++ ){
            char ch=str.charAt(c);
            System.out.print(str.charAt(c)+"*");
        }
        System.out.println();
        //Example 7: Size verilen String de tekrarsız karakterleri ekrana yazdırın.
        String cumle="Hello Leylaaaa";
        for(int s=0 ;s<cumle.length() ;  s++  ){
            char d=cumle.charAt(s);
        if(cumle.indexOf(d)==cumle.lastIndexOf(d)){
            System.out.print(d);
         }
        }
        System.out.println();
        //Example 8: kullanıcıdan bir cumle isteyip tekrarsız karakterleri yazdırın.
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen iki kelimeden olusan bir cumle yazınız..");
        String sentence=input.nextLine();
        for(int e=0 ;  e<sentence.length()  ;  e++  ){
            char x=sentence.charAt(e);
            if(sentence.indexOf(x)==sentence.lastIndexOf(x)){
                System.out.print(x+" ");
            }
        }
    }
}
