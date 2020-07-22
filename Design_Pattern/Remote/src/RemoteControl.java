public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int i, Command onCommand, Command offCommand) {
        onCommands[i]=onCommand;
        offCommands[i]=offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
    }
    public void offButtonPressed(int slot){
        offCommands[slot].execute();
    }

}
