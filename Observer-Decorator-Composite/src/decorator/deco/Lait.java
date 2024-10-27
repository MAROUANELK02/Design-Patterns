package decorator.deco;

import decorator.produits.Boisson;

public class Lait extends DecorateurIngredient {
    public Lait(Boisson boisson) {
        super(boisson);
    }

    public double cout() {
        return 2 + boisson.cout() ;
    }

    public String getDescription() {
        return boisson.getDescription()+" Au Lait";
    }
}
