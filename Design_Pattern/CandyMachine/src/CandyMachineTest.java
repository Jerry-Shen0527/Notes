public class CandyMachineTest {
    public static void main(String[] args) {
        CandyMachine candyMachine=new CandyMachine(5);
        System.out.println(candyMachine);
        candyMachine.insertQuarter();
        candyMachine.turnCrank();

    }
}
