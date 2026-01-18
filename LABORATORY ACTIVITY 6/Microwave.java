public class Microwave extends Device {
    private int timer;
    private int temperature;

    public Microwave() {
        this.timer = 0;
        this.temperature = 0;
    }

    public void setTimer(int timer) {
        this.timer = timer;
        System.out.println("Microwave timer set to " + timer + " seconds");
        showStatus();
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Microwave temperature set to " + temp);
        showStatus();
    }

    @Override
    public void showStatus() {
        if (isOn())
            System.out.println("Microwave Status → Timer: " + timer + "s, Temp: " + temperature);
        else
            System.out.println("Microwave is OFF.");
    }
}

// GUMIRAN, HANS JESSIE AUGUSTO M.
// BSCS-2D
// AI USED: CHATGPT
// AI CONVO LINK: https://chatgpt.com/share/6931b1e5-5830-8010-96f7-95c37df6dc91
