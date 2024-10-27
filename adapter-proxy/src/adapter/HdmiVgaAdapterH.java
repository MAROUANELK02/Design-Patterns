package adapter;

public class HdmiVgaAdapterH extends Tv implements Vga {
    @Override
    public void print(String message) {
        System.out.println("======= Adapter =======");
        byte[] data = message.getBytes();
        super.view(data);
        System.out.println("==========");
    }
}
