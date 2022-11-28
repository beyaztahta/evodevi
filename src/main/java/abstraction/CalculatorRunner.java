package abstraction;

public class CalculatorRunner {
    public static void main(String[] args) {

        Profit obje=new Profit();
        System.out.println(obje.divide(10, 5));

        System.out.println(obje.product(10, 5));

        Loss loss=new Loss();
        System.out.println(loss.add(5, 10));
        System.out.println(loss.subtract(10, 5));

    }
}
