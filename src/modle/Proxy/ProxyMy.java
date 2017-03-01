package modle.Proxy;

/**
 * Created by mazhenhua on 2017/2/10.
 */
public class ProxyMy implements BuyCar{

    private BuyCar buyCar; // 一定要持有真实对象

    public ProxyMy(BuyCar buyCar) {
        this.buyCar = buyCar;
    }

    @Override
    public void getCar() {
        System.out.println("代理：我是代购，我帮别人代购一辆车");
        buyCar.getCar();
        System.out.println("代理：代购完成，车辆已经交给客户");
    }
}
