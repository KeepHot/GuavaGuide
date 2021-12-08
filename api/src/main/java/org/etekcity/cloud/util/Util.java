package org.etekcity.cloud.util;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.etekcity.cloud.errorcode.ErrorCode;
import org.etekcity.cloud.exception.IotBizException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author KevinLiu
 */
public class Util {
    private static final Logger log = LoggerFactory.getLogger(Util.class);
    private static ThreadLocal<SimpleDateFormat> threadLocal = ThreadLocal.withInitial(() -> {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZ");
    });

    public Util() {
    }

    public static String formatIso8601(Date date) {
        return ((SimpleDateFormat) threadLocal.get()).format(date);
    }

    public static Date fromIso8601(String s) {
        try {
            return ((SimpleDateFormat) threadLocal.get()).parse(s);
        } catch (ParseException var2) {
            throw new RuntimeException(String.format("failed to parse %s by %s", s, "yyyy-MM-dd'T'HH:mm:ss.SSSZZ"));
        }
    }

    public static String getHostNameAndIp() {
        try {
            return InetAddress.getLocalHost().toString();
        } catch (UnknownHostException var1) {
            log.warn("Can not get HostNameAndIp", var1);
            return "UnknownHostNameAndIp";
        }
    }

    public static <K, V> V getFromMapOrException(K key, Map<K, V> map, String message) {
        V target = map.get(key);
        checkArg(target != null, message);
        return target;
    }

    public static void checkArg(boolean condition, String message) {
        if (!condition) {
            throw new IotBizException(ErrorCode.COMMON_ILLEGAL_ARG_ERROR, message);
        }
    }
}
