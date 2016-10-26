package com.github.alexandrenavarro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;

/**
 * Created by anavarro on 26/10/16.
 */

public class Cache {

    private static final Logger log = LoggerFactory.getLogger(Cache.class);

    @Cacheable("foo")
    public String get(String s) {
        log.info("real get:{}", s);
        return "echo " + s;
    }

}
