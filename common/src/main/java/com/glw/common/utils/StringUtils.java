package com.glw.common.utils;

/**
 * @author : glw
 * @date : 2020/4/12
 * @time : 18:02
 * @Description : 字符串处理工具类
 */
public class StringUtils {

    public static boolean isEmpty(Object str) {
        return str == null || "".equals(str);
    }

    public static boolean isNotEmpty(Object str) {
        return !isEmpty(str);
    }

    public static boolean hasLength(CharSequence str) {
        return str != null && str.length() > 0;
    }

    public static boolean hasLength(String str) {
        return str != null && !str.isEmpty();
    }
}
