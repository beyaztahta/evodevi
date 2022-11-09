package arrays;

public class Arrays05 {
    public static void main(String[] args) {

        // SORU 1: Elemanlari "Ali" , "Veli", "Ayşe" ve "Fatma" olan bir array oluşturun ve bu array'i yazdirin.
//
//        String arr[] = new String[4];
//        arr[0] = "Ali";
//        arr[1] = "Veli";
//        arr[3] = "Fatma";
//        arr[2] = "Ayşe";
//
//        System.out.println(Arrays.toString(arr));
//
//        //SORU 2: Soru 1'deki elemanlardan "Ali" yerine "Can", "Ayşe" yerine "Gül" atayin.
//
//        arr[0] = "Can";
//        arr[2] = "Gul";
//
//        System.out.println(Arrays.toString(arr));
//
//        //SORU 3: String bir Array olusturunuz. Bu Array e 5 tane isim yerlestiriniz. Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz.
//
//        String arr2[] = {"Ali","Veli","Ahmet","Mahmut","Samet"};
//
//        int toplam = 0;
//        for(String w : arr2) {
//            toplam = toplam + w.length();
//        }
//        System.out.println(toplam);
//
//        //SORU 4: Verilen bir array'in elemanlarini kucucten buyuge siralayin.
//
//        int arr3[] = {-5,89,-15,63,0};
//        System.out.println(Arrays.toString(arr3));
//        Arrays.sort(arr3);
//        System.out.println(Arrays.toString(arr3));
//
//        //SORU 5: Verilen bir array'in elemanlarini buyukten kucuge siralayin.
//
//        int arr3Ters[] = new int[arr3.length]; // [0,0,0,0,0]
//        System.out.println(Arrays.toString(arr3Ters));
//
//        int idx = arr3.length-1;//4
//        for (int w : arr3) {
//            arr3Ters[idx] = w;
//            idx--;//0
//        }
//
//        System.out.println(Arrays.toString(arr3Ters));

        //SORU 6: Verilen bir array'in elemanlarini karakter sayisina gore siralayin.

//        Arrays.sort(arr, Comparator.comparingInt(String :: length));
//        System.out.println(Arrays.toString(arr));

        //SORU 7: Verilen bir String ifade de, verilen karakterin kac kere tekrar ettigini bulan kodu yaziniz

//        String str = "Java kolaydirrrrrrrrr";
//
//        String chArr[] = str.split("");
//
//
//        String ch = "r";
//        int counter = 0;
//        Arrays.sort(chArr);
//        System.out.println(Arrays.toString(chArr));
//
//        for (String w : chArr) {
//            if (w.equalsIgnoreCase(ch)) {
//                counter++;
//            }
//        }
//
//        System.out.println(counter);

        //SORU 8: Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.

//        int arr[] = {5,8,10,45,89,45,86};
//        int ortadakiEleman = arr.length/2;
//        if(arr.length%2==0) {
//            System.out.println(arr[ortadakiEleman] + arr[ortadakiEleman-1]);
//        }else {
//            System.out.println(arr[ortadakiEleman]);
//        }

        //SORU 9: String'lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz

//        String arr[] = {"Ali", "Veli", "Ayse", "Fatma","Abizittin", "Ab", "TR"};
//        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr, Comparator.comparingInt(String :: length));
//        System.out.println(Arrays.toString(arr));
//
//        for (String w : arr) {
//            if(w.length() == arr[0].length()) {
//                System.out.println(w);
//            }
//        }


        //SORU 10: Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
        //bulunuz.

//        int arr[] = {5, -5, 89, 456, -789, 266};
//        Arrays.sort(arr);

        //1.Yol
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0 && arr[i + 1] > 0) {
//                System.out.println("En Buyuk Negatif: " + arr[i]);
//                System.out.println("En Kucuk Pozitif: " + arr[i + 1]);
//            }
//        }

        //2.Yol
//        int enKucukPoz = arr[arr.length-1];
//        int enBuyukNeg = arr[0];
//
//        for(int w : arr) {
//            if(w>0) {
//                enKucukPoz = Math.min(enKucukPoz, w);
//            }
//            if(w<0) {
//                enBuyukNeg = Math.max(enBuyukNeg, w);
//            }
//        }
//
//
//        System.out.println("En Buyuk Negatif: " + enBuyukNeg);
//        System.out.println("En Kucuk Pozitif: " + enKucukPoz);



        //SORU 11: String' lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
        //alınız.

//        String arr[] = {"Ali", "Veli", "Ayse", "Fatma","Abizittin", "Ab", "TR" , "Emek"};
//
//        for(String w : arr) {
//            if(w.endsWith("n") || w.endsWith("k")) {
//                System.out.print(w.substring(0,1) + " ");
//            }
//        }

        //SORU 12: Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.

//        String str = "Ali ata bak armut adana akmerkez";
//        String arr[] = str.split(" ");
//        System.out.println(Arrays.toString(arr));
//        int counter = 0;
//        for(String w : arr) {
//            if(w.startsWith("a") || w.startsWith("A")) {
//                counter++;
//            }
//        }
//        System.out.println("A veya a ile baslayan eleman sayisi: " + counter);

        //SORU 13: Verilen bir String'deki sesli harf sayısını bulunuz.

//        String str = "Java kolay bir yazilim dilidir";
//        String arr[] = str.split("");
//        System.out.println(Arrays.toString(arr));
//        int counter = 0;
//        for(String w : arr) {
//            if(w.equalsIgnoreCase("a") ||
//               w.equalsIgnoreCase("e") ||
//               w.equalsIgnoreCase("i") ||
//               w.equalsIgnoreCase("o") ||
//               w.equalsIgnoreCase("u")) {
//                counter++;
//            }
//        }
//        System.out.println("String'de " + counter + " adet sesli harf vardir");


        //SORU 14: Ilk ve son karakterleri ayni olan array öğelerini bulmak için kod yazınız.

//        String[] arr = {"alabama", "miami", "asa", "sos", "abizittin"};
//
//        for(String w : arr) {
//            if(w.substring(0,1).equals(w.substring(w.length()-1))) {
//                System.out.print(w + " ");
//            }
//        }

        //SORU 15: Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız.

//        String arr[] = {"Apex", "is", "an", "object", "oriented", "programming", "language"};
//        String oge = "object";
//        int counter = 0;
//
//        for (String w : arr) {
//            if(w.equals(oge)) {
//                counter++;
//            }
//        }
//
//        if(counter > 0) {
//            System.out.println(oge + " dizinin icerisinde " + counter + " adet bulunmaktadir");
//        }else {
//            System.out.println(oge + " dizinin icerisinde bulunmamaktadir");
//        }

        //SORU 16: Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.

//        int arr[] = {5,59,0,45,0,89,14,0};
//        int brr[] = new int[arr.length];
//
//        int idx = 0;
//        for(int w : arr) {
//            if(w != 0) {
//                brr[idx] = w;
//                idx++;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(brr));

        //SORU 17: Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
        //büyük öğeler arasındaki farkı konsolda yazdırınız.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Olusturacaginiz Array'in eleman sayisi kactir?");
//        int elemanSayisi = input.nextInt();
//        int arr[] = new int[elemanSayisi];
//
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println("Lutfen " + (i+1) + ". elemani giriniz");
//            arr[i] = input.nextInt();
//        }
//
//        Arrays.sort(arr);
//        int enKucukEleman = arr[0];
//        int enBuyukEleman = arr[arr.length - 1];
//        int fark = enBuyukEleman - enKucukEleman;
//        System.out.println(fark);

        //SORU 18: Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
        //konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen ilk String'i giriniz");
//        String ilkStr = input.next();
//        System.out.println("Lutfen ikinci String'i giriniz");
//        String ikinciStr = input.next();
//
//        if(ilkStr.length() != ikinciStr.length()) {
//            System.out.println("Anagram degildir");
//        } else {
//            String arr[] = ilkStr.split("");
//            String arr2[] = ikinciStr.split("");
//
//            Arrays.sort(arr);
//            Arrays.sort(arr2);
//
//            if(Arrays.equals(arr, arr2)) {
//                System.out.println("Anagramdir");
//            }else {
//                System.out.println("Anagram degildir");
//            }
//        }
        //SORU 20: Verilen bir arraydeki negatif elemanlari sola, pozitif elemanlari saga yazdiran kodu yaziniz. Ancak bunu yaparken
        //elemanlarin sirasini bozmayin. (ODEV)

//        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6};
//        int negatifElemanSayisi = 0;
//        int pozitifElemanSayisi = 0;
//
//        for(int w : arr) {
//            if(w<0) {
//                negatifElemanSayisi++;
//            }
//            if(w>0) {
//                pozitifElemanSayisi++;
//            }
//        }
//
//        int negArr[] = new int[negatifElemanSayisi];
//        int pozArr[] = new int[pozitifElemanSayisi];
//
//        int idx = 0;
//
//        for(int w : arr) {
//            if(w<0) {
//                negArr[idx] = w;
//                idx++;
//            }
//        }
//
//        idx = 0;
//
//        for(int w : arr) {
//            if(w>0) {
//                pozArr[idx] = w;
//                idx++;
//            }
//        }
//
//        int newArr[] = new int[pozitifElemanSayisi+negatifElemanSayisi];
//        int idx2 = 0;
//
//        for (int w : negArr) {
//            newArr[idx2] = w;
//            idx2++;
//        }
//
//        for (int w : pozArr) {
//            newArr[idx2] = w;
//            idx2++;
//        }
//
//        System.out.println(Arrays.toString(newArr));


        //SORU 21-) Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
        //büyük öğeler arasındaki farkı konsolda yazdırınız.


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Lutfen eleman sayisini giriniz");
//        int elemanSayisi = scan.nextInt();
//
//        int arr[] = new int[elemanSayisi];
//
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println("Lutfen " + (i+1) + ". elemani giriniz");
//            arr[i] = scan.nextInt();
//        }
//
//        Arrays.sort(arr);
//
//        int enKucukEleman = arr[0];
//        int enBuyukEleman = arr[arr.length-1];
//        int fark = enBuyukEleman-enKucukEleman;
//        System.out.println(fark);
//
//        int sayi[] = new int[elemanSayisi];
//
//        for (int i = 0; i < elemanSayisi; i++) {
//            sayi[i] = scan.nextInt();
//        }
//        int max = sayi[0];
//        int min = sayi[0];
//        for (int w : sayi){
//            max = Math.max(w,max);
//            min = Math.min(w,min);
//        }
//        System.out.println(Arrays.toString(sayi));
//        System.out.println(min);
//        System.out.println(max);
//

    }
}
