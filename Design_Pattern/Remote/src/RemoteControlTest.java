public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonPressed();

        Garage garage=new Garage();
        GarageOpenCommand garageOpenCommand=new GarageOpenCommand(garage);
        remoteControl.setCommand(garageOpenCommand);
        remoteControl.buttonPressed();
    }
}
