package org.oursight.learning.guava.cache;

import java.util.concurrent.ExecutionException;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

/**
 * Created by yaonengjun on 2019/7/3 下午3:09.
 */
public class CacheLoaderDemo {

    public static void main(String[] args) throws ExecutionException {

        LoadingCache<Integer, String> cache = CacheBuilder.newBuilder()
            .build(new CacheLoader<Integer, String>() {
                @Override
                public String load(Integer key) throws Exception {
                    if (key % 3 == 0) {
                        String value = key.toString();
                        System.out.printf("cache found, key:%d, value:%s\n\n", key,value);
                        return value;
                    }

                    System.out.printf("cache not found, key:%d\n\n", key);
                    return null;
                }
            });


        System.out.println(cache.get(0));
        System.out.println(cache.get(1));
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));


    }
}
