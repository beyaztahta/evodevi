package abstraction;

public class CarRunner {
    public static void main(String[] args) {

        Toyota toyota=new Toyota();
        System.out.println(toyota.make +" "+toyota.year+" "+toyota.model );
        toyota.model();
        toyota.year();
        toyota.make();


        System.out.println("=================================================");

        Honda obje=new Honda();
        System.out.println(obje.make +" "+obje.year+" "+obje.model );
        obje.model();
        obje.year();
        obje.make();

    }
}
