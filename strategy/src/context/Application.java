package context;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Context ctx=new Context();
        System.out.println("Stratégie 1:");
        ctx.setStrategy(new StrategyImpl1());
        ctx.appliquerStrategy();
        System.out.println("Stratégie 2:");
        ctx.setStrategy(new StrategyImpl2());
        ctx.appliquerStrategy();
        System.out.println("Stratégie 3:");
        ctx.setStrategy(new StrategyImpl3());
        ctx.appliquerStrategy();

        Scanner clavier=new Scanner(System.in);
        while(true){
            System.out.print("Quelle stratégie:");
            String nomStrategy=clavier.next();
            if(nomStrategy.equals("quit")) break;
            try {
                Class c=Class.forName("context." + nomStrategy);
                Strategy strategy=(Strategy) c.newInstance();
                ctx.setStrategy(strategy);
                ctx.appliquerStrategy();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Stratégy Innexistante.." + e.getMessage());
            }
        }
    }
}
