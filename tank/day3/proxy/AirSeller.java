package day3.proxy;

/**
 * * @author: bing
 * 代理类
 */
public class AirSeller implements AirImpl {
    private Air air;
    public AirSeller(Air air){
        this.air=air;
    }

    @Override
    public void fly() {
        System.out.println("start fly");
        air.fly();
        System.out.println("end fly");
    }
}
