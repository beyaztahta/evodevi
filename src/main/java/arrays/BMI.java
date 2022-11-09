package arrays;

public class BMI {

    private double boy;
    private double kilo;

    public BMI(double boy, double kilo) {
        this.boy = boy;
        this.kilo = kilo;
    }


    public double getBoy() {
        return boy;
    }

    public double getKilo() {
        return kilo;
    }


    public void setBoy(double boy) {
        this.boy = boy;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public void BMIHesapla(){
        double bmi=kilo/(boy*boy);
        if(bmi>0 && bmi<18.5){
            System.out.println("Zayıf");
        } else if (bmi>=18.5 && bmi<25) {
            System.out.println("normal");
        } else if (bmi>=25 && bmi<30) {
            System.out.println("kilolu");
        } else if (bmi>=30) {
            System.out.println("obez");
        }else {
            System.out.println("gecersiz deger");
        }
    }

    @Override
    public String toString() {
        return "BMI{" +
                "boy=" + boy +
                ", kilo=" + kilo +
                '}';
    }







}
