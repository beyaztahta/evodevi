package datacastingodevi;

public class Scanner01 {
    public static void main(String[] args) {
        //Example 7: Kullanıcıdan ıkı tam sayı alıp bu sayıların toplam ,fark ve carpımlarını yazdırın.
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("İlk sayıyı giriniz.");
        int sayı1 = input.nextInt();
        System.out.println("ıkıncı sayıyı giriniz.");
        int sayı2 = input.nextInt();
        System.out.println(sayı1+sayı2);
        System.out.println(sayı1-sayı2);
        System.out.println(sayı1*sayı2);

        //Example 8:Kullanıcıdan karenın bır kenar uzunlugunu alın ve karenin cevresini ve alanını heasaplayın ve yazdırın
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Karenin bir kenar uzunlugunu giriniz.");
        int uzunluk = scan.nextInt();
        System.out.println(uzunluk*4);
        System.out.println(uzunluk*uzunluk);

        //Example 9:Kullanıcıdan yarıcap isteyip cemberin cevresini ve dairenin alanını yazdırın.
        java.util.Scanner cember = new java.util.Scanner(System.in);
        System.out.println("Yarıcapı giriniz");
        double a = cember.nextDouble();
        System.out.println( 2*3.14*'r');
        double b = cember.nextDouble();
        System.out.println(3.14*'r'*'r');

        //Example 10 :Kullanıcıdan dikdortgenler prizmasının uzun kenar,kısa kenar ve yukseklıgını ısteyıp,
        // prızmanın hacmini hesaplayıp yazdırın
        java.util.Scanner dıkdortgen = new java.util.Scanner(System.in);
        System.out.println("Prizmanın uzun kenarını giriniz");
        int uzunKenar = dıkdortgen.nextInt();
        System.out.println("Prizmanın kısa kenarını giriniz");
        int kısaKenar = dıkdortgen.nextInt();
        System.out.println("Prizmanın yuksekligini giriniz");
        int yukseklik = dıkdortgen.nextInt();
        System.out.println(uzunKenar*kısaKenar*yukseklik);

         /* Example 11:Kullanıcıdan ismini ve soyismini isteyip asagıdaki gibi yazdırın
          Ismınız:Mehmet
          Soyisminiz:Bulut
          KUrsumuza katılımınız alınmıştır ,tesekkur ederız.
         */
        java.util.Scanner name =new java.util.Scanner(System.in);
        System.out.println("isminizi yazınız");
        String ısım = name.next();
        System.out.println("ısminiz:"+ısım);
        System.out.println("soyadınızı yazınız");
        String soyAd =name.next();
        System.out.println("soyisminiz:"+soyAd);
        System.out.println("kursumuza katılımınız alınmıstır,tesekkur ederız.");


        //Example 12:Kullanıcıdan ısmını ve soy ısmını alıp aralarında bosluk olusturarak asagıdakı sekılde yazdırın.
        //     ısım-soyısım : Mehmet Bulutluoz

        java.util.Scanner ad = new java.util.Scanner(System.in);
        System.out.println("adınızı yazınız.");
        String adı = ad.next();
        System.out.println("soyadınızı yazınız.");
        String soyadı =ad.next();

        System.out.println(adı+" "+soyadı);

    }
}
