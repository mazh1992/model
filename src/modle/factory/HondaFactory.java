package modle.factory;

/**
 * Created by mazhenhua on 2017/2/14.
 */
public class HondaFactory extends Car2Factory{

    @Override
    public Car createCar() {
        return new Honda();
    }
}
