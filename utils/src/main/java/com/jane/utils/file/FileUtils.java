package com.jane.utils.file;

import com.jane.utils.android.AppUtils;

/**
 * @author : Jane
 * @date :   2022/4/18 3:39 下午
 * @desc :   文件管理类
 */
public class FileUtils {

    private static String PACKAGE = AppUtils.getAppName();
    private static String PATH_CACHE = "cache";
    private static String PATH_IMAGE = "image";
    private static String PATH_DOWNLOAD = "download";
    private static String PATH_LOG = "log";

    public FileUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private void createFile() {

    }

    public static String getFilePath() {

        return "";
    }

    public static void clearFile() {

    }
}
