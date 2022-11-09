package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysQ2UzunKelime {

    /*
          Kullanıcıdan alınan cümledeki en uzun kelimeyi(kelimeleri) return eden bir method oluşturunuz.
         */
    public static void main(String[] args) {
        System.out.println(enUzunKelimeler());
    }

    public static List<String>enUzunKelimeler() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle giriniz.");
        String cumle = input.nextLine();

        String str[] = cumle.split(" ");
        int max = 0;
        for (String w : str) {
            if (w.length() > max) {
                max = w.length();
            }
        }

        List<String>enUzunKelimelr=new ArrayList<>();
        for(String w:str){
            if(w.length()==max){
                enUzunKelimelr.add(w);
            }
        }

        return enUzunKelimelr;
    }

}
