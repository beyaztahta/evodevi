package enum01;

import java.util.Arrays;
import java.util.Comparator;

public enum Country {

     /*

                baskent     nufus         gini      kisibasimg(bin)     mg(milyar +)

 Belçika	Brüksel        11.500.000   27.4          50.000           579
 Brezilya	brasilia      213.000.000   53.9            7000           1823
 Çin         pekin  	1.400.000.000   38.5          20.000           29000
 Danimarka	kopenhag        6.000.000   0.280         61000           392
 Mısır     	kahire          104000000   0.310         13000           1346
 Finlandiya	helsinki          5000000   0.270         54000           300
 Almanya 	berlin           83000000   0.310         51000           4300
 Yunanistan	atina            10000000   0.340         19000           200
 Japonya	tokyo           125000000   0.320         42000           5380
 Norveç	    oslo              5000000   0.270         81000           444
 Slovenya	Ljubljana         2000000   0.240         28000           59
 İsveç	    stockholm        10000000   0.280         58000           589
 Türkiye	ankara           85000000   0.410         10000           853
 ABD		Washington      333000000   0.410         76000           26000
     */

    BELCIKA("Bruksel", 11500000, 0.270, 50000, 579),
    BREZILYA("Brasillia", 213000000, 0.530, 7000, 579),
    CIN("Pekin", 1400000000, 0.380, 20000, 29000),
    DANIMARKA("Kopenhag", 6000000, 0.280, 61000, 392),
    MISIR("Kahire", 104000000, 0.310, 13000, 1346),
    FINLANDIYA("Helsinki", 5000000, 0.270, 54000, 300),
    ALMANYA("Berlin", 83000000, 0.310, 51000, 4300),
    YUNANISTAN("Atina", 10000000, 0.340, 19000, 200),
    JAPONYA("Tokyo", 125000000, 0.320, 42000, 5380),
    NORVEC("Oslo", 5000000, 0.270, 81000, 444),
    SLOVENYA("Ljubljana", 2000000, 0.240, 28000, 59),
    ISVEC("Stockholm", 10000000, 0.280, 58000, 589),
    TURKIYE("Ankara", 85000000, 0.410, 10000, 853),
    ABD("Washington",333000000, 0.410, 76000, 26000);

    private final String capital;
    private final int population;
    private final double gini;
    private final int gdpPerson;
    private final int gdpTotal;

    Country(String capital, int population, double gini, int gdpPerson, int gdpTotal) {
        this.capital = capital;
        this.population = population;
        this.gini = gini;
        this.gdpPerson = gdpPerson;
        this.gdpTotal = gdpTotal;
    }

    public String getCapital() {
        return capital;
    }

    public int getPopulation() {
        return population;
    }

    public double getGini() {
        return gini;
    }

    public int getGdpPerson() {
        return gdpPerson;
    }

    public int getGdpTotal() {
        return gdpTotal;
    }


    //1- Gini kat sayısına kucukten buyuge gore sıralayın

    public static void gini(){
        Arrays.stream(values())
                .sorted(Comparator.comparing(Country::getGini)).
                map(t-> t.getCapital()).
                forEach(t-> System.out.print(t+" "));
    }

    //2- Milli gelirleri buyukten kucuge dogru sıralayınız.
    public static void miiliGelir(){
        Arrays.stream(values()).
                sorted(Comparator.comparing(Country::getGdpTotal).reversed()).
                forEach(t-> System.out.println(t+" "));

    }
    //3-gdptotali 800 un ustunde olan ulkelerden en yuksek gınıkatsayısı olan ulkeyı yazdırın.
    public static void gdpTotal800UstuneOlanGiniKatSayısı(){
        System.out.println(Arrays.stream(values()).
                filter(Country -> Country.gdpTotal > 800).
                sorted(Comparator.comparing(Country::getGini).reversed()).
                findFirst());
    }








}
