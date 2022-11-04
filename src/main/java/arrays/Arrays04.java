package arrays;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //Soru1:Elemanları "Ayse","Fatma","Ali","Veli" olan bir Array olusturunuz ve yazdırınız.
        String isim[]=new String[4];
       // String isim[]={"Ali","Veli","Ayse","Fatma"};
        isim[0]="Ayse";
        isim[1]="Fatma";
        isim[2]="Ali";
        isim[3]="Veli";
        System.out.println(Arrays.toString(isim));

        int sum=0;
        for(String w:isim){
            sum=sum+w.length();
        }
        System.out.println(sum);

    //Soru2:"Ali"yerine "Can","Ayse"terine "Gul"atayın.
        isim[2]="Can";
        isim[0]="Gul";
        System.out.println(Arrays.toString(isim));
    //Soru3:Verilen 3 elemanlı bir arrayin tum elemanlarını bir soldaki konuma tasıyacak bir program yazın.
        //[1,2,3]==>[3,2,1]

        int sayı[]={1,2,3};
        int yeni[]=new int[sayı.length];

        int idx=0;
        for(int i=sayı.length-1; i>=0; i--){
          yeni[idx]=sayı[i];
          idx++;
        } System.out.println(Arrays.toString(yeni));

    //Soru4:Verilen 5 elemanlı bir arrayin tum elemanlarını bir soldaki konuma tasıyacak bir program yazın.
      // 1,5,6,3,9==>9,3,6,5,1
        int arr[]={1,5,6,3,9};
        int brr[]=new int[arr.length];
         int s=0;
         for(int k=arr.length-1; k>=0 ; k--){
             brr[s]=arr[k];
             s++;
         }
        System.out.println(Arrays.toString(brr));

  //Soru5:Verilen bir Array in tum elemanlarını toplayan kodu yazınız.
        int nums[]={2,65,3,4,};
        int t=0;
        for(int w:nums){
            t=t+w;
        }
        System.out.println(t);















    }
}
