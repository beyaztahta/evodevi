package forloops_01;

import java.util.Scanner;

public class WhileLoop_2 {
    public static void main(String[] args) {
        //Soru1:Kullanıcıdan bir rakam alın ve bu rakamı carpım tablosu yazdıran kodu ekrana yazdırın.
        //carpım tablosu yan yana yazırılacak.

        Scanner input=new Scanner(System.in);
//        System.out.println("carpım tablosu icin bir rakam giriniz. ");
//        int sayı=input.nextInt();
//         int i=1;
//         while(i<11){
//             System.out.print(sayı+"x"+i+"="+(sayı*i)+" ");
//             i++;
//         }

     //Soru2:Kullanıcıdan bir tam sayı alın.bu sayıyı tam bolen sayıları ve toplam kac tane olduklarını ekrana yazdırın.
        System.out.println("lutfen pozitif bir sayı giriniz.");
        int sayı=input.nextInt();

        int i=1;
        int sayac=0;
        while(i<=sayı){
            if(sayı%i==0 ) {
                System.out.print(i + "- ");
                sayac++;
            }
            i++;
        }System.out.println("toplam bolen sayısı="+sayac);
        System.out.println();
        //Soru3:Kullanıcıdan bir sayı alın ve rakamları toplamını bulan kodu yazınız.
        System.out.println("bir sayı giriniz.");
        int num=input.nextInt();
//        int s=0;
//        while(num>0){
//            s=s+num%10;
//            num=num/10;
//        }
//        System.out.println(s);

        int s=0;
        do{
            s=s+num%10;
            num=num/10;

        }while(num>0);
        System.out.println(s);






    }
}
