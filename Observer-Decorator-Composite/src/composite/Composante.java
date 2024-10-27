package composite;

public abstract class Composante {
    protected String name;
    protected int level;

    public Composante(String root) {
        name = root;
    }

    public abstract void afficher();

    public String getTab() {
        return "\t".repeat(Math.max(0, level));
    }
}
