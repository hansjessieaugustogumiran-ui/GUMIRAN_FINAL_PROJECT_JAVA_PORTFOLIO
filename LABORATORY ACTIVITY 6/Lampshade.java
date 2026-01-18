public class LampShade extends Device {
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
            System.out.println("Lamp Status → Brightness: " + brightness + "%, Color: " + lightColor);
        else
            System.out.println("Lamp is OFF.");
    }
}


// GUMIRAN, HANS JESSIE AUGUSTO M.
// BSCS-2D
// AI USED: CHATGPT
// AI CONVO LINK: https://chatgpt.com/share/6931b1e5-5830-8010-96f7-95c37df6dc91
