package com.jane.utils.number;

import android.annotation.SuppressLint;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Jane
 * @date :   2022/3/9 4:27 下午
 * @desc :   数字处理工具类
 */
public class NumberUtils {

    /**
     * 求最大值
     * @param integers
     * @return
     */
    public static int max(Integer ... integers){
        int x = 0;
        for (int i = 0; i < integers.length; i++) {
            x = Math.max(integers[i], x);
        }
        return x;
    }

    /**
     * 求最大值
     * @param integers
     * @return
     */
    public static int max(List<Integer> integers){
        int x = 0;
        for (int i = 0; i < integers.size(); i++) {
            x = Math.max(integers.get(i), x);
        }
        return x;
    }

    /**
     * 求最大值
     * @param integers
     * @return
     */
    public static int max(ArrayList<Integer> integers){
        int x = 0;
        for (int i = 0; i < integers.size(); i++) {
            x = Math.max(integers.get(i), x);
        }
        return x;
    }

    /**
     * 求最小值
     * @param integers
     * @return
     */
    public static int min(Integer ... integers){
        int x = 0;
        for (int i = 0; i < integers.length; i++) {
            x = Math.min(integers[i], x);
        }
        return x;
    }

    /**
     * 求最小值
     * @param integers
     * @return
     */
    public static int min(List<Integer> integers){
        int x = 0;
        for (int i = 0; i < integers.size(); i++) {
            x = Math.min(integers.get(i), x);
        }
        return x;
    }

    /**
     * 求最小值
     * @param integers
     * @return
     */
    public static int min(ArrayList<Integer> integers){
        int x = 0;
        for (int i = 0; i < integers.size(); i++) {
            x = Math.min(integers.get(i), x);
        }
        return x;
    }

    /**
     * 保留两位小数
     *
     * @param value
     * @return
     */
    @SuppressLint("DefaultLocale")
    public static String keep2Dec(int value) {
        if (value == 0) {
            return "0.00";
        }
        return String.format("%.2f", value);
    }
}
