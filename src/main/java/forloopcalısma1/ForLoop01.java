package forloopcalısma1;

public class ForLoop01 {
    public static void main(String[] args) {

        //120 den 10 a kadar olan ve 4 ile bolunebilen sayıları yazınız.
        int toplam=0;
        for(int i=120; i>9; i-- ){
            if(i%4==0){
               toplam=toplam+i;

                System.out.print(i+" ");// 4 e bolunenler
            }

        }
        System.out.println(toplam);

      //while
        int i=120;
        int sum=0;
        while(i>9){
         if(i%4==0){
             sum+=i;
             System.out.print(i+" ");
         }
          i--;
        }
        System.out.println(sum);

     //do while

        int k=120;
        int t=0;
        do{
            if(k%4==0){
               t+=k;
                System.out.print(k+" ");
            }

         k--;
        }while(k>9);
        System.out.println(t);








    }
}
