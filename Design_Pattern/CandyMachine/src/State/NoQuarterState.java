package State;

import Machine.CandyMachine;

public class NoQuarterState implements State {
    transient CandyMachine candyMachine;

    public NoQuarterState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter.");
        candyMachine.setState(candyMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Haven't insterted a quarter.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turned, but no quarter.");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first.");
    }
}
