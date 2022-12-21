package enum_00;

public class Browser {
    public static void main(String[] args) {

        String browser=WebBrowsers.YANDEX.toString();

        switch (browser){
            case "CHROME":
                System.out.println("Chorome is using.");
                break;
            case "SAFARI":
                System.out.println("Safari is using.");
                break;
            case "IE":
                System.out.println("IE is using.");
                break;
            case "FIREFOX":
                System.out.println("Firefox is using.");
                break;
            case "YANDEX":
                System.out.println("Yandex is using.");
                break;
            default:
                System.out.println("Gecersiz tarayıcı....");


        }



    }

}
