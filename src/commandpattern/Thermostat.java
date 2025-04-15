package commandpattern;

public class Thermostat {
    private int previousTemperature;
    private int currentTemperature;

    public void setTemperature(int temperature) {
        previousTemperature = currentTemperature;
        currentTemperature = temperature;
        System.out.println("[Thermostat] Setting temperature to " + temperature + "°C");
    }

    public void revertTemperature() {
        currentTemperature = previousTemperature;
        System.out.println("[Thermostat] Reverting to previous temperature: " + previousTemperature + "°C");
    }
}
