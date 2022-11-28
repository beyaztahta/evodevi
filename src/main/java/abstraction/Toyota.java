package abstraction;

public class Toyota extends Car{

    String make="Toyota";
    String model="Camry";
    int year =2022;

    @Override
    public void make() {
        System.out.println("arabanın make:"+ make);
    }

    @Override
    public void model() {
        System.out.println("arabanın model:"+ model);
    }

    @Override
    public void year() {
        System.out.println("arabanın year:"+ year);
    }
}
