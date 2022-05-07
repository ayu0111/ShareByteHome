package com.offcn.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CookieUtils {
    //将日期转为字符串
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");

    public static String dateToString(Date date){
        return sdf.format(date);
    }

}
