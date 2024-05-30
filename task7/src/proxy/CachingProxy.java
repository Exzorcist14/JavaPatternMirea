package proxy;

import java.util.HashMap;
import java.util.Map;

public class CachingProxy implements Website{
    private final RealWebsite website = new RealWebsite();
    private Map<String, String> cache = new HashMap<>();

    @Override
    public String getAnswer(String request) {
        if(cache.get(request)==null){
            var result = website.getAnswer(request);
            cache.put(request, result);
            return result;
        }else{
            return cache.get(request);
        }
    }
}
