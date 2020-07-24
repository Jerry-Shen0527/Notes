import Machine.CandyMachine;
import Remote.CandyMachineRemote;

import java.rmi.Naming;

public class CandyMachineTest {
    public static void main(String[] args) {
        CandyMachineRemote candyMachine = null;
        int count;
        if (args.length < 2) {
            System.out.println("CandyMachine <name> <inventory>");
            System.exit(1);
        }
        try {
            count = Integer.parseInt(args[1]);
            candyMachine = new CandyMachine(count, args[0]);
            Naming.rebind("//" + args[0] + "/candymachine", candyMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
