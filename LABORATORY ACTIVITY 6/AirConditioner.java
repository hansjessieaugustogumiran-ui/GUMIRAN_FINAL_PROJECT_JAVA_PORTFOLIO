public class AirConditioner extends Device {
    private int fanSpeed;
    private int temperature;

    public AirConditioner() {
        this.fanSpeed = 3;
        this.temperature = 24;
    }

    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        System.out.println("AirConditioner fan speed set to " + fanSpeed);
        showStatus();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("AirConditioner temperature set to " + temperature);
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isOn())
            System.out.println("AC Status → Fan Speed: " + fanSpeed + ", Temp: " + temperature);
        else
            System.out.println("AC is OFF.");
    }
}

// GUMIRAN, HANS JESSIE AUGUSTO M.
// BSCS-2D
// AI USED: CHATGPT
// AI CONVO LINK: https://chatgpt.com/share/6931b1e5-5830-8010-967-95c37df6dc91
