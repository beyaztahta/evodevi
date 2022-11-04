package forloops_01;

import java.util.Scanner;

public class ForLoop_2 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 100 den kucuk bir tam sayı isteyin.1 den baslayarak girilen sayıya kadar tum sayıları yazdırın.Ancak
        sayı 3 un katı ise sayı yarine "Java"yazdırın
        sayı 5 in katı ise sayı yerine "Güzeldir"yazdırın
        sayı hem 3 un hem de 5 in katı ise "Java Guzeldir"yazdırın
         */
        Scanner input=new Scanner(System.in);
//        System.out.println("Lutfen 100 veya 100 den kucuk bir tam sayı giriniz.");
//        int sayı=input.nextInt();
//        if(sayı>0 && sayı<101){
//            for(int i=1; i<sayı ; i++){
//                if(i%3==0 && i%5!=0){
//                    System.out.print("Java"+",");
//                }else if(i%5==0 && i%3!=0){
//                    System.out.print("Guzeldir"+",");
//                }else if(i%15==0){
//                    System.out.print( "Java Guzeldir"+",");
//                }else System.out.print(i+",");
//            }
//        }else System.out.println("Lutfen gecerli bir sayı giriniz");
//        System.out.println();

     //SORU2:Kullanıcıdan bir String isteyin ve tersten yazdırın.
//        System.out.println("Lutfen bir cumle giriniz");
//        String str=input.nextLine();
//        String ters="";
//
//        for(int i=str.length()-1; i>=0  ; i--   ){
//            char ch=str.charAt(i);
//            ters=ters+ch;
//        }
//        System.out.println(ters);

     ///.......
//        String kelıme="file";
//        String trs="";
//        for(int t=kelıme.length()-1; t>=0  ; t-- ){
//            char c=kelıme.charAt(t);
//            trs=trs+c;
//        }
//        System.out.println(trs);
      //SORU3:
        //Bir String ' in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        //aynıysa, buna palindrom denir. Örneğin; "anna", "123321 " palindromlardır.

//        String a="mehmet";
//        String b="";
//        for(int i=a.length()-1; i>=0  ; i--) {
//            char s = a.charAt(i);
//            b = b + s;
//        }
//            if(a.equals(b)){
//                System.out.println("polindromdur.");
//            }else {
//                System.out.println("polindrom degildir.");
//            }
          /*
      Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi
oluşturmak için kod yazınız.
a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
       */
        System.out.println("Lutfen iki tam sayı giriniz.");
       double sayı1=input.nextDouble();
       double sayı2=input.nextDouble();
        System.out.println("+,-,* ve / dort işaretten birini giriniz.");
       char ch=input.next().charAt(0);
       if(ch=='+'){
           System.out.println(sayı1+sayı2);
       }else if(ch=='-'){
           System.out.println(sayı1-sayı2);
       }else if(ch=='*'){
           System.out.println(sayı1*sayı2);
       }else if(ch=='/'){
           System.out.println(sayı1/sayı2);
       }else System.out.println("gecerli bir isaret giriniz...");





















    }
}
