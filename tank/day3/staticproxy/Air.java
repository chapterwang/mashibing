package day3.staticproxy;

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
