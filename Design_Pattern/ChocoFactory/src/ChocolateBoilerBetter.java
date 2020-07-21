public class ChocolateBoilerBetter {
    private volatile static ChocolateBoilerBetter uniqueInstance;

    private ChocolateBoilerBetter() {
    }

    public static ChocolateBoilerBetter getInstance() {
        if (uniqueInstance == null) {
            synchronized (ChocolateBoilerBetter.class) {
                uniqueInstance = new ChocolateBoilerBetter();
            }
        }
        return uniqueInstance;
    }

}
