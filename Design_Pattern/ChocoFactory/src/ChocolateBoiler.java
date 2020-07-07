public class ChocolateBoiler {
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
    }

    public static synchronized ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();

        }
        return uniqueInstance;
    }

}
