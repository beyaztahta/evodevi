package abstraction;

public class Honda extends Car{

    String make="Honda";
    String model="Accord";
    int year =2021;


    @Override
    public void make() {
        System.out.println("arabanın make:"+ make);
    }

    @Override
    public void model() {
        System.out.println("honda model:"+ model);
    }

    @Override
    public void year() {
        System.out.println("honda year:"+ year);
    }
}
