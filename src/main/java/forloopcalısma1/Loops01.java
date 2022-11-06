package forloopcalısma1;

import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {
        /*
        120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
         ardışık tam sayı arasında boşluk bırakarak yazınız.
         */
//        for(int i=120; i>10; i--){
//            if(i%4==0 && i%6==0){
//                System.out.print(i+ " ");
//            }
//        }

        //Bir String' de tekrarlanan karakterleri yazdırmak için kod yazınız.

//     String str="hello";
//     String s="";
//     for(int i=0; i<str.length(); i++){
//        char ch=str.charAt(i);
//         if(str.indexOf(ch)!=str.lastIndexOf(ch)){
//             System.out.print(ch+" ");
//         }
//     }

//     for(int i =0; i<str.length(); i++ ){
//         String ch=str.substring(i,i+1);
//         if(str.indexOf(ch)!=str.lastIndexOf(ch)){
//             if(!s.contains(ch)){
//                 s+=ch;
//                 System.out.print(ch+ " ");
//             }
//         }
  //   }

       /*
        Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        aynıysa, buna palindrom denir. Örneğin; "anna", "123321" palindromlardır.
         */

//        String str="elif";
//        String ters="";
//       for(int i=str.length()-1; i>-1; i--){
//           String trs=str.substring(i,i+1);
//           ters+=trs;
//       }
//
//       if(str.equals(ters)){
//           System.out.println("Polindromdur");
//       }else{
//           System.out.println("Polindrom degildir.");
//       }

       String s="anne";
       StringBuilder stringBuilder=new StringBuilder(s);//string i builder a cevirdim
       stringBuilder.reverse();
       System.out.println(stringBuilder);

       String t=stringBuilder.toString();//tekrar stringe cevirdim.

    /*
        Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        A A A A A
        A A A A A
        A A A A A
         */
//       for(int i=1; i<4; i++){
//           for(int j=1; j<6; j++){
//               System.out.print("A ");
//           }
//           System.out.println();
//       }

        // kullanicaidan bir sayi isteyin ve sayi ciftse tebrikler yazdirinr. tek ise kaybettiniz yazdirin
        //kullanici cift girdigi surece oyun devam etsin

        Scanner input=new Scanner(System.in);


        int sayı=0;
        do{
              System.out.println("Bir sayı giriniz.");

              sayı=input.nextInt();
            if(sayı%2==0){
                System.out.println( "tebrikler");

            }else{
                System.out.println("kaybettiniz");
                 break;
            }
        }while(true);

























































    }
}
