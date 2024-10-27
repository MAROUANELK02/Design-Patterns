package composite;

public class Test {
    public static void main(String[] args) {
        Folder root = new Folder("Root");
        root.addComposante(new File("Java.txt"));
        root.addComposante(new File("pom.xml"));
        Folder src = (Folder) root.addComposante(new Folder("src"));
        src.addComposante(new File("data.csv"));
        src.addComposante(new File("config.txt"));
        Folder org = (Folder) src.addComposante(new Folder("org"));
        org.addComposante(new File("data.bin"));
        src.addComposante(new File("config2.txt"));
        root.afficher();
    }
}
