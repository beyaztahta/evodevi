package arrays;

import java.util.Arrays;

public class ArraysNegatif06 {
    public static void main(String[] args) {
        /*
      Array olarak verilen bir cümleyi String olarak negatif anlamıyla yazdıran bir kod yazınız.
      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
      Output:
      String output ="JavaIsNOTDifficult";
       */
        String arr[]={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};

        System.out.println(Arrays.toString(arr));

        StringBuilder str= new StringBuilder();
        for(String w: arr){
            str.append(w);
        }
        System.out.println(str);
        String negatif=str.toString().replace("Is","IsNOT");

        System.out.println(negatif);






























    }
}
