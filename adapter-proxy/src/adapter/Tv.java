package adapter;

public class Tv implements Hdmi{
    @Override
    public void view(byte[] data) {
        System.out.println(".....TV.....");
        String message = new String(data);
        System.out.println(message);
        System.out.println("......Hdmi.....");
    }
}
