package adapter;

public class VideoProjecteur implements Vga{
    @Override
    public void print(String str) {
        System.out.println(".......VP........");
        System.out.println(str);
        System.out.println("...............");
    }
}
