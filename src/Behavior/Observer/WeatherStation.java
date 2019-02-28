package Behavior.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    List<Observer> observerList=new ArrayList<Observer>();
    int temp;


    public void setTemp(int temp){
        this.temp=temp;
    }

    public int getTemp(){
        return this.temp;
    }


    public void addObserver(Observer observer){
        //assign the weather station to the observer gonna to observe
        observer.weatherStation=this;

        //add the observer to weather station notify list
        observerList.add(observer);

    }

    public void notifyObservers(){
        for(Observer observer: observerList){
            observer.update();
        }
    }

}
