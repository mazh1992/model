package modle.factory;

/**
 * Created by mazhenhua on 2017/2/14.
 */
public class ToyotaFactory extends Car2Factory {

    @Override
    public Car createCar() {
        return new Toyota();
    }
}
