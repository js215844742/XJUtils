package com.jane.utils.android;

import android.app.Activity;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author : Jane
 * @date :   2022/4/6 11:01 上午
 * @desc :   activity管理
 */
public class ActivityManager {

    private Stack<Activity> activityStack; // 保存activity的栈
    private static ActivityManager instance; // 当前类的实例

    public static ActivityManager getInstance() {
        if (instance == null) {
            instance = new ActivityManager();
        }
        return instance;
    }

    public ActivityManager() {
        initActivityStack();
    }

    public void initActivityStack() {
        if (activityStack == null) {
            activityStack = new Stack<>();
        }
    }

    /**
     * 获取activity任务栈
     * @return
     */
    public Stack<Activity> getActivityStack() {
        return activityStack;
    }

    /**
     * 添加activity
     * 入栈
     * @param activity
     */
    public void addActivity(Activity activity) {
        initActivityStack();
        if (activity != null) {
            activityStack.add(activity);
        }
    }

    /**
     * 移除activity
     * 出栈
     * @param activity
     */
    public void removeActivity(Activity activity) {
        initActivityStack();
        if (activity != null) {
            activityStack.remove(activity);
        }
    }

    /**
     * 关闭activity
     */
    public void finishActivity() {
        if (activityStack == null) {
            return;
        }
        finishActivity(activityStack.lastElement());
    }

    /**
     * 关闭activity
     * @param activity
     */
    public void finishActivity(Activity activity) {
        if (activity == null) {
            return;
        }
        if (activityStack != null) {
            activityStack.remove(activity);
        }
        activity.finish();
    }

    public void finishActivity(Class<?> cls) {
        try {
            for (Activity activity : activityStack) {
                if (activity.getClass().equals(cls)) {
                    finishActivity(activity);
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 结束所有Activity
     */
    public void finishAllActivity() {
        try {
            for (int i = 0, size = activityStack.size(); i < size; i++) {
                if (null != activityStack.get(i)) {
                    activityStack.get(i).finish();
                }
            }
            activityStack.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 移除固定activity之外的所有activity
     *
     * @param cls 固定activity
     */
    public void finishAllActivityExcept(Class<?> cls) {
        try {
            Iterator<Activity> iterable = activityStack.iterator();
            while (iterable.hasNext()) {
                Activity tactivity = iterable.next();
                if (!tactivity.getClass().equals(cls)) {
                    tactivity.finish();
                    iterable.remove();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 移除固定activity之外的所有activity
     *
     * @param activity 固定activity
     */
    public void finishAllActivityExcept(Activity activity) {
        try {
            Iterator<Activity> iterable = activityStack.iterator();
            while (iterable.hasNext()) {
                Activity tactivity = iterable.next();
                if (tactivity != activity) {
                    tactivity.finish();
                    iterable.remove();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 当前activity
     * @return
     */
    public Activity getCurrentActivity() {
        return activityStack.lastElement();
    }

    /**
     * 获取指定activity
     * @param cls
     * @return
     */
    public Activity getActivity(Class<?> cls) {
        Activity activity = null;
        try {
            for (Activity a : activityStack) {
                if (a.getClass().equals(cls)) {
                    activity = a;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return activity;
    }

    /**
     * 获取指定activity
     * @param activityName
     * @return
     */
    public Activity getActivity(String activityName) {
        try {
            for (Activity a : activityStack) {
                if (a.getClass().getSimpleName().equals(activityName)) {
                    return a;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
