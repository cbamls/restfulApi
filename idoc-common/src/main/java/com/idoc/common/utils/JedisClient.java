package com.idoc.common.utils;

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
public interface JedisClient {
    String get(String key);
    String set(String key, String value);
    String set(String key, String value, Integer seconds);
    String hget(String hkey, String key);
    Long hset(String hkey, String key, String value);
    Long incr(String key);
    Long decr(String key);
    Long expire(String key, int second);
    Long ttl(String key);
    Long del(String key);
    Long hdel(String hkey, String key);
}
