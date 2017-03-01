package modle.decorate;

/**
 * Created by mazhenhua on 2017/2/10.
 */
public class Pajero extends JeepCar {

    public Pajero(Car car) {
        super(car);
    }

    @Override
    public void getCar() {
        super.getCar();
        baoxiangang();
        jiaopan();
        tanzhaodeng();
        jianzhen();
        System.out.println("帕杰罗改装完成！");
    }

}
