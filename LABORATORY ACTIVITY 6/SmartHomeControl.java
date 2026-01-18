import java.util.*;

// DEVICE
abstract class Device {
    private boolean isOn = false;
    public void turnOn() {
        isOn = true;
        System.out.println(getClass().getSimpleName() + " is now ON.");
        showStatus();
    }
    public void turnOff() {
        isOn = false;
        System.out.println(getClass().getSimpleName() + " is now OFF.");
        System.out.println("");
    }
    public boolean isOn() {
        return isOn;
    }
    public abstract void showStatus();
    public static void toggleDevices(List<Device> devices, boolean power) {
        for (Device d : devices) {
            if (power) d.turnOn();
            else d.turnOff();
        }
    }
    public static int countPoweredOn(List<Device> devices) {
        int count = 0;
        for (Device d : devices) {
            if (d.isOn()) count++;
        }
        return count;
    }
}

// AirConditioner
class AirConditioner extends Device {
    private int fanSpeed;
    private int temperature;
    public AirConditioner() {
        this.fanSpeed = 3;
        this.temperature = 24;
    }
    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        System.out.println("");
        System.out.println("Air Conditioner fan speed set to " + fanSpeed);
        System.out.println("");
        showStatus();
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("");
        System.out.println("Air Conditioner temperature set to " + temperature);
        System.out.println("");
        showStatus();
    }
    @Override
    public void showStatus() {
        if (isOn())
            System.out.println("AC Status — Fan Speed: " + fanSpeed + ", Temp: " + temperature);
        else
            System.out.println("AC is OFF.");
    }
}

// Lampshade
class LampShade extends Device {
    private int brightness;
    private String lightColor;
    public LampShade(int brightness, String lightColor) {
        this.brightness = brightness;
        this.lightColor = lightColor;
    }
    public LampShade(LampShade other) {
        this.brightness = other.brightness;
        this.lightColor = other.lightColor;
    }
    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println("Lamp brightness set to " + brightness + "%");
        showStatus();
    }
    public void setLightColor(String color) {
        this.lightColor = color;
        System.out.println("Lamp color set to " + color);
        showStatus();
    }
    @Override
    public void showStatus() {
        if (isOn())
            System.out.println("Lamp Status — Brightness: " + brightness + "%, Color: " + lightColor);
        else
            System.out.println("Lamp is OFF.");
    }
}

// Television
class Television extends Device {
    private int channel;
    private int volume;

    public Television() {
        this.channel = 1;
        this.volume = 10;
    }

    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("");
        System.out.println("TV channel set to " + channel);
        System.out.println("");
        showStatus();
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume set to " + volume + "%");
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isOn())
            System.out.println("TV Status — Channel: " + channel + ", Volume: " + volume + "%");
        else
            System.out.println("TV is OFF.");
    }
}
// Microwave
class Microwave extends Device {
    private int timer;
    private int temperature;
    public Microwave() {
        this.timer = 0;
        this.temperature = 0;
    }
    public void setTimer(int timer) {
        this.timer = timer;
        System.out.println("");
        System.out.println("Microwave timer set to " + timer + " seconds");
        showStatus();
    }
    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("");
        System.out.println("Microwave temperature set to " + temp);
        showStatus();
    }
    @Override
    public void showStatus() {
        if (isOn())
        System.out.println("Microwave Status — Timer: " + timer + "s, Temp: " + temperature);
        else
            System.out.println("Microwave is OFF.");
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        LampShade lamp1 = new LampShade(100, "Yellow");
        LampShade lamp2 = new LampShade(lamp1);
        Television tv = new Television();
        Microwave microwave = new Microwave();
        List<Device> devices = Arrays.asList(ac, lamp1, lamp2, tv, microwave);
        System.out.println("— Turning ALL devices ON —");
        Device.toggleDevices(devices, true);
        System.out.println("");
        System.out.println("—" + "Turning ALL devices OFF —");
        Device.toggleDevices(devices, false);
        System.out.println("Devices powered ON: " + Device.countPoweredOn(devices));
    }
}

// GUMIRAN, HANS JESSIE AUGUSTO M.
// BSCS-2D
// AI USED: CHATGPT
// AI CONVO LINK: https://chatgpt.com/share/6931b1e5-5830-8010-96f7-95c37df6dc91
