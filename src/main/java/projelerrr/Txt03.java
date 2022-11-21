package projelerrr;

import java.util.Arrays;

public class Txt03 {

    /*
      Verilen bir String'deki harfleri ve harflerin kacar kez kullanildigini return eden bir method yaziniz
      Ornek : Input : Zeynep Hoca bir tane   output : { =3, a=3, b=1, r=1, C=1, c=1, t=1, e=1, H=1, i=1, n=2, o=1}

     */
    public static void main(String[] args) {
        String input="Zeynep Hoca bir tane";

        String arr[]=input.split("");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int counter=0;
        for(int i=1; i<arr.length;i++){
            if(arr[i-1].equals(arr[i])){
                counter++;
            }else {
                System.out.println(arr[i-1]+" "  +"karakter sayısı " + (counter+1));
                counter=0;
            }
            if(i==arr.length-1){
                System.out.println(arr[i]+" "  +"karakter sayısı "+ (counter+1));
            }
        }






    }

}
