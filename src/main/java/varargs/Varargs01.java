package varargs;

public class Varargs01 {
    public static void main(String[] args) {
//        int r1=add(2,3);
//        int r2=add(2,3,4);
//        int r3=add(2,3,4,5,6,7,8,9);

        //Verilen sayilardan ilki haric tum sayilari toplayip ilk sayiyla carpan bir method olusturunuz
        int sayi1=5;
        int sayi2=7;
        int sayi3=2;
        int sayi4=4;
        int sayi5=9;
        toplam(sayi1,sayi2,sayi3,sayi4,sayi5);
    }
//    public static int add(int... a) {
//        int sum = 0;
//        for (int w : a) {
//            sum += w;
//        }
//        System.out.println(sum);
//        return sum;
//    }

    public static int toplam(int sayı1,int  ...a){
        int t=0;
        for(int w:a){
            t+=w;
        }
        int sayi1=5;
        System.out.println("toplam = " + t);

        System.out.println("toplam ile ilk sayının carpımı = "+(t*sayi1));
       return t;
    }

}
