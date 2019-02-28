package Behavior.Observer;

public class Driver {

    public static void main(String[] args){
        WeatherStation weatherStation=new WeatherStation();


        Channel1 channel1=new Channel1();
        Channel2 channel2=new Channel2();

        //add observer to weather station notification list
        weatherStation.addObserver(channel1);
        weatherStation.addObserver(channel2);

        weatherStation.setTemp(76);
        weatherStation.notifyObservers();
    }


}
