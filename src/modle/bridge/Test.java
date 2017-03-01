package modle.bridge;

/**
 * Created by mazhenhua on 2017/3/1.
 */
public class Test {

    public static void main(String[] args) {
        AbstractRoad speedWay = new SpeedWay();
        speedWay.aCar = new Car();
        speedWay.run();

        AbstractRoad street = new Street();
        street.aCar = new Bus();
        street.run();
    }
}
