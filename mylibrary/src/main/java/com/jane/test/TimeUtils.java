package com.jane.test;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * @author : Jane
 * @date :   2022/2/18 2:36 下午
 * @desc :   {类描述}
 */
public class TimeUtils {

    public static final String FORMATE_YY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static final String FORMATE_YY年MM月DD日HH_MM_SS = "yyyy年MM月dd日 HH:mm:ss";
    public static final String FORMATE_YY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";
    public static final String FORMATE_YY年MM月DD日HH_MM = "yyyy年MM月dd日 HH:mm";
    public static final String FORMATE_YY_MM_DD = "yyyy-MM-dd";
    public static final String FORMATE_YY年MM月DD日 = "yyyy年MM月dd日";

    private static final ThreadLocal<SimpleDateFormat> SDF_THREAD_LOCAL = new ThreadLocal<>();

    private static SimpleDateFormat getDefaultFormat() {
        SimpleDateFormat simpleDateFormat = SDF_THREAD_LOCAL.get();
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat(FORMATE_YY_MM_DD_HH_MM_SS, Locale.getDefault());
            SDF_THREAD_LOCAL.set(simpleDateFormat);
        }
        return simpleDateFormat;
    }

    public static String s () {

        return "";
    }
}
