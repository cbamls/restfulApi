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
public interface JedisCallback<T, E> {
    T doJedisCallbak(E e);
}
