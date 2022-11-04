package forloops_01;

import java.util.Scanner;

public class DoWhileLoop_1 {
    public static void main(String[] args) {
        //Soru1: 9 dan 90 a kadar olan 7 ile tam bolunen sayıları ekrana yazdıran kodu yazdırınız.
//        int i=9;
//        do{
//            if(i%7==0){
//                System.out.print(i+" ");
//            }
//
//            i++;
//        }while(i<91);
//
//        System.out.println();
        //Soru2:m harfinden baslayarak c harfine kadar olan harfleri ekrana yazdıran kodu yazınız.
//        char a='m';
//        do{
//            System.out.print(a+"-");
//            a--;
//        }while(a>='c');
//
//        System.out.println();
        //Soru3:Kullanıcıdan toplamak için pozitif sayılar isteyin,islemi bitirmek icin 0 a basmasını soyleyın.Kullanıcı 0
        // bastıgında kac sayı girdigini ve girdigi pozitif sayıların toplamını yazdıran kodu yazınız.
        Scanner input=new Scanner(System.in);
//        System.out.println("İslemi bitirmek istediginizde 0 (sıfır) a basınız");
//        int sum=0;
//        int sayac=0;
//        do{
//            System.out.println("Pozitif bir sayı giriniz.");
//            int sayı= input.nextInt();
//            sum=sum+sayı;
//            sayac++;
//            if(sayı==0){
//                break;
//            }
//        }while(sum>0);
//        System.out.println("toplam girdiniz sayı adedi="+sayac);
//        System.out.println(sum);

        System.out.println();
   /*Soru4:Kullanıcıdan toplamak için pozitif sayılar isteyin,islemi bitirmek icin 0 a basmasını soyleyın.
           Kullanıcı yanlıskılka negetif sayı girerse dikkate almayın."Negatif sayı giremezsiniz"deyip basa dondurun.
           Kullanıcı 0 bastıgında kac sayı girdigini ,yanlıslıkla kac negatif sayı girdigini ve girdigi pozitif sayıların
           toplamını yazdıran kodu yazınız.
    */

//        System.out.println("İslemi bitirmek istediginizde 0 (sıfır) a basınız");
//        int sum=0;
//        int sayac=0;
//
//        do{
//           System.out.println("Lutfen sayı giriniz.");
//            int sayı=input.nextInt();
//           sum=sum+sayı;
//           sayac++;
//           if(sayı==0){
//               break;
//           }else if(sayı<0) {
//               System.out.print("Negatif sayı giremezsiniz"+" ");
//                 }
//        }while(sum>0);
//
//        System.out.println("toplam="+sum);
//        System.out.println("toplam girdiginiz pozitif sayı adedi:"+sayac);

     /*
     Kullanıcıdan toplanmak uzere sayılar ısteyın.Sayı adedi 10 u gecerse ya da toplamı 500 gecerse
     "Bu kadar sayı yeter.....adet sayı girdiniz.toplamı......"yazdırın.
      */
//        int sum=0;
//        int sayac=0;
//        do{
//            System.out.println("Lutfen bir sayı giriniz.");
//            int sayı= input.nextInt();
//            sum+=sayı;
//            sayac++;
//           if(sum>500) {
//               System.out.println( "Bu kadar sayı yeter" + sayac + "adet sayı girdiniz.Toplamı =" +sum);
//           }
//        }while(sayac<10&&sum<500);
//        System.out.println();
     /*Kullanıcıdan bir sifre girmesini isteyin.Asagıdaki sartalara gore sifreyi yazdırın.Kontrol edin ve sifredeki hataları
      yazdırın.Kullanıcı bu ıslemi sifreyi dogru girinciye kadar tekrarlayın.Gecerli bir sifre girdiginizde "Sifreniz basarıyla
      kaydedilmistir."Sartlar:
      Sifre kucuk harfle baslamalıdır.
      sifre buyuk harf icermelidir.
      sifre ozel karakter icermelidir.
      sifre en az 8 karakter olmalıdır.
      */
            System.out.println("lütfen sifre giriniz.");
            String pwd= input.nextLine();

            do {
                boolean ilk = pwd.charAt(0) >= 'a' && pwd.charAt(0) <= 'z';
                boolean buyuk = pwd.replaceAll("[a-z0-9 ]", "")
                        .replaceAll("\\p{Punct}","").length() > 0;
                boolean ozel = pwd.replaceAll("[a-zA-Z0-9 ]", "").length() > 0;
                boolean sayı = pwd.length() > 7;
                boolean gecerli = ilk && buyuk && ozel && sayı;
                if (gecerli) {
                    System.out.println("Sifreniz basarıyla kaydedilmistir");
                    break;
                }if(!ilk){
                    System.out.println("Girdiginiz sifre kucuk harfle baslamiyor. Sifre kucuk harfle baslamalidir. ");
                }if(!buyuk){
                    System.out.println("Girdiginiz sifre de hic buyuk harf yok. Sifre en az bir tane buyuk harf icermelidir. ");
                }if(!ozel){
                    System.out.println("Girdiginiz sifre de hic ozel karakter yok.Lutfen en az 1 tane ozel karakter kullaniniz");
                }if(!sayı){
                    System.out.println("Girdiginiz sifre 8 den az karakter iceriyor.Sifre en az sekiz karakterden olusmalidir");
                }
                System.out.println("Lutfen tekrar deneyiniz. Yen sifre de yukaridaki hatalari giderdiginizden emin olunuz");
              pwd= input.nextLine();
            }while(true) ;
               System.out.println();



















    }
}
