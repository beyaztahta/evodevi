package forloops_01;

public class DoWhileLoop01 {
    public static void main(String[] args) {
     //Soru 1: Bir ondalık sayının ondalık kısmındaki rakamlarının toplamını bulunuz.
        double num=24.5673;
        System.out.println(num);

        String str=String.valueOf(num);
        System.out.println(str);

        String ondalık=str.split("\\.")[1];
        System.out.println(ondalık);

        int ondalı=Integer.valueOf(ondalık);
        System.out.println(ondalı);

        int sum=0;
        do{
            sum=sum+ondalı%10;

         ondalı=ondalı/10;

        }while(ondalı>0);
            System.out.println(sum);

        //Soru 2: Bir ondalık sayının ondalık kısmındaki rakamlarının toplamını bulunuz.
//        double num=0.45;
//        System.out.println(num);
//
//        String str=String.valueOf(num);
//        System.out.println(str);
//
//        String onda=str.split("\\.")[1];
//        System.out.println(onda);
//
//        int sayı=Integer.valueOf(onda);
//        System.out.println(sayı);
//
//         int sum=0;
//         do{
//             sum=sum+sayı%10;
//
//         sayı=sayı/10;
//         }while(sayı>0);
//        System.out.println(sum);





























    }
}
