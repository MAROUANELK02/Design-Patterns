package composite;

public class File extends Composante{
    public File(String root) {
        super(root);
    }

    @Override
    public void afficher() {
        System.out.println(getTab()+"- File => "+name);
    }
}
