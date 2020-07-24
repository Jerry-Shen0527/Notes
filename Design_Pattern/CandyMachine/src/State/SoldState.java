package State;

import Machine.CandyMachine;

public class SoldState implements State {
    transient CandyMachine candyMachine;

    public SoldState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Already given you!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Already turned crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("No extra candy!");
    }

    @Override
    public void dispense() {
        candyMachine.releaseCandy();
        if (candyMachine.getCount() > 0) {
            candyMachine.setState(candyMachine.getNoQuarterState());
        } else {
            System.out.println("No more candy!");
            candyMachine.setState(candyMachine.getSoldOutState());
        }

    }
}
