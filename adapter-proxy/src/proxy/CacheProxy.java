package proxy;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements IService{
    private Map<Integer, Double> cache = new HashMap<>();
    private IService service = new IServiceImpl();

    @Override
    public double compute(int parameter) {
        Double cacheValue = cache.get(parameter);
        if(cacheValue!=null) {
            System.out.println(".... cache result ......");
            return cacheValue;
        }
        else {
            double res = service.compute(parameter);
            cache.put(parameter, res);
            System.out.println(" ------- New Computing result ----");
            return res;
        }
    }
}
