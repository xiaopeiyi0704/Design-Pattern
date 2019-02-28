package Behavior.Command;

public class OffCommand implements Command {
    Light light;
    Fan fan;

    public OffCommand(Light light, Fan fan){
        this.light=light;
        this.fan=fan;
    }

    public void execute(){
        light.switchOff();
        fan.switchOff();
    }
}
