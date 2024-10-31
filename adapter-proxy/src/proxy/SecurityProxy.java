package proxy;

public class SecurityProxy implements IService{
    private IService service = new IServiceImpl();

    @Override
    public double compute(int v) {
        if(SecurityContext.role.equals("root")) {
            return service.compute(v);
        } else {
            throw new RuntimeException("Not authorized");
        }
    }
}
