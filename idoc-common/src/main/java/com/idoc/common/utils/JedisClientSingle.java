package com.idoc.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * CopyRright (c)2014-2016 Haerbin Hearglobal Co.,Ltd
 * Project: idoc-parent
 * Comments:
 * Author:cbam
 * Create Date:2016/12/9
 * Modified By:
 * Modified Date:
 * Modified Reason:
 */
public class JedisClientSingle implements JedisClient {
    /**
     * 有些系统可能不需要添加redis缓存，反而依赖了common项目，但是自己容器内又没有对redis做相应配置,
     * 故 required = false 这样就可以做到，容器内有则注入，没有就忽略
     */
    @Autowired(required = false)
    private JedisPool jedisPool;

    private <T> T excute(JedisCallback<T, Jedis> jedisJedisCallback) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedisJedisCallback.doJedisCallbak(jedis);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(jedis != null) {
                jedis.close();
            }
        }
        return null;
    }
    @Override
    public String get(String key) {
        return this.excute((jedis) -> {return jedis.get(key); });
    }

    @Override
    public String set(String key, String value) {
        return this.excute((jedis) -> { return jedis.set(key, value); });
    }

    @Override
    public String set(String key, String value, Integer seconds) {
        return this.excute((jedis) -> {return jedis.setex(key, seconds, value); });
    }

    @Override
    public String hget(String hkey, String key) {
        return this.excute((jedis) -> {return jedis.hget(hkey, key);});
    }

    @Override
    public Long hset(String hkey, String key, String value) {
        return this.excute(new JedisCallback<Long, Jedis>() {
            @Override
            public Long doJedisCallbak(Jedis jedis) {
                return jedis.hset(hkey, key, value);
            }
        });
    }

    @Override
    public Long incr(String key) {
        return this.excute((jedis) -> {return jedis.incr(key); });
    }

    @Override
    public Long decr(String key) {
       return this.excute((jedis) -> {return jedis.decr(key); });
    }

    @Override
    public Long expire(String key, int second) {
        return this.excute((jedis) -> {return jedis.expire(key, second); });
    }

    @Override
    public Long ttl(String key) {
        return this.excute((jedis) -> {return jedis.ttl(key); });
    }

    @Override
    public Long del(String key) {
        return this.excute((jedis) -> {return del(key);});
    }

    @Override
    public Long hdel(String hkey, String key) {
        return this.excute((jedis) -> {return jedis.hdel(hkey, key);});
    }
}
