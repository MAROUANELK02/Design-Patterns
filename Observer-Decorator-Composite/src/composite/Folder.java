package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Composante{
    private List<Composante> composantes = new ArrayList<>();

    public Folder(String root) {
        super(root);
    }

    @Override
    public void afficher() {
        System.out.println(getTab()+ "- Folder : "+name);
        for(Composante c: composantes) {
            c.afficher();
        }
    }

    public Composante addComposante(Composante c) {
        composantes.add(c);
        c.level = this.level + 1;
        return c;
    }

}
