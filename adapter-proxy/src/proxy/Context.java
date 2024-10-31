package proxy;

public class Context {
    private IService service;

    public void compute(int v) {
        System.out.println("============");
        double result = service.compute(v);
        System.out.println("Result => " + result);
        System.out.println("============");
    }

    public void setService(IService service) {
        this.service = service;
    }
}
