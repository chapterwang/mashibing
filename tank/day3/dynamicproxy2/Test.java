package day3.dynamicproxy2;

import java.lang.reflect.Proxy;

/**
 * @author: bing
 * data  : 2021-08-23 11:45:17
 * day   : 周一
 * city  : shanghai
 * desc  : test
*/
public class Test {
    public static void main(String[] args) {
        JavaProgramer javaProgramer = new JavaProgramer("xhh");
        Programer programer = (Programer) Proxy.newProxyInstance(javaProgramer.getClass().getClassLoader(),
                javaProgramer.getClass().getInterfaces(),
                (proxy, method, ars) -> {
            if ("code".equals(method.getName())){
                System.out.println("xhh is praying for the code");
                return method.invoke(javaProgramer,ars);
            }
            if ("debug".equals(method.getName())){
                System.out.println("xhh is praying for the debug");
                return method.invoke(javaProgramer,ars);
            }
            return null;
        });

        programer.code();
        programer.debug();
    }
}
