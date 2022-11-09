package arrays;

import java.util.Scanner;

public class ArraysQ3AtbashCode {
    public static void main(String[] args) {
        /*
      Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
      Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
      Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
      Örn: A-->Z, B-->Y ...
      "abcdefghijklmnopqrstuvwxyz";
      "zyxwvutsrqponmlkjihgfedcba";
     */
        Scanner input=new Scanner(System.in);
        System.out.println("Bir string giriniz.");

        //1.yol
//        String str1="abcdefghijklmnopqrstuvwxyz";
//        String str2="zyxwvutsrqponmlkjihgfedcba";
          String str3= input.nextLine().toLowerCase();
//
//        for(int i=0;i<str3.length(); i++){
//            for (int j=0; j<str1.length(); j++){
//                if(str3.charAt(i)==str1.charAt(j)){
//                    System.out.print(str2.charAt(j));
//                }
//
//            }
//        }

        //2.yol

        for (int i=0; i<str3.length(); i++){
            int idx='z'- str3.charAt(i);
            System.out.print((char)('a'+idx));

        }


    }
}
