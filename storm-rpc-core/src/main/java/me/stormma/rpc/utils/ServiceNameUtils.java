package me.stormma.rpc.utils;

import com.google.common.base.Strings;
import me.stormma.rpc.model.ServiceAddress;

/**
 * @author stormma stormmaybin@gmail.com
 */
public class ServiceNameUtils {

    public static String getServiceName(Class<?> interfaceClass, String version) {
        if (!Strings.isNullOrEmpty(version)) {
            return interfaceClass.getName() + "." + version;
        }
        return interfaceClass.getName();
    }

    public static String getServiceAddress(String host, int port) {
        return host + ":" + port;
    }

    public static String getServiceAddress(ServiceAddress address) {
        return address.getHost() + ":" + address.getPort();
    }
}