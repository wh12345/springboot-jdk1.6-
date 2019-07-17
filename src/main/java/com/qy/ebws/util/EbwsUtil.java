package com.qy.ebws.util;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Because of you on 2019/7/16.
 */
public class EbwsUtil {
    /**
     * 发送post
     * @param url
     * @param para
     * @return
     */
    public static String postRequest(String url,String para) {
        String json = "";
        try {
            URL targetUrl = new URL(url);
            //创建http链接
            HttpURLConnection httpConnection = (HttpURLConnection) targetUrl.openConnection();
            httpConnection.setDoOutput(true);
            httpConnection.setRequestMethod("POST");
            httpConnection.setRequestProperty("Content-Type", "application/json");
            OutputStream outputStream = httpConnection.getOutputStream();
            Writer writer = new OutputStreamWriter(outputStream,"utf-8");
            writer.write(para);
            writer.flush();
            if (httpConnection.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + httpConnection.getResponseCode());
            }
            BufferedReader responseBuffer = new BufferedReader(new InputStreamReader((httpConnection.getInputStream()),"utf-8"));
            String output;
            while ((output = responseBuffer.readLine()) != null) {
                //返回json字符串
                json = output;
            }
            //返回json信息
            System.out.println(json);
            httpConnection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }
}
