package constructorrr;

public class Constructor1 {
     int x=3;
     int y=5;

     public Constructor1(){
         x+=1;
         System.out.println("-x"+x);
     }
    public Constructor1(int i){
         this();
         this.y=i;
         x+=y;
        System.out.println("-x"+x);
    }
    public Constructor1(int i,int i2){
         this(3);
         this.x-=4;
        System.out.println("-x"+x);
    }

    public static void main(String[] args) {
        Constructor1 cts=new Constructor1(4,3);
    }
}
