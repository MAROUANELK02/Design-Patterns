package decorator.deco;

import decorator.produits.Boisson;

public class Noisette extends DecorateurIngredient {
    public Noisette(Boisson boisson) {
        super(boisson);
    }

    public double cout() {
        return 1.2 + boisson.cout();
    }

    public String getDescription() {
        return boisson.getDescription()+" Au Noisette";
    }
}
