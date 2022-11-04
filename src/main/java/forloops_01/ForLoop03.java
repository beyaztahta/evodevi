package forloops_01;

import java.util.Scanner;

public class ForLoop03 {
    public static void main(String[] args) {
        //Exanple 1:Bir String deki "m"karakterleri hariç tum karakterleri yazdırınız.
//        String str="Andromedam";
//        for(int i=0 ; i<str.length();i++){
//           char ch=str.charAt(i);
//           if(ch=='m'){
//               continue;
//           }
//            System.out.print(ch);
//        }

     //Example 2: 1 den 100 e kadar 6 ile bölünrnler hariç tum sayıları ekrana yazdıralım

//        for(int i=1;i<101; i++){
//            if(i%6==0){
//                continue;
//            }
//            System.out.print(i+" ");
//        }
     // Example 3: Size verilen bir Stringdeki 'm 'den onceki karakterleri yazdırınız.
//        String str="Luxemburg";
//        for(int i=0; i<str.length();i++){
//            char ch=str.charAt(i);
//            if(ch=='m'){
//                break;
//            }
//            System.out.print(ch);
//        }
      // Example 4:Asagıdaki cıktıyı vercek kodu yazınız.
      /*  Week :1
           day:1
           day:2
           day:3
         Week :2
           day:1
           day:2
           day:3
         Week :3
           day:1
           day:2
           day:3
         Week :4
           day:1
           day:2
           day:3

       */
//        for (int i=1; i<5;i++) {
//            System.out.println("Week:" + i);
//            for (int k = 1; k < 8; k++) {
//                System.out.println("day:" + k);
//            }
//        }
        // Example 5:Asagıdaki cıktıyı vercek kodu yazınız.
         /*
               ****
               ****
               ****
          */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen satır sayısını giriniz");
        int satır=input.nextInt();
        System.out.println("lutfen sütun sayısını giriniz");
        int sutun=input.nextInt();
        System.out.println("lütfen bir karakter giriniz:*,+,? gibi...");
        char c=input.next().charAt(0);
        for(int i=1; i<satır+1 ;i++){
            for(int k=1; k<sutun+1; k++){
                System.out.print(c);
            }
            System.out.println();
        }
        // Example 6:Asagıdaki cıktıyı vercek kodu yazınız.
         /*   1
              12
              123
              1234
              12345
          */
        for(int i=1;i<6;i++){

            for(int k=1;k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }


























    }
}
