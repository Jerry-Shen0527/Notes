public class CandyMachine {
    State state;

    public int getCount() {
        return count;
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

    void setState(State state) {
        this.state = state;
    }


    public CandyMachine(int i) {
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
