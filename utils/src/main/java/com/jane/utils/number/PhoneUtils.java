package com.jane.utils.number;

import com.jane.utils.xj.NullUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : Jane
 * @date :   2022/3/10 4:35 下午
 * @desc :   手机号码工具类
 */
public class PhoneUtils {

    /**
     * 校验手机号是否为手机号码
     */
    private final static Pattern P_PHONE = Pattern.compile("(?:0|86|\\+86)?1[0123456789]\\d{9}");

    public static boolean isPhone(String phone) {
        if (NullUtils.notNull(phone)) {
            Matcher m = P_PHONE.matcher(phone);
            return m.matches();
        } else {
            return false;
        }
    }

    /**
     * 手机号加密
     * 展示首尾，中间以"***"代替
     * @param number
     * @return
     */
    public static String phoneEncrypt(String number) {
        if (number.length() != 11) {
            return number;
        }
        number = number.substring(0, 3) + "****" + number.substring(number.length() - 4, number.length());
        return number;
    }
}
