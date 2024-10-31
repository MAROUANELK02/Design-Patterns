package proxy;

public class IServiceImpl implements IService {
    @Override
    public double compute(int v) {
        return v*32;
    }
}
