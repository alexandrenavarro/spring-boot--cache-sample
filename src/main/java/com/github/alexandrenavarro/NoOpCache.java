package com.github.alexandrenavarro;

import java.util.concurrent.Callable;

/**
 * Created by anavarro on 26/10/16.
 */
public class NoOpCache implements org.springframework.cache.Cache {
        private final String name;

        public NoOpCache(String name) {
            this.name = name;
        }

        public void clear() {
        }

        public void evict(Object key) {
        }

        public org.springframework.cache.Cache.ValueWrapper get(Object key) {
            return null;
        }

        public <T> T get(Object key, Class<T> type) {
            return null;
        }

        public <T> T get(Object key, Callable<T> valueLoader) {
            try {
                return valueLoader.call();
            } catch (Exception var4) {
                throw new org.springframework.cache.Cache.ValueRetrievalException(key, valueLoader, var4);
            }
        }

        public String getName() {
            return this.name;
        }

        public Object getNativeCache() {
            return null;
        }

        public void put(Object key, Object value) {
        }

        public org.springframework.cache.Cache.ValueWrapper putIfAbsent(Object key, Object value) {
            return null;
        }

}
