package employe;

public class ImpotRevenuDz implements ImpotRevenu {
    @Override
    public float calculerIGR(float salaireBrutMensuel) {
        float salaireBrutAnuel=salaireBrutMensuel*12;
        float taux = 35;
        return salaireBrutAnuel*taux/100;
    }
}
