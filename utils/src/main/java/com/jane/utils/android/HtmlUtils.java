package com.jane.utils.android;

import android.text.Html;
import android.text.Spanned;

/**
 * @author : Jane
 * @date :   2022/4/12 5:12 下午
 * @desc :   {类描述}
 */
public class HtmlUtils {

    /**
     * 将带有html标签的字符串转化为可以直接正常展示的
     * @param htmlStr
     * @return
     */
    public static Spanned form(String htmlStr){
        return Html.fromHtml("");
    }



}
