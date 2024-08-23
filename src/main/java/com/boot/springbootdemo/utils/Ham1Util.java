package com.boot.springbootdemo.utils;



import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * api请求接口生成签名：
 *
 * @author : jieli.xu
 * @date : 2022/6/3
 */
public class Ham1Util {

    private static final char NEW_LINE = (char) 0x000A;

    private static final String HEADERS_AUTHORIZATION_PREFIX = "WallTech ";

    private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";

    public static void main(String[] args) {
        Ham1Util.buildHeader("POST", "http://localhost:9999/test/services/carrier/export", "test5AdbzO5OEeOpvgAVXUFE0A", "79db9e5OEeOpvgAVXUFWSD");
    }

    private static String calculate(String secretAccessKey, String data) {
        try {
            SecretKeySpec signingKey = new SecretKeySpec(secretAccessKey.getBytes("UTF-8"), HMAC_SHA1_ALGORITHM);

            Mac mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
            mac.init(signingKey);
            byte[] rawHmac = mac.doFinal(data.getBytes("UTF-8"));
            return Base64.getEncoder().encodeToString(rawHmac);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    private static void buildHeader(String method, String url, String token, String secret) {
        Map<String, String> headers = new HashMap<String, String>();
        SimpleDateFormat format = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        format.setTimeZone(TimeZone.getTimeZone("GMT"));
        String dateStr = format.format(new Date());
        StringBuilder sb = new StringBuilder();
        sb.append(method).append(NEW_LINE);
        sb.append(dateStr).append(NEW_LINE);
        sb.append(url);
        String authorization = MessageFormat.format(HEADERS_AUTHORIZATION_PREFIX + "{0}:{1}", token, calculate(secret, sb.toString()));

        System.out.println("X-WallTech-Date:" + dateStr);
        System.out.println("authorization:" + authorization);
    }
}
