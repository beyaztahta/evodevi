package lambdaday01;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Instream02 {
    public static void main(String[] args) {
        sekizeBolunenSayılarınToplamı(325, 468);


    }
    // S7:325 ile 468 arasinda 8 e bolunen sayilarin toplamini bulalim

    public static void sekizeBolunenSayılarınToplamı(int a, int b) {
        System.out.println(IntStream.
                rangeClosed(a, b).
                filter(t -> t % 8 == 0).sum());

    }

    // S8: 7 ile 15 (dahil) arasindaki tek sayilarin carpimini bulalim
    public static OptionalInt carpım(double m, double n){
        return IntStream.rangeClosed((int) m, (int) n).filter(t-> t%2!=0).reduce(Math::multiplyExact);
    }//reduce(1,(m,n)->m*n)

    //S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yaziralim
    public static void yedininKatlari(int a){
        IntStream.iterate(21,t->t+7).
                filter(t-> t%2!=0).limit(10).
                forEach(Utils::printSameLine);
    }


    //S11: 21 den baslayan 7 nin katlarinin ilk 20 teriminin toplayalim

    public static void yedininKatlariIlkYirmi(int a){
        System.out.println(IntStream.iterate(21, t -> t + 7).
                filter(t -> t % 2 != 0).limit(20).sum());

    }


}
