package pl.javastart.task;

public class Televisor {
    private boolean isOn;

    public Televisor() {
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void showStatus() {
        System.out.println("The tv is on: " + isOn);
    }
}
