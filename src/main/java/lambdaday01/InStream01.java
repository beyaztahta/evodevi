package lambdaday01;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class InStream01 {
    public static void main(String[] args) {

        //Instream for loop ile yaptıklarımızı yapıyoruz.

        // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1 2 3 .... seklinde siralayalim
        for (int i = 1; i < 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        ilkOtuzToplamı(30);
        System.out.println();
        ilkYuz(100);
        System.out.println();
        System.out.println(topla(20, 30));
        System.out.println();
        System.out.println(avg(30, 40));
        System.out.println(sekizeBolunenSayıSayısı(325, 468));
        sekizeBolunenSayılar(325, 468);
    }

    public static void ilkOtuzToplamı(int a) {
        IntStream.range(1, a).forEach(Lambda01::print);

    }

    //S2:  20 den 100 kadar olan sayilari (100 dahil ) 1 2 3 .... seklinde siralayalim (for loopsuz)
    public static void ilkYuz(int a) {
        IntStream.rangeClosed(20, a).forEach(Lambda01::print);
    }

    //S3:Istenen iki deger(dahil) arasindaki sayilari toplayalim:20---30

    public static int topla(int x, int y) {
        return IntStream.rangeClosed(x, y).sum();
    }

    //S4: 30 ile 40 arasindaki sayilarin (dahil) ortalamasini bulalim

    public static OptionalDouble avg(double x, double y) {
        return IntStream.rangeClosed((int) x, (int) y).average();
    }

    //S5: 325 ile 468 arasinda 8 e bolunen kac sayi vardir?

    public static int sekizeBolunenSayıSayısı(int a, int b) {
        return (int) IntStream.
                rangeClosed(a, b).
                filter(t -> t % 8 == 0).
                count();
    }
    //count yerine foreacch kullanırsak  sayıları gormus oluruz.

    public static void sekizeBolunenSayılar(int a, int b) {
        IntStream.
                rangeClosed(a, b).
                filter(t -> t % 8 == 0).
                forEach(Lambda01::print);//count yerine foreacch kullanırsak  sayıları gormus oluruz.

    }








}
