package collectiıns;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        //verilen liste tum elemani ekranda yaziniz.
        List<Integer> liste= new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste); // [5, 7, 8, 6, 9]
        // for each kullanarak her elementi 2 artiralim

        for(Integer w:liste){
//          w=w+2;
//          System.out.print(w+" ");
            liste.set(liste.indexOf(w),w+2);
            System.out.println(liste);
        }

        // bir listede ortalamanin ustunde olan element sayisini bulunuz

        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);

        double ortalama=0;
        double sum=0;
        for(Double w:sayilar){
            sum=  (sum+w);
        }
        double ort=sum/sayilar.size();
        System.out.println(ort);

        List<Double>ortalamaUstundekiler=new ArrayList<>();

        for(int i=0; i<sayilar.size();i++){
            if(sayilar.get(i)>ort){
                ortalamaUstundekiler.add(sayilar.get(i));
            }
        }
        System.out.println(ortalamaUstundekiler);


        double t =0;
        int counter= 0;
        for (Double w : sayilar) {
            t+=w;
            counter++;
        }
        System.out.println(t/counter);













    }
}
