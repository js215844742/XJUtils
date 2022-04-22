package com.jane.utils.android;

import android.content.Context;
import android.content.SharedPreferences;

import com.jane.utils.xj.NullUtils;

import java.io.Serializable;
import java.util.Set;

/**
 * @author : Jane
 * @date :   2022/4/20 2:53 下午
 * @desc :   SharePreference工具类，保存本地数据
 */
public class SharedPreferenceUtils {

    static String APP_NAME = AppUtils.getAppName();

    static SharedPreferences sharedPreferences;
    static SharedPreferences.Editor editor;

    public static SharedPreferences getSharedPreferences() {
        if (sharedPreferences == null) {
            sharedPreferences = AppUtils.getAppContext().getSharedPreferences(APP_NAME, Context.MODE_PRIVATE);
        }
        return sharedPreferences;
    }

    public static SharedPreferences.Editor getInstance() {
        if (editor == null) {
            editor = getSharedPreferences().edit();
        }
        return editor;
    }

    public static void save(String key, String value){
        getInstance().putString(key, value);
        commit();
    }

    public static void save(String key, Integer value){
        getInstance().putInt(key, value);
        commit();
    }

    public static void save(String key, int value){
        getInstance().putInt(key, value);
        commit();
    }

    public static void save(String key, Long value){
        getInstance().putLong(key, value);
        commit();
    }

    public static void save(String key, long value){
        getInstance().putLong(key, value);
        commit();
    }

    public static void save(String key, Boolean value){
        getInstance().putBoolean(key, value);
        commit();
    }

    public static void save(String key, boolean value){
        getInstance().putBoolean(key, value);
        commit();
    }

    public static void save(String key, Float value){
        getInstance().putFloat(key, value);
        commit();
    }

    public static void save(String key, float value){
        getInstance().putFloat(key, value);
        commit();
    }

    public static void save(String key, Set<String> value) {
        getInstance().putStringSet(key, value);
        commit();
    }

    public static String getString(String key) {
        return getString(key, "");
    }

    public static String getString(String key, String defalt) {
        if (NullUtils.notNull(key)) {
            getSharedPreferences().getString(key, defalt);
        }
        return "";
    }

    public static int getInt(String key) {
        return getInt(key, 0);
    }

    public static int getInt(String key, int defalt) {
        if (NullUtils.notNull(key)) {
            getSharedPreferences().getInt(key, defalt);
        }
        return 0;
    }

    public static long getLong(String key) {
        return getLong(key, 0);
    }

    public static long getLong(String key, long defalt) {
        if (NullUtils.notNull(key)) {
            getSharedPreferences().getLong(key, defalt);
        }
        return 0;
    }

    public static float getFloat(String key) {
        return getFloat(key, 0);
    }

    public static float getFloat(String key, float defalt) {
        if (NullUtils.notNull(key)) {
            getSharedPreferences().getFloat(key, defalt);
        }
        return 0;
    }

    public static boolean commit() {
        return getInstance().commit();
    }

    public static void apply() {
        getInstance().apply();
    }

    public static void clear(String key) {
        getInstance().remove(key);
    }

    public static void clear(String ... key) {
        for (int i = 0; i < key.length; i++) {
            getInstance().remove(key[i]);
        }
    }

    public static void clear() {
        getInstance().clear();
    }

}
