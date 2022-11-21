package methodoverloading;

public class Overloading01 {

    public int sum(int x,int y){
        return(x+y);
    }
    public final int sum(int x,int y,int z){
        return(x+y+z);
    }
    public double sum(double x,double y){
        return(x+y);
    }


  //Overlodading methodlar final keywordunu kabul eder.Bir methodtan farklı methodlar olusturabiliriz.

    public static void main(String[] args) {

        Overloading01 obj=new Overloading01();
        System.out.println(obj.sum(4,6));
        System.out.println(obj.sum(4,6,5));
    }
}
