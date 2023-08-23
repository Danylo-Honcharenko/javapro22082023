public class Car {
    private void startElectricity() {
        System.out.println("Launch electronics");
    }

    private void startCommand() {
        System.out.println("Start command");
    }

    private void startFuelSystem() {
        System.out.println("Start the fuel system");
    }
    public void start() {
        System.out.println("We start all the components of the machine");
        startCommand();
        startElectricity();
        startFuelSystem();
    }
}
