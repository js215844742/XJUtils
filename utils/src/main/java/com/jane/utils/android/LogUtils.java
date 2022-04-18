package com.jane.utils.android;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.jane.utils.BuildConfig;
import com.jane.utils.xj.NullUtils;
import com.jane.utils.xj.StringUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : Jane
 * @date :   2022/3/10 5:50 下午
 * @desc :   Log打印工具类，支持json数据格式化
 */
public class LogUtils {

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    private static String LOG_START = "╔══════════════════════════════════════════════════start══════════════════════════════════════════════════";

    private static String LOG_CENTER = "║ ";

    private static String LOG_END = "╚═══════════════════════════════════════════════════end═══════════════════════════════════════════════════";

    private static String prefix = AppUtils.getAppName() + "————" + AppUtils.getAppVersionName();

    private static boolean showLog = BuildConfig.DEBUG;



    // v 打印 ══════════════════════════════════════════════
    public static void v(Object o) {
        v(prefix, o);
    }

    public static void v(String tag, Object o) {
        v(tag, o, false);
    }

    public static void v(String tag, Object o, boolean showLine) {
        if (tag == null) {
            tag = prefix;
        } else if (!tag.contains(prefix)) {
            tag = prefix + "————" + tag;
        }
        String str = getString(o);
        if (showLog) {
            Log.v(tag, str);
        }
    }

    public static void vJson(String jsonStr) {
        vJson(jsonStr, "");
    }

    public static void vJson(String jsonStr, String headerStr) {
        String message;
        try {
            if (jsonStr.startsWith("{")) {
                JSONObject jsonObject = new JSONObject(jsonStr);
                message = jsonObject.toString(4);
            } else if (jsonStr.startsWith("[")) {
                JSONArray jsonArray = new JSONArray(jsonStr);
                message = jsonArray.toString(4);
            } else {
                message = jsonStr;
            }
        } catch (JSONException e) {
            message = jsonStr;
        }
        v(LOG_START);
        if (NullUtils.notNull(headerStr)) {
            message = headerStr + LINE_SEPARATOR + message;
        }
        String [] lines = message.split(LINE_SEPARATOR);
        for (String line : lines) {
            v(LOG_CENTER + line);
        }
        v(LOG_END);
    }

    // d 打印 ══════════════════════════════════════════════
    public static void d(Object o) {
        d(prefix, o);
    }

    public static void d(String tag, Object o) {
        d(tag, o, false);
    }

    public static void d(String tag, Object o, boolean showLine) {
        if (tag == null) {
            tag = prefix;
        } else if (!tag.contains(prefix)) {
            tag = prefix + "————" + tag;
        }
        String str = getString(o);
        if (showLog) {
            Log.d(tag, str);
        }
    }

    public static void dJson(String jsonStr) {
        dJson(jsonStr, "");
    }

    public static void dJson(String jsonStr, String headerStr) {
        String message;
        try {
            if (jsonStr.startsWith("{")) {
                JSONObject jsonObject = new JSONObject(jsonStr);
                message = jsonObject.toString(4);
            } else if (jsonStr.startsWith("[")) {
                JSONArray jsonArray = new JSONArray(jsonStr);
                message = jsonArray.toString(4);
            } else {
                message = jsonStr;
            }
        } catch (JSONException e) {
            message = jsonStr;
        }
        d(LOG_START);
        if (NullUtils.notNull(headerStr)) {
            message = headerStr + LINE_SEPARATOR + message;
        }
        String [] lines = message.split(LINE_SEPARATOR);
        for (String line : lines) {
            d(LOG_CENTER + line);
        }
        d(LOG_END);
    }


    // i 打印 ══════════════════════════════════════════════
    public static void i(Object o) {
        i(prefix, o);
    }

    public static void i(String tag, Object o) {
        i(tag, o, false);
    }

    public static void i(String tag, Object o, boolean showLine) {
        if (tag == null) {
            tag = prefix;
        } else if (!tag.contains(prefix)) {
            tag = prefix + "————" + tag;
        }
        String str = getString(o);
        if (showLog) {
            Log.i(tag, str);
        }
    }

    public static void iJson(String jsonStr) {
        iJson(jsonStr, "");
    }

    public static void iJson(String jsonStr, String headerStr) {
        String message;
        try {
            if (jsonStr.startsWith("{")) {
                JSONObject jsonObject = new JSONObject(jsonStr);
                message = jsonObject.toString(4);
            } else if (jsonStr.startsWith("[")) {
                JSONArray jsonArray = new JSONArray(jsonStr);
                message = jsonArray.toString(4);
            } else {
                message = jsonStr;
            }
        } catch (JSONException e) {
            message = jsonStr;
        }
        i(LOG_START);
        if (NullUtils.notNull(headerStr)) {
            message = headerStr + LINE_SEPARATOR + message;
        }
        String [] lines = message.split(LINE_SEPARATOR);
        for (String line : lines) {
            i(LOG_CENTER + line);
        }
        i(LOG_END);
    }


    // w 打印 ══════════════════════════════════════════════
    public static void w(Object o) {
        w(prefix, o);
    }

    public static void w(String tag, Object o) {
        w(tag, o, false);
    }

    public static void w(String tag, Object o, boolean showLine) {
        if (tag == null) {
            tag = prefix;
        } else if (!tag.contains(prefix)) {
            tag = prefix + "————" + tag;
        }
        String str = getString(o);
        if (showLog) {
            Log.w(tag, str);
        }
    }

    public static void wJson(String jsonStr) {
        wJson(jsonStr, "");
    }

    public static void wJson(String jsonStr, String headerStr) {
        String message;
        try {
            if (jsonStr.startsWith("{")) {
                JSONObject jsonObject = new JSONObject(jsonStr);
                message = jsonObject.toString(4);
            } else if (jsonStr.startsWith("[")) {
                JSONArray jsonArray = new JSONArray(jsonStr);
                message = jsonArray.toString(4);
            } else {
                message = jsonStr;
            }
        } catch (JSONException e) {
            message = jsonStr;
        }
        w(LOG_START);
        if (NullUtils.notNull(headerStr)) {
            message = headerStr + LINE_SEPARATOR + message;
        }
        String [] lines = message.split(LINE_SEPARATOR);
        for (String line : lines) {
            w(LOG_CENTER + line);
        }
        w(LOG_END);
    }


    // e 打印 ══════════════════════════════════════════════
    public static void e(Object o) {
        e(prefix, o);
    }

    public static void e(String tag, Object o) {
        e(tag, o, false);
    }

    public static void e(String tag, Object o, boolean showLine) {
        if (tag == null) {
            tag = prefix;
        } else if (!tag.contains(prefix)) {
            tag = prefix + "————" + tag;
        }
        String str = getString(o);
        if (showLog) {
            Log.e(tag, str);
        }
    }

    public static void eJson(String jsonStr) {
        eJson(jsonStr, "");
    }

    public static void eJson(String jsonStr, String headerStr) {
        String message;
        try {
            if (jsonStr.startsWith("{")) {
                JSONObject jsonObject = new JSONObject(jsonStr);
                message = jsonObject.toString(4);
            } else if (jsonStr.startsWith("[")) {
                JSONArray jsonArray = new JSONArray(jsonStr);
                message = jsonArray.toString(4);
            } else {
                message = jsonStr;
            }
        } catch (JSONException e) {
            message = jsonStr;
        }
        e(LOG_START);
        if (NullUtils.notNull(headerStr)) {
            message = headerStr + LINE_SEPARATOR + message;
        }
        String [] lines = message.split(LINE_SEPARATOR);
        for (String line : lines) {
            e(LOG_CENTER + line);
        }
        e(LOG_END);
    }


    /**
     * 输入日志到文件
     *
     * @param logFileName 输出的
     */
    public static void file(@Nullable Object o, @NonNull String logFileName, Context context) {
        File file = new File(context.getExternalFilesDir("Log"), logFileName);
        String str = getString(o);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            str = simpleDateFormat.format(new Date(System.currentTimeMillis())) + "\n" + str + "\n\n";
            byte[] bytes = str.getBytes();
            fileOutputStream.write(bytes);
        } catch (FileNotFoundException e) {
            e(Log.getStackTraceString(e));
        } catch (IOException e) {
            e(Log.getStackTraceString(e));
        }
    }

    private static String getString(Object o) {
        String str;
        if (null == o) str = "null";
        else if (o instanceof Throwable) str = Log.getStackTraceString((Throwable) o);
        else str = String.valueOf(o);
        return str;
    }
}


