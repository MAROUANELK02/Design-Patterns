package adapter;

public class Test {
    public static void main(String[] args) {
        UniteCentral uniteCentral = new UniteCentral();
        uniteCentral.setVga(new Ecran());
        uniteCentral.print("Bonjour");

        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new Tv());
        uniteCentral.setVga(hdmiVgaAdapter);
        uniteCentral.print("From Vga to Hdmi");

        HdmiVgaAdapter hdmiVgaAdapter1 = new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentral.setVga(hdmiVgaAdapter1);
        uniteCentral.print("From Vga to Hdmi");

        HdmiVgaAdapterH hdmiVgaAdapterH = new HdmiVgaAdapterH();
        uniteCentral.setVga(hdmiVgaAdapterH);
        uniteCentral.print("From U.C to Tv");
    }
}