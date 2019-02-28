package Behavior.Observer;

public class Channel2 extends Observer {

    @Override
    public void update() {
        System.out.println("channel 2: "+weatherStation.getTemp());
    }
}
