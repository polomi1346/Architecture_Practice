package SOLID;

// 1. Abstraction: Switchable device
interface Switchable {
    void turnOn();
    void turnOff();
}

// 2. Concrete implementation
public class DIP {

    public static class LightBulb implements Switchable {
        public void turnOn() {
            System.out.println("Light is ON!");
        }

        public void turnOff() {
            System.out.println("Light is OFF!");
        }
    }

    // 3. High-level module depends on the abstraction, not the detail
    public static class Switch {
        private Switchable device;

        public Switch(Switchable device) {
            this.device = device;
        }

        public void operate() {
            device.turnOn();  // uses abstraction
        }
    }

    public static void main(String[] args) {
        Switchable lightBulb = new LightBulb();
        Switch lightSwitch = new Switch(lightBulb);
        lightSwitch.operate();
    }
}
