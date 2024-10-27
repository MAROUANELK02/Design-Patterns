package decorator.deco;

import decorator.produits.Boisson;

public class Vanille extends DecorateurIngredient {
    public Vanille(Boisson boisson) {
        super(boisson);
    }

    public double cout() {
        return 2.6 + boisson.cout();
    }

    public String getDescription() {
        return boisson.getDescription()+" Au Vanille";
    }
}
