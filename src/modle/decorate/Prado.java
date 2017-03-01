package modle.decorate;

/**
 * Created by mazhenhua on 2017/2/10.
 */
public class Prado extends JeepCar {

    public Prado(Car car) {
        super(car);
    }

    @Override
    public void getCar() {
        super.getCar();
        baoxiangang();
        jiaopan();
        tanzhaodeng();
        jianzhen();
        System.out.println("普拉多改装完成！");
    }
}
