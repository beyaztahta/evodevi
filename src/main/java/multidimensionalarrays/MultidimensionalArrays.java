package multidimensionalarrays;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
    //Multidimensional Arrays , arrayin icinde de array vardır
        /*Soru1:String bir Multidimensional Arrays olusturunuz.
        Elemanları ekleyiniz.
        Toplam eleman sayısını yazdıran kodu yazdırınız.
        */
        //String str[][]=new String[4][3];

        String str[][]={{"a","b","c"},{"d","e","f"},{"g","h","ı"},{"j","k","l"}};
        str[0][0]="a";
        str[0][1]="b";
        str[0][2]="c";

        str[1][0]="d";
        str[1][1]="e";
        str[1][2]="f";

        str[2][0]="g";
        str[2][1]="h";
        str[2][2]="ı";

        str[3][0]="j";
        str[3][1]="k";
        str[3][2]="l";
        System.out.println(Arrays.deepToString(str));
        int sum=0;
        for(String[] w:str){
            sum=sum+w.length;
        }
        System.out.println(sum);

  //Soru2:Bir String MUltidimensionalArrays de icinde "a" olan elemaları ekrana yazdıran kodu yazınız.
        String arr[][]={{"learn","java","it"},{"easy","is"}};
         for(String[] w:arr){
             for(String k:w){
                 if(k.contains("e")){
                     System.out.print(k+" ");
                 }
             }
         }
        System.out.println();
  //Soru3:Bir tane ınteger MultidimensionalArrays olusturunuz.Bu Array deki tum sayıların toplamını veren kodu yazınız.
      int nums[][]={{2,5,1},{32,75},{13,21,43,56}};
        System.out.println(Arrays.deepToString(nums));
        int toplam=0;
        for(int[] w:nums){
            for(int k:w){
                toplam=toplam+k;
            }
        }
        System.out.println(toplam);
 //Soru4:Bir MultidimensionalArray i normal Array e ceviren kodu yazınız.
        int x[][]={{2,5,1},{32,75}};
        int t=0;
        for(int[] w:x){
            t=t+w.length;
        }
        System.out.println(t);

        int y[]=new int[t];
        int idx=0;
        for(int[] w:x){
            for(int k:w){
                y[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(y));

//Soru5:Bir MultidimensionalArray deki en buyuk ve enkucuk elemanı toplayan kodu yazınız.
        int sayı[][]={{2,5,1},{83,75}};
        int buyuk=sayı[0][0];
        int kucuk=sayı[0][0];

        int s=0;
        for(int[] w:sayı){
            for(int k:w){
             buyuk=Math.max(buyuk,k) ;
             kucuk=Math.min(kucuk,k);
             s=s+k;
            }
        }
        System.out.println("buyuk="+ buyuk);
        System.out.println("kucuk="+ kucuk);
        System.out.println(buyuk+kucuk);

    }
}
