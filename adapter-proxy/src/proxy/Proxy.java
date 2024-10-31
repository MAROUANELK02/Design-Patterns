package proxy;

public class Proxy implements IService {
    private IService service = new IServiceImpl();

    @Override
    public double compute(int v) {
        System.out.println("Proxy implementation");
        double res = service.compute(v);
        System.out.println("Proxy after implementation");
        return res;
    }
}
