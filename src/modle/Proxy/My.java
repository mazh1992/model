package modle.Proxy;

/**
 * Created by mazhenhua on 2017/2/10.
 */
public class My implements BuyCar{

    @Override
    public void getCar() {
        System.out.println("我：我购买了一辆车");
    }
}
