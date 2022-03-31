package com.jane.utils.xj;

/**
 * @author : Jane
 * @date :   2022/3/9 4:27 下午
 * @desc :   空判断工具类
 */
public class NullUtils {

    private NullUtils () {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean notNull (String strValue) {
        return !isNull(strValue);
    }

    public static boolean isNull (String strValue) {
        return StringUtils.isEmpty(strValue);
    }

    public static boolean notNull (int value) {
        return !isNull(value);
    }

    public static boolean isNull (int value) {
        return false;
    }

    public static boolean notNull (Integer value) {
        return !isNull(value);
    }

    public static boolean isNull (Integer value) {
        return value==null;
    }

    public static boolean notNull (Long value) {
        return !isNull(value);
    }

    public static boolean isNull (Long value) {
        return value==null;
    }

    public static boolean notNull (long value) {
        return !isNull(value);
    }

    public static boolean isNull (long value) {
        return false;
    }

    public static boolean notNull (Object value) {
        return !isNull(value);
    }

    public static boolean isNull (Object value) {
        return value==null;
    }

}
