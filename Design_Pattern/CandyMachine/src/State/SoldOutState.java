package State;

import Machine.CandyMachine;

public class SoldOutState implements State {
    transient CandyMachine candyMachine;

    public SoldOutState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("No more candy! Ejecting quarter!");
        ejectQuarter();
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Ejecting......");
    }

    @Override
    public void turnCrank() {
        System.out.println("No more candy!");

    }

    @Override
    public void dispense() {
        System.out.println("No dispensed");
    }
}
