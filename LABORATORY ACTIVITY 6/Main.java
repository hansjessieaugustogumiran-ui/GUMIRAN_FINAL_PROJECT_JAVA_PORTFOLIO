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
