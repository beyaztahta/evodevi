package ifstatement00;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
      /*  9) Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi
        oluşturmak için kod yazınız.
        a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
        b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
        c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
        d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.

       */
//     double a=10.2,b=5;
//     String operator="+";
//     if(operator.equals("+")){
//         System.out.println(a+b);
//     }else if(operator.equals("-")){
//         System.out.println(a-b);
//     }else if(operator.equals("*")){
//         System.out.println(a*b);
//     }else if(operator.equals("/")){
//         System.out.println(a/b);
//     }
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        double x=input.nextDouble();

        System.out.println("enter a number");
        double y= input.nextDouble();

        System.out.println("enter a +,-,*,/");
        char ch=input.next().charAt(0);


//     double x=10.2;
//     double y=5;
//     char ch='-';

        switch (ch){
            case '+':
                System.out.println(x+y);
                break;
            case '-':
                System.out.println(x-y);
                break;
            case '*':
                System.out.println(x*y);
                break;
            case '/':
                System.out.println(x/y);
                break;
            default:
                System.out.println("Gecerli bir isaret giriniz.");
        }
      /*
         10) Verilen BMI değerleri için Vücut Kitle İndeksi (BMI) ile ilgili mesajları yazdırmak için kod
         yazınız.
       Geçersiz BMI değeri < 0
        Zayıf = <18.5
       Normal ağırlık = 18.5–24.9
       Fazla kilolu = 25–29.9
       Obezite = 30 veya daha büyük BMI
         */
        double bmi=35;
        if(bmi<0){
            System.out.println("Gecersiz");
        }else if(bmi<18.5){
            System.out.println("zayıf");
        }else if(bmi>=18.5 && bmi<24.9){
            System.out.println("normal agırlık");
        }else if(bmi>=25 && bmi<29.9){
            System.out.println("fazla kilolu");
        }else if(bmi>30){
            System.out.println("obezite");
        }

    }
}
