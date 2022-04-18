package com.jane.utils.xj;

/**
 * @author : Jane
 * @date :   2022/3/9 4:33 下午
 * @desc :   String字符串工具类
 */
public class StringUtils {

    private StringUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean isEmpty(String s) {
        return s == null || s.isEmpty() || "null".equals(s);
    }

    public static boolean isEmpty(CharSequence s) {
        return s == null || s.length() == 0 || "null".contentEquals(s);
    }

    public static boolean isTrimEmpty(final String s) {
        return (s == null || s.trim().length() == 0);
    }

    public static boolean isSpace(final String s) {
        if (s == null) return true;
        for (int i = 0, len = s.length(); i < len; ++i) {
            if (!Character.isWhitespace(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
