package Behavior.Command;

import java.rmi.Remote;

public class Driver {

    public static void main(String[] args){
        Light light=new Light();
        Fan fan=new Fan();

        RemoteControl rc=new RemoteControl();

        Command command=new OnCommand(light, fan);
        rc.setCommand(command);
        //一键全开
        rc.pressButton();


        command=new OffCommand(light, fan);
        rc.setCommand(command);
        //一键全关
        rc.pressButton();
    }
}
