package org.well.coolwearher.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by zz on 2017/7/10.
 */

public class HttpUtil {
    /*
    HTTP请求
    address: 请求地址
    调用回调处理服务器响应
     */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client =new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
