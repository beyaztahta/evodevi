package methodoverloading;

public class Overloading {
    public static void main(String[] args) {
       add(5,3);
       add(5,3,6);
       add(5,1.2);

    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }

    public static void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void add(int a,double b){
        System.out.println(a + b);
    }
}
