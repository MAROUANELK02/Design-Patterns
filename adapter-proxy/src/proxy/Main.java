package proxy;

public class Main {
    public static void main(String[] args) {
        SecurityContext.authenticate("user1", "1234","root");
        Context context = new Context();
        //context.setService(new SecurityProxy());
        context.setService(new CacheProxy());
        context.compute(3);
        context.compute(4);
        context.compute(8);
        context.compute(4);
    }
}