package ifstatement00;

import java.util.Scanner;

public class IfStatemnet01 {
    public static void main(String[] args) {
      /*  1) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Aralık, Ocak, Şubat için "Kış"
        b) Mart, Nisan, Mayıs için "İlkbahar"
        c) Haziran, Temmuz, Ağustos için "Yaz"
        d) Eylül, Ekim, Kasım için "Sonbahar"
        e) Diğerleri için "Geçersiz ay adı"

       */
//       String monthName="sonbahar";
//       monthName=monthName.toLowerCase();
//       switch(monthName){
//           case "ocak":
//           case "subat":
//           case "aralık":
//               System.out.println("kıs");
//               break;
//           case "mart":
//           case "nisan":
//           case "mayıs":
//               System.out.println("ilkbhar");
//               break;
//           case "haziran":
//           case "temmuz":
//           case "agustos":
//               System.out.println("yaz");
//               break;
//           case "eylul":
//           case "ekim":
//           case "kasım":
//               System.out.println("sonbahar");
//               break;
//           default:
//               System.out.println("Gecersiz ay adı");
//       }
     //if ile cozum:
//        Scanner input=new Scanner(System.in);
//        System.out.println("Lutfen bir ay ismi soyleyiniz.");
//        String monthName= input.next().toLowerCase();
//        if(monthName.equals("aralık")||monthName.equals("ocak")||monthName.equals("subat")){
//            System.out.println("KIS");
//        }else if(monthName.equals("mart")||monthName.equals("nisan")||monthName.equals("mayıs")){
//            System.out.println("ILKBAHAR");
//        }else if(monthName.equals("haziran")||monthName.equals("temmuz")||monthName.equals("agustos")){
//            System.out.println("yaz");
//        }else if(monthName.equals("eylul")||monthName.equals("ekim")||monthName.equals("kasım")) {
//            System.out.println("SONBAHAR");
//        }else
//            System.out.println("Gecersiz ay adı girdiniz.");

       /* 2) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
        b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
        c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
        Not: Çözümdeki koşulların sıralarına dikkat ediniz.

        */
      String password="mamisa12";
      if(password.replaceAll("\\S","").length()>0){
          System.out.println("Sifrede bosluk karakteri kullanmayınız");
      }else if(password.replaceAll("\\S","").length()>=8){
          System.out.println("Gecerli sifre");
      }else{
          System.out.println("Gecersiz sifre");
      }

      /*  3) Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız.
        Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb.

       */
      int ayNumber=5;
      switch (ayNumber){
          case 1:
              System.out.println("january");
              break;
          case 2:
              System.out.println("february");
              break;
          case 3:
              System.out.println("march");
              break;
          case 4:
              System.out.println("april");
              break;
          case 5:
              System.out.println("may");
              break;
          case 6:
              System.out.println("june");
              break;
          case 7:
              System.out.println("july");
              break;
          case 8:
              System.out.println("agustus");
              break;
          case 9:
              System.out.println("september");
              break;
          case 10:
              System.out.println("octaber");
              break;
          case 11:
              System.out.println("november");
              break;
          case 12:
              System.out.println("december");
              break;
          default:
              System.out.println("Gecersiz ay numarası girdiniz");

      }


    }
}
