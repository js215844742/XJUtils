package com.jane.utils.android;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import java.lang.reflect.InvocationTargetException;

/**
 * @author  : Jane
 * @date    :   2022/1/23
 * @desc    :   {类描述}
 */
public class AppUtils {

    private static Application mApplication;

    public static void init(Context context) {
        if (context == null) {
            init(getApplicationByReflect());
            return;
        }
        init((Application) context.getApplicationContext());
    }

    public static void init(Application application) {
        if (mApplication == null) {
            if (application == null) {
                init(getApplicationByReflect());
            } else {
                mApplication = application;
            }
        }
    }

    public static Application getApp() {
        if (mApplication != null) return mApplication;
        throw new NullPointerException("u should init first");
    }

    public static Context getAppContext() {
        if (mApplication != null) return mApplication.getApplicationContext();
        throw new NullPointerException("u should init first");
    }

    private static Application getApplicationByReflect() {
        try {
            @SuppressLint("PrivateApi")
            Class<?> activityThread = Class.forName("android.app.ActivityThread");
            Object thread = activityThread.getMethod("currentActivityThread").invoke(null);
            Object app = activityThread.getMethod("getApplication").invoke(thread);
            if (app == null) {
                throw new NullPointerException("u should init first");
            }
            return (Application) app;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new NullPointerException("u should init first");
    }
}