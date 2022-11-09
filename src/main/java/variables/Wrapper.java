package variables;

public class Wrapper {
    public static void main(String[] args) {

        //1) Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını
    //    bulmak için bir kod yazınız.

        byte min=Byte.MIN_VALUE;
        short max=Short.MAX_VALUE;
        System.out.println(min+max);

       // 2) Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
       // yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
      //  değişken arasındaki farkı yazdırınız.

        String str="103";
        byte sayı1=Byte.valueOf(str);
        String str1="2351";
        short sayı2=Short.valueOf(str1);
        System.out.println(sayı2-sayı1);



    }
}
