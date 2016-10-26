package com.github.alexandrenavarro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

/**
 * Created by anavarro on 26/10/16.
 */


public class CacheClient  implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(CacheClient.class);

    private Cache cache;

    public CacheClient(final Cache cache) {
        this.cache = cache;
    }


    @Override
    public void run(String... strings) throws Exception {
        log.info("get(1):{}", this.cache.get("1"));
        log.info("get(1):{}", this.cache.get("1"));
        log.info("get(2):{}", this.cache.get("2"));
        log.info("get(2):{}", this.cache.get("2"));



    }
}
