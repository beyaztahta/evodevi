package multidimensionalarrays;

public class MultiDimensionalArrays01 {
    public static void main(String[] args) {
        //Soru1:Asagıdaki multidimensional arrayin tum elemanlarının carpımını ekrana yazdıran kodu yazınız.
        //{{1,2,3},{4,5,6}}

        int nums[][]={{1,2,3},{4,5,6}};

        int carpım=1;
        for(int[] w:nums){
            for(int k:w){
                carpım=carpım*k;
            }
        }
        System.out.println(carpım);

        //Soru 2:Asagıdaki multidimensional arrayin iç arraylarındeki son elemnların carpımını ekrana yazdıran kodu yazınız.

        int arr[][]={{1,2,3},{4,5},{6}};

         int sonuc=0;

         for(int[] w: arr){

              sonuc= arr[0][2]*arr[1][1]*arr[2][0] ;

         }
        System.out.println(sonuc);

 //Soru3:Asagıdaki multidimensional arraylerin ic arraylerinde ayni indekse sahip olanların toplamını ekrana yazdıran kodu yazn.

          int arr1[][]={{1,2},{3,4,5},{6}};
          int arr2[][]={{7,8,9},{10,11},{12}};

           int sınır=0;
           int sum=0;
           if(arr1.length<=arr2.length) {
               for (int i = 0; i < arr1.length; i++) {
                   sınır = arr1[i].length;
                   if (arr1[i].length > arr2[i].length) {
                       sınır = arr2[i].length;
                   }
                   for (int k = 0; k < sınır; k++) {
                       sum = arr1[i][k] + arr2[i][k];
                       System.out.println(i + "," + k + "indeksdeki elemanların toplamı = " + sum);
                   }
               }
           }else {
               for (int i = 0; i < arr2.length; i++) {
                   sınır = arr1[i].length;
                   if (arr1[i].length > arr2[i].length) {
                       sınır = arr2[i].length;
                   }

                   for (int k = 0; k < sınır; k++) {
                       sum = arr1[i][k] + arr2[i][k];
                       System.out.println(i + "," + k + "indeksdeki elemanların toplamı = " + sum);
                   }

               }


           }
    }
}
