package arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int stdAges[]=new int[7];
        stdAges[0]=12;
        stdAges[1]=11;
        stdAges[2]=10;
        stdAges[3]=13;
        stdAges[4]=14;
        stdAges[5]=12;
        stdAges[6]=12;
        System.out.println(Arrays.toString(stdAges));

        //SORU 1:en kucuk ve en buyuk elemanı yazdırınız.
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));
        int ilk=stdAges[0];
        int son= stdAges[stdAges.length-1];
        System.out.println(ilk+son);

        //SORU 2:stdSges Arrays i icindeki tum elemanların toplamını ekrana yazdıran kodu yazınız.
        //I.YOL
        int sum=0;
        for(int i=0; i<stdAges.length ; i++){
            sum=sum+stdAges[i];
        }
        System.out.println(sum);
       //II.YOL
        int top=0;
        int k=0;
        while(k<stdAges.length){
            top=top+stdAges[k];

            k++;
        }
        System.out.println(top);

      //III.YOL
        int tp=0;
        int t=0;
        do{
            tp=tp+stdAges[t];

          t++;
        }while(t<stdAges.length);
        System.out.println(tp);
    //IV.YOL
        int a=0;
        for(int w:stdAges){
            a=a+w;
        }
        System.out.println(a);

    }
}
