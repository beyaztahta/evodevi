package override;

public class Runner  {
    public static void main(String[] args) {
       Corolla car1=new Corolla();
       car1.Speed();
       car1.motor();
       System.out.println(car1.multiply(3, 5));
       Araba car2=new Araba();
       car2.yakitTuketimi();


    }
}
