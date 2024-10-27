package decorator;

import decorator.deco.Chocolat;
import decorator.deco.Vanille;
import decorator.produits.Boisson;
import decorator.produits.Espresso;

public class Application {
    public static void main(String[] args) {
        Boisson boisson;
        boisson = new Espresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        boisson = new Vanille(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
    }
}
