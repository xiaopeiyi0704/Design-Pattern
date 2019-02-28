package Behavior.Observer;

public class Channel1 extends Observer {


    @Override
    public void update() {
        System.out.println("channel 1: "+weatherStation.getTemp());
    }
}
