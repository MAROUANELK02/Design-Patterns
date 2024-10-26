package employe;

public class Main {
    private static final ImpotRevenu maroc;
    private static final ImpotRevenu dz;
    private static final ImpotRevenu spain;

    static {
        maroc = new ImpotRevenuMaroc();
        dz = new ImpotRevenuDz();
        spain = new ImpotRevenu() {
            @Override
            public float calculerIGR(float salaireBrutMensuel) {
                float salaireBrutAnuel=salaireBrutMensuel*12;
                float taux;
                if(salaireBrutAnuel<12_450)
                    taux = 19;
                else if (salaireBrutAnuel<20_200)
                    taux = 24;
                else if (salaireBrutAnuel<35_200)
                    taux = 30;
                else if (salaireBrutAnuel<60_000)
                    taux = 37;
                else if (salaireBrutAnuel<300_200)
                    taux = 45;
                else
                    taux = 47;
                return salaireBrutAnuel*taux/100;
            }
        };
    }

    public static void main(String[] args) {
        Employe employe = new Employe("OK123", 8000);
        employe.setImpotRevenu(maroc);
        System.out.println("Au Maroc avec un salaire brut mensuel de " +
                employe.getSalaireBrutMensuel() +
                " , le salarié aura un salaire net mensuel de : " +
                employe.getSalaireNetMensuel());
        System.out.println("********************************");
        employe.setImpotRevenu(dz);
        System.out.println("En Algérie avec un salaire brut mensuel de " +
                employe.getSalaireBrutMensuel() +
                " , le salarié aura un salaire net mensuel de : " +
                employe.getSalaireNetMensuel());
        System.out.println("********************************");
        employe.setImpotRevenu(spain);
        System.out.println("En Espagne avec un salaire brut mensuel de " +
                employe.getSalaireBrutMensuel() +
                " , le salarié aura un salaire net mensuel de : " +
                employe.getSalaireNetMensuel());
        System.out.println("********************************");
        System.out.println("////////////////////////////////");

        employe.setSalaireBrutMensuel(3500);
        employe.setImpotRevenu(maroc);
        System.out.println("Au Maroc avec un salaire brut mensuel de " +
                employe.getSalaireBrutMensuel() +
                " , le salarié aura un salaire net mensuel de : " +
                employe.getSalaireNetMensuel());
        System.out.println("********************************");
        employe.setImpotRevenu(dz);
        System.out.println("En Algérie avec un salaire brut mensuel de " +
                employe.getSalaireBrutMensuel() +
                " , le salarié aura un salaire net mensuel de : " +
                employe.getSalaireNetMensuel());
        System.out.println("********************************");
        employe.setImpotRevenu(spain);
        System.out.println("En Espagne avec un salaire brut mensuel de " +
                employe.getSalaireBrutMensuel() +
                " , le salarié aura un salaire net mensuel de : " +
                employe.getSalaireNetMensuel());
        System.out.println("********************************");

        System.out.println("////////////////////////////////");

        employe.setSalaireBrutMensuel(20000);
        employe.setImpotRevenu(maroc);
        System.out.println("Au Maroc avec un salaire brut mensuel de " +
                employe.getSalaireBrutMensuel() +
                " , le salarié aura un salaire net mensuel de : " +
                employe.getSalaireNetMensuel());
        System.out.println("********************************");
        employe.setImpotRevenu(dz);
        System.out.println("En Algérie avec un salaire brut mensuel de " +
                employe.getSalaireBrutMensuel() +
                " , le salarié aura un salaire net mensuel de : " +
                employe.getSalaireNetMensuel());
        System.out.println("********************************");
        employe.setImpotRevenu(spain);
        System.out.println("En Espagne avec un salaire brut mensuel de " +
                employe.getSalaireBrutMensuel() +
                " , le salarié aura un salaire net mensuel de : " +
                employe.getSalaireNetMensuel());
        System.out.println("********************************");


    }
}