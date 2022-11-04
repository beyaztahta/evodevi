package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
   /*SORU 1:String bir Array olusturunuz.
            Bu Array e 5 tane isim yerlestiriniz.
            Bu isimlrdeki karakter sayılarının toplamını ekrana yazdırınız.
    */
        String stdNames[]=new String[5];
         stdNames[0]="Ali";
         stdNames[1]="Tom";
         stdNames[2]="Veli";
         stdNames[3]="Kemal";
         stdNames[4]="Cem";

         int sum=0;
         for(String w:stdNames){
             sum=sum+w.length();
         }
        System.out.println(sum);

     /*SORU 2:char bir Array olusturunuz.
              Bu Array e 5 eleman ekleyiniz.
              Bu Array deki sadece buyuk harfleri ekrana yazdırınız.
      */
        char ch[]=new char[5];
          ch[0]='A';
          ch[1]='m';
          ch[2]='D';
          ch[3]='E';
          ch[4]='k';
       //char ch[]={'A','D','E','k','m'};
        for(char w:ch){
            if(w>='A'&& w<='Z'){
                System.out.print(w+" ");
            }
        }
        String str[]=new String[3];
        str[0]="java";
        str[1]="did";
        str[2]="suprısed you";
        System.out.println(Arrays.toString(str));

     //Soru3: String bir array olusturunuz."tom"ve "tom"dan onceki tum elemanları ekrana yazdırınız.
        //String arr[]=new String[6];
        String arr[]={"Jane","Mark","Christoper","Tom","Ali","Rojda"};
        for(String w:arr){
            System.out.print(w+" ");
            if(w.equals("Tom")){
                break;
            }
        }
        System.out.println();
     //Soru4:String bir array olusturunuz."Tom"ve "Jane"haric tum elemanları ekrana yazdırınız.
        String arr1[]=new String[6];
        arr1[0]="Jane";
        arr1[1]="Mark";
        arr1[2]="Christoper";
        arr1[3]="Tom";
        arr1[4]="Ali";
        arr1[5]="Rojda";
        for(String w:arr1){
            if(w.equals("Tom") || w.equals("Jane")){
                continue;
            }System.out.println(w+" ");
        }
        System.out.println();
        //soru5:Kullanıcı ile beraber bir array olusturunuz ve icine data ekleyiniz.
        Scanner input=new Scanner(System.in);
        System.out.println("kac ogrenci gireceksiniz");
        int ogrenci=input.nextInt();
        System.out.println("islemi bitirmek icin 'Q'harfine basınız. ");
        String student[]=new String[ogrenci];

      for(int i=1; i<=ogrenci  ;i++  ){
          System.out.println("Lutfen" + i + ". ogrenci ismi giriniz.");
          String names = input.nextLine();

           if(names.equalsIgnoreCase("Q")) {
              break;
          }

           student[i-1]=names;
      }
        System.out.println(Arrays.toString(student));


    }
}
