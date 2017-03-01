package modle.factory;

/**
 * Created by mazhenhua on 2017/2/14.
 */
public abstract class CarFactory {

    public abstract  <T extends Car> T createCar(Class<T> clzz);

}

