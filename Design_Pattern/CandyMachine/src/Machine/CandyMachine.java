package Machine;

import Remote.CandyMachineRemote;
import State.*;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CandyMachine extends UnicastRemoteObject implements CandyMachineRemote {
    State state;
    String location;

    public CandyMachine(int i, String name) throws RemoteException {
        count = i;
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
        if (i > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }


    }

    public int getCount() {
        return count;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public State getState() throws RemoteException {
        return state;
    }

    int count = 0;

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    public State getWinnerState() {
        return winnerState;
    }

    State winnerState;

    public void setState(State state) {
        this.state = state;
    }


    public void releaseCandy() {
        System.out.println("Candy going out....");
        if (count != 0) {
            count--;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

}
