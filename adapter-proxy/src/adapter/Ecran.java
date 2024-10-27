package adapter;

public class Ecran implements Vga{
    @Override
    public void print(String str) {
        System.out.println("....Screen....");
        System.out.println(str);
        System.out.println(".........");
    }
}
