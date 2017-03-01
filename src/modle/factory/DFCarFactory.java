package modle.factory;

/**
 * Created by mazhenhua on 2017/2/14.
 */
public class DFCarFactory extends CarFactory {

    @Override
    public <T extends Car> T createCar(Class<T> clzz) {
        Car car = null;
        String classname=clzz.getName();

        try {

            // 通过反射来生产不同厂家的汽车
            car = (Car) Class.forName(classname).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T) car;
    }



}
