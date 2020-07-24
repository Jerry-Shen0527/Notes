import java.util.Random;

public class HasQuarterState implements State {
    CandyMachine candyMachine;
    Random random = new Random(System.currentTimeMillis());

    public HasQuarterState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Already one quarter!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("One quarter returned!");
        candyMachine.setState(candyMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Turned....");

        int winner = random.nextInt(10);
        if (winner == 0 && (candyMachine.getCount() > 1)) {
            candyMachine.setState(candyMachine.getWinnerState());
        } else {
            candyMachine.setState(candyMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No candy dispensed!");
    }
}
