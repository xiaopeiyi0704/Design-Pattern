package Behavior.Command;

public class OnCommand implements Command {
    Light light;
    Fan fan;

    public OnCommand(Light light, Fan fan){
        this.light=light;
        this.fan=fan;
    }
    @Override
    public void execute() {
        light.switchOn();
        fan.switchOn();
    }
}
