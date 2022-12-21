package ifstatement00;

public class MyClass {
/*
10) myClass isminde bir class oluşturunuz, class'ta size rastgele bir alfabetik karakter veren bir
yöntem oluşturun ve ardından yöntemi kullanarak aşağıdakileri yazdırınız.
'A' ve 'a' için "İlk Karakter" yazdırınız.
'B' ve 'b' için "İkinci Karakter" yazdırınız.
'C' ve 'c' için "Üçüncü Karakter" yazdırınız.
'D' ve 'd' için "Dördüncü Karakter" yazdırınız.
Diğerleri için "Diğer Karakterleri" yazdırınız
 */
    public static String RandomAlphabet(){
        String alhphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIndex=alhphabet.length()-1;
        int randomAlphabet=(int)Math.random()*maxIndex;
        return alhphabet.substring(randomAlphabet,randomAlphabet+1);
    }


    public static void main(String[] args) {
       String alfabe=MyClass.RandomAlphabet().toLowerCase();
       switch(alfabe){
           case "a":
               System.out.println("İlk Karakter" );
               break;
           case "b":
               System.out.println("İknci Karakter" );
               break;
           case "c":
               System.out.println("Ucuncu Karakter" );
               break;
           case "d":
               System.out.println("Dorduncu Karakter" );
               break;
           default:
               System.out.println("Diger karakterler....");

       }










    }
}
