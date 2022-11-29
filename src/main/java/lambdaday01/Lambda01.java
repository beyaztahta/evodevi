package lambdaday01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> sayı=new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));
        structuredProgram(sayı);
        System.out.println();
        System.out.println("====================");
        printEiFunctional(sayı);
        System.out.println();
        System.out.println("====================");
        printEiFunctional1(sayı);
        System.out.println();
        System.out.println("====================");
         printCiftBul(sayı);
        System.out.println();
        System.out.println("====================");
         printCiftBul1(sayı);
        System.out.println();
        System.out.println("====================");
        printCiftBul2(sayı);
        System.out.println();
        System.out.println("====================");
        printCiftOtzKckFunctional(sayı);
        System.out.println();
        System.out.println("====================");
        printCiftOtzBykFunctional(sayı);

    }
    //TASK 1 : "Structured Programming" kullanarak list elemanlarını aynı satirda
    // aralarında bosluk olacak sekilde print ediniz.

    public static void print(int a){
        System.out.print(a+" ");
    }
    public static void print(String a){
        System.out.print(a+" ");
    }


    public static boolean ciftBul(int a){
       return a%2==0;
    }
    public static void structuredProgram(List<Integer>sayı){
        for (Integer w:sayı) {
            System.out.print(w+" ");
        }
    }

    public static void printEiFunctional(List<Integer>sayı){
        sayı.
                stream().
                forEach(t-> System.out.print(t+" "));  //Lambda expression
    }

    public static void printEiFunctional1(List<Integer>sayı){
        sayı.
                stream().
                forEach(Lambda01::print);  //method referance
    }

    //TASK 2 : functional Programming ile list elemanlarinin  cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.

    //lambda expression
    public static void printCiftBul(List<Integer>sayı){
        sayı.
                stream().
                filter(a-> a%2==0).
                forEach(Lambda01::print);

    }

    //Method referance
    public static void printCiftBul1(List<Integer>sayı){
        sayı.
                stream().
                filter(Lambda01::ciftBul).
                forEach(Lambda01::print);
    }

    //TASK  : structural Programming ile list elemanlarinin  cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.

    public static void  printCiftBul2(List<Integer>sayı){
        for(Integer w:sayı){
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
    }


    //TASK :functional Programming ile list elemanlarinin 34 den kucuk cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.

    public static void printCiftOtzKckFunctional(List<Integer> sayı) {

        sayı.
                stream().
                filter(Lambda01::ciftBul).    //filter(t->t%2==0 &&  t<34)
                filter(t-> t<34).
                forEach(Lambda01::print);

    }



    //Task : functional Programming ile list elemanlarinin 34 den buyk veya cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.

    public static void printCiftOtzBykFunctional(List<Integer> sayı) {

        sayı.
                stream().
                filter(t -> t %2==0 && t>34).
                forEach(Lambda01::print);

    }


    }
