package arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        //1-) String bir multidimansional Array olustur, eleman ekle ve toplam eleman sayisini bulan kodu yaz.

//        String arr[][] = {{"Ali", "Veli"}, {"Ayse", "Fatma"}};
//        int toplam = 0;
//        for(String[] w : arr) {
//            toplam += w.length;
//        }
//        System.out.println(toplam);

        //2-)Bir String multidimensional Array'de icinde 'a' olan elemanlari yazdiriniz
//
//            String arr[][] = {{"Ali", "Veli"}, {"Ayse", "Fatma"}};
//
//            for(String[] w : arr) {
//                for(String s : w) {
//                    if(s.contains("a")) {
//                        System.out.print(s + " ");
//                    }
//                }
//            }

        //3-)Bir tane Integer multi dimensional Array olustur ve
        //bu Array'deki tum sayilarin toplamini veren kodu yaz

//        int arr[][] = {{1,5,9,15},{5,6,7}};
//        int toplam = 0;
//
//        for(int[] w : arr) {
//            for(int s : w) {
//                toplam += s;
//            }
//        }
//        System.out.println(toplam);

        //4-)Bir multidimensional arrayi normal array a ceviren kodu yaziniz

//        String arr[][] = {{"Ali", "Veli"}, {"Ayse", "Fatma"}};
//        int elemanSayisi = 0;
//        int idx = 0;
//
//        for(String[] w : arr) {
//            elemanSayisi += w.length;
//        }
//        String arr2[] = new String[elemanSayisi];
//
//        for(String[] w : arr) {
//            for(String s : w) {
//                arr2[idx] = s;
//                idx++;
//            }
//        }
//        System.out.println(Arrays.toString(arr2));

        //5-)Bir multidimensional arraydaki en buyuk ve en kucuk elemanin toplamini veren kodu yaz

//            int arr[][] = {{10,5,3}, {45,32}};
//
//            int min = arr[0][0];
//            int max = arr[0][0];
//
//            for(int[] w : arr) {
//                for(int s : w) {
//                    min = Math.min(min, s);
//                    max = Math.max(max, s);
//                }
//            }
//            System.out.println(max + min);

        //6-)Asagidaki multi dimensional array'in ic array'lerindeki son elemanlarin carpimini
        //ekrana yazdiran bir program yaziniz.

//            int arr[][] = {{10,5,3}, {45,32}};
//            int carpim = 1;
//
//            for (int[] w : arr) {
//                carpim *= w[w.length-1];
//            }
//            System.out.println(carpim);

        //7-)Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        //elemanlarin toplamini ekrana yazdiran bir program yaziniz.
//        int arr[][] = {{10,5,3}, {45,32,3}, {4,2}};
//        int arr2[][] = {{10,5}, {45,32,89,59}};
//
//        int donguSayisi = Math.min(arr.length, arr2.length);
//
//        for(int i = 0; i < donguSayisi; i++) {
//            int ikinciDonguSayisi = Math.min(arr[i].length, arr2[i].length);
//            for(int j = 0; j < ikinciDonguSayisi; j++) {
//                System.out.println(arr[i][j] + arr2[i][j]);
//            }

    }
}
