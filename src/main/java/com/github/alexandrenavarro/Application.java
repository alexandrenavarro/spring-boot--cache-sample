package com.github.alexandrenavarro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Created by anavarro on 26/10/16.
 */
@SpringBootApplication
@EnableCaching
public class Application {


    @Bean
    public Cache cache() {
        return new Cache();
    }

    @Bean
    public CacheClient cacheClient(Cache cache) {
        return new CacheClient(cache);
    }


    @Bean
    public CacheManager cacheManager() {
        final SimpleCacheManager cacheManager = new SimpleCacheManager();
        cacheManager.setCaches(Arrays.asList(
                new NoOpCache("bar"),
                new ConcurrentMapCache("foo")));
        return cacheManager;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
