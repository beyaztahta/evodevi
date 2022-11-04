package constructorrr;

public class MyConstructor {

    public static void main(String[] args) {

        MyConstructor my = new MyConstructor();

        MyConstructor my1 = new MyConstructor(4);

    }
    int x=5;
    public MyConstructor() {
        System.out.println("-x"+ x);
        }

    public MyConstructor(int x){
          this();
       System.out.println("-x"+ x);
        }

















}
