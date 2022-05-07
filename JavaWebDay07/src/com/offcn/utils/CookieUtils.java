package com.offcn.utils;

import javax.servlet.http.Cookie;

public class CookieUtils {
    public static Cookie findCookie(Cookie [] cs,String p){
        if (cs != null){
            for (Cookie cook : cs) {
                if (p.equals(cook.getName())){
                    //此时包含cookie  访问product  不确定访问的是那个商品
                    return cook;
                }
            }
        }
        return null;
    }
}
