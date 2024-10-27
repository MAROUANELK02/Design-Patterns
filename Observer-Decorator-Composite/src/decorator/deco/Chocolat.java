package decorator.deco;

import decorator.produits.Boisson;

public class Chocolat extends DecorateurIngredient {
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    public double cout() {
        return 1.6 + boisson.cout();
    }

    public String getDescription() {
        return boisson.getDescription()+" Au Chocolat";
    }
}
