package datacastingodevi;

public class TypeCasting {
    public static void main(String[] args) {
        //soru 1: int iki sayıyı birbirine boldurun ve sonucu yazdırın.
       int a=145, b=5;
       int bolum=a/b;
        System.out.println("a/b:"+a/b);

        //soru 2: int bir sayıyı double bir sayıya boldurun ve sonucu yazdırın.
        int x=250;
        double y=0.05;
        System.out.println("x/y:"+x/y);

        //soru 3:bir char degiskeni verin ve onu wrapper a dönüştürün-primitive de dönüştürün
        char initial ='g';//primitive
        Character wrapperInitial=initial;
        Float f1=0.2f;
        float primitiveF1= f1;

     /*soru 3:   Variables                           Istenen Yazılar
              String str1="Java";                 1)Java Guzel 54
              String str2="Güzel";                2)Java 5 Guzel
              int sayı1=5;                        3)Java 94
              int sayı2=4;                        4)Java 19
                                                  5)54 Guzel
      */
        String str1="Java";
        String str2="Güzel";
        int sayı1=5;
        int sayı2=4;
        System.out.println(str1+" "+str2+" "+""+sayı1+sayı2);
        System.out.println(str1+" "+sayı1+" "+str2);
        System.out.println(str1+" "+"94");
        System.out.println(str1+" "+"19");
        System.out.println("54"+" "+str2);

     //Example 1:Farklı 3 data turunde variable olusturn ve bunları yazdırın.
     byte day = 3;
     System.out.println(day);
     double number =2.5;
     System.out.println(number);
     char in ='e';
     System.out.println(in);

     //Example 2:Isım ve soy ısım icin iki variable oluşturun,isminiz:Mehmet soyisminiz:Bulutluoz seklınde yazdırın.
     String name ="Mehmet";
     System.out.println(name);
     String surname ="Bulutluoz";
     System.out.println(surname);

     //Example 3:Ikı farklı tam sayı data turunde 2 varıable olusturun ve bunların toplamını yazdırın.
     int say1 = 12;
     System.out.println(say1);
     double say2= 7.5;
     System.out.println(say2);
     System.out.println(say1+say2);

     //Example 4:Bir tam sayı ve bir ondalıklı variable oluşturun ve bunların toplamını yazdırın.
     byte z = 45;
     float b1 = 1.2F;
     System.out.println(z+b1);

     //Example 5: char data turunde bır varıable oluşturun ve yazdırın.
     char num ='2';
     System.out.println(num);

     //Example 6: Bir tam sayı ,bir de char degiskeni oluşturun ve bunların toplamını yazdırın.
     short white = 1234;
     char black = 'B';
     System.out.println(white+black);
    }
}
