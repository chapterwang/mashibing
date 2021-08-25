package day3.dynamicproxy;

import day3.staticproxy.Air;
import day3.staticproxy.AirImpl;

import java.lang.reflect.Proxy;

/**
 * @author: bing
 * data  : 2021-08-23 10:36:29
 * day   : 周一
 * city  : shanghai
 * desc  : 测试
*/
public class Test {
    public static void main(String[] args) {
        AirImpl airImpl = new Air();
        AirImpl dynamicProxy = (AirImpl)Proxy.newProxyInstance(
                airImpl.getClass().getClassLoader(),
                airImpl.getClass().getInterfaces(),
                new DynamicProxy(airImpl));
        dynamicProxy.fly();
    }
}
