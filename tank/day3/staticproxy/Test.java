package day3.staticproxy;

/**
 * @author: bing
*/
public class Test {
    public static void main(String[] args) {
        Air air = new Air();
        AirSeller airSeller = new AirSeller(air);
        airSeller.fly();
    }
}
