public class Television extends Device {
    private int channel;
    private int volume;

    public Television() {
        this.channel = 1;
        this.volume = 10;
    }

    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("TV channel set to " + channel);
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
            System.out.println("TV Status → Channel: " + channel + ", Volume: " + volume + "%");
        else
            System.out.println("TV is OFF.");
    }
}

// GUMIRAN, HANS JESSIE AUGUSTO M.
// BSCS-2D
// AI USED: CHATGPT
// AI CONVO LINK: https://chatgpt.com/share/6931b1e5-5830-8010-96f7-95c37df6dc91
