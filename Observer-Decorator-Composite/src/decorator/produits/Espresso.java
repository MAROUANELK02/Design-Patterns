package decorator.produits;

public class Espresso extends Boisson {

    public Espresso(){
        description="Espresso";
    }

    public double cout() {
        return 12.5;
    }
}