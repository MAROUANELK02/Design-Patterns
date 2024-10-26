package employe;

public class Employe {
    private String cin;
    private float salaireBrutMensuel;
    private ImpotRevenu impotRevenu;

    public Employe(String cin, float salaireBrutMensuel) {
        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public float calculerIGR(){
        return impotRevenu.calculerIGR(salaireBrutMensuel);
    }

    public float getSalaireNetMensuel(){
        float igr=calculerIGR();
        float salaireNetAnuel=salaireBrutMensuel*12-igr;
        return salaireNetAnuel/12;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }

    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public void setImpotRevenu(ImpotRevenu impotRevenu) {
        this.impotRevenu = impotRevenu;
    }
}
