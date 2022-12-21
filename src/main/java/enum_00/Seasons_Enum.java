package enum_00;

public class Seasons_Enum {
    public static void main(String[] args) {

        String seasons=Seasons.SPRING.toString();
        switch (seasons){
            case "FALL":
                System.out.println("Doga yuruyusu yapmak....");
                break;
            case "WINTER":
                System.out.println("Snowboard yapmak");
                break;
            case "SUMMER":
            case "SPRING":
                System.out.println("Balık tutmak...");
                break;
            default:
                System.out.println("Gecersiiz data girdiniz.");
                break;

        }



    }
}
