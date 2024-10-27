package adapter;

public class SuperVP implements Hdmi, Vga{
    @Override
    public void view(byte[] data) {
        System.out.println("......Super VP HDMI......");
        String mssg = new String(data);
        System.out.println(mssg);
        System.out.println(".........");
    }

    @Override
    public void print(String str) {
        System.out.println("......Super VP VGA......");
        System.out.println(str);
        System.out.println(".........");
    }
}
