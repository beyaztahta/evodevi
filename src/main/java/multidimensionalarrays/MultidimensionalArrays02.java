package multidimensionalarrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MultidimensionalArrays02 {
    public static void main(String[] args) {

        //Soru1:Asagıdaki multidimensional arraylerin ic arraylerindeki tum elemanların toplamını birer birer bulan
        // ve her bir sonucu yeni arrayin icine yazdıran ve elemanı yapan , yeni arrayi ekrana yazdıran kodu yazınız.

        int arr[][]={{1,2,3},{4,5},{6,7}};
        int yeni[]=new int[arr.length];
        int sum=0;
//        int index=0;
//
//        for(int i=0; i< arr.length;i++){
//            int arr1[]=arr[i];
//            for (int w:arr1){
//                sum+=w;
//
//            }
//            yeni[index]=sum;
//            index++;
//            sum=0;
//        }
//        System.out.println(Arrays.toString(yeni));


        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum+=arr[i][j];
            }
            yeni[i]=sum;
            sum=0;
        } System.out.println(Arrays.toString(yeni));


        //Soru2:Kullanıcıdan bir cumle isteyin ve cumledeki kelimeleri saydıran bir kod yazınız.

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir cumle giriniz.");
        String cumle=input.nextLine().toLowerCase();

        String str[]=cumle.split(" ");
        System.out.println(Arrays.toString(str));

        Arrays.sort(str,Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(str));

      int t=0;

      for(int i=0; i<str.length ; i++){
          t=t+i;
      }
        System.out.println("Girdiginiz cumledeki kelime sayısı = " + t);

//Soru3:Verilen bir arrayden istenen degere esit olan elemanları kaldırıp ,kalanları yeni bir  array olarak yazdıran kodu yazınız.

      int x[][]={{2,5,1},{32,5},{12,6,9},{5,5,5}};
      int istenen=5;
      int eleman=0;

      for(int[] w:x){
           for(int i=0; i<w.length; i++){
               if(w[i]!=istenen){
                   eleman++;
               }
           }
       }
        int idx=0;
        int[] y=new int[eleman];
       for(int[] w:x){
           for(int i=0;i<w.length; i++){
               if(w[i]!=istenen){
                   y[idx]=w[i];
                   idx++;
               }
           }
       }
        System.out.println(Arrays.toString(y));






























    }
}
