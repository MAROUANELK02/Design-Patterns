package adapter;

public class UniteCentral {
    private Vga vga;

    public void print(String str) {
        System.out.println("***********");
        vga.print(str);
        System.out.println("***********");
    }

    public void setVga(Vga vga) {
        this.vga = vga;
    }
}
