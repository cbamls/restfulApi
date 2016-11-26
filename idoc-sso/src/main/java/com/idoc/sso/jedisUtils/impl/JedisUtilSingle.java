package com.idoc.sso.jedisUtils.impl;


import com.idoc.sso.jedisUtils.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisUtilSingle implements JedisUtil {

    @Autowired
    private JedisPool jedisPool;

    @Override
    public String get(String key) {
        Jedis jedis=jedisPool.getResource();
        String result=jedis.get(key);
        return result;
    }

    @Override
    public String set(String key, String value) {
        Jedis jedis=jedisPool.getResource();
        String result=jedis.set(key, value);
        return result;
    }

    @Override
    public String hget(String hkey, String key) {
        Jedis jedis=jedisPool.getResource();
        String result=jedis.hget(hkey, key);
        return result;
    }

    @Override
    public long hset(String hkey, String key, String value) {
        Jedis jedis=jedisPool.getResource();
        Long result = jedis.hset(hkey, key, value);
        return result;
    }

    @Override
    public long incr(String key) {
        Jedis jedis=jedisPool.getResource();
        Long result = jedis.incr(key);
        return result;
    }

    @Override
    public long decr(String key) {
        Jedis jedis=jedisPool.getResource();
        Long result = jedis.decr(key);
        return result;
    }

    @Override
    public long expire(String key, int second) {
        Jedis jedis=jedisPool.getResource();
        Long result = jedis.expire(key, second);
        return result;
    }

    @Override
    public long ttl(String key) {
        Jedis jedis=jedisPool.getResource();
        Long result = jedis.ttl(key);
        return result;
    }

    @Override
    public long del(String key) {
        Jedis jedis=jedisPool.getResource();
        Long result = jedis.del(key);
        return result;
    }

    @Override
    public long hdel(String hkey, String key) {
        Jedis jedis=jedisPool.getResource();
        Long result = jedis.hdel(hkey, key);
        return result;
    }
}
