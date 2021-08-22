package day3.proxy;

/**、
 * @author: bing
 * 被代理类
 */
public class Air implements AirImpl {
    @Override
    public void fly() {
        System.out.println("flying...");
    }
}
