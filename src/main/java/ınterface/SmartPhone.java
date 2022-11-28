package ınterface;

public class SmartPhone implements Player,GPS{  //multiple inheritance


    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void pause() {
        System.out.println("pause");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void getCoordinates() {
        System.out.println("smartphone coordinate");
    }

    public static void main(String[] args) {
        SmartPhone sm=new SmartPhone();
        sm.getCoordinates();
        sm.start();
        sm.pause();
        sm.stop();

        Player.method1();
        GPS.method2();

    }


}
