public class TypeCasting {
    public static void main(String[] args) {

        //1) Short data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz

          short age=12;
          int newAge=age;//autowiddening

        //2) Long data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.

         long nufus=15L;
         int newNufus=(int) nufus;//explicitnarrowing


       // 3) Double data tipinde bir değişken oluşturunuz ve onu bir float değişkenine dönüştürünüz.

        double d=12.99;
        float newD=(float)d;

        //4) Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
        //Sonrasında bu short değişkenin değerini konsolda yazdırınız.
        //Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır

        double dd=15.99;
        short newDd=(short)dd;
        System.out.println(newDd);

        //5) Byte data tipinde bir değişken oluşturunuz ve onu bir double değişkenine dönüştürünüz.
        //Sonrasında bu double değişkenin değerini konsolda yazdırınız.
        //Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.

        byte bit=12;
        double newBit=bit;
        System.out.println(newBit);


    }
}
