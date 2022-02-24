package br.com.rocketseat.ex.interceptor;

import java.util.HashMap;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class RateLimiter {
    private HashMap<String, Integer> map = new HashMap<>();

    public boolean validate(String key, int max) {
        int current = map.getOrDefault(key, 0);
        if(current >= max) {
            return false;
        }
        map.put(key, current+1);
        return true;
    }
}