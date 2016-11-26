package JedisTest;

import com.idoc.sso.jedisUtils.JedisUtil;
import com.idoc.sso.jedisUtils.impl.JedisUtilSingle;

/**
 * CopyRright (c)2014-2016 Haerbin Hearglobal Co.,Ltd
 * Project: idoc-parent
 * Comments:
 * Author:cbam
 * Create Date:2016/11/25
 * Modified By:
 * Modified Date:
 * Modified Reason:
 */
public class JedisTest {
    public static void main(String[] args) {
        JedisUtilSingle jedisUtilSingle = new JedisUtilSingle();
        jedisUtilSingle.set("key", "cbam");
        String target = jedisUtilSingle.get("key");
        System.out.println(target);
    }
}
