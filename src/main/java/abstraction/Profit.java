package abstraction;

public class Profit extends Calculator{


    @Override
    public int add(int a, int b) {
        return -1;
    }

    @Override
    public int subtract(int a, int b) {
        return -1; //ne olursa olsun -1 dondurur.
    }

    @Override
    public int product(int a, int b) {
        return a*b;
    }

    @Override
    public int divide(int a, int b) {
        return a/b;
    }
}
