public class RemoteControlTest {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        Garage garage = new Garage();
        GarageOpenCommand garageOpenCommand = new GarageOpenCommand(garage);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);

        remoteControl.onButtonPressed(0);
        remoteControl.offButtonPressed(0);
        Command[] party = {lightOnCommand, lightOffCommand, garageOpenCommand};
        MacroCommand macroCommand = new MacroCommand(party);

        remoteControl.setCommand(1, macroCommand, new NoCommand());
        remoteControl.onButtonPressed(1);
    }
}
