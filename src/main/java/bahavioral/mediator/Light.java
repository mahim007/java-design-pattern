package bahavioral.mediator;

public class Light {
    private boolean isOn = false;
     private String location = "";

    public Light() {
    }

    public Light(String location) {
        this.location = location;
    }

    public void toggle() {
        if (isOn) {
            off();
        } else {
            on();
        }
    }

    public void on() {
        isOn = true;
        System.out.println(this.location + " light switched on");
    }

    public void off() {
        isOn = false;
        System.out.println(this.location + " light switched off");
    }

    public boolean isOn() {
        return isOn;
    }

    public String getLocation() {
        return location;
    }
}
