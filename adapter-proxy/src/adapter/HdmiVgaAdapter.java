package adapter;

public class HdmiVgaAdapter implements Vga{
    private Hdmi hdmi;

    @Override
    public void print(String message) {
        System.out.println(".....Adapter.....");
        byte[] data = message.getBytes();
        hdmi.view(data);
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
