package modle.abstractFactory;

/**
 * Created by mazhenhua on 2017/2/16.
 */
public class Test {

    public static void main(String[] args) {
        CarFactory hongdaFactory = new HondaFactory();

        hongdaFactory.createSUVCar().start();
        hongdaFactory.createMPVCar().start();

        CarFactory nissanFactory = new NissanFactory();
        nissanFactory.createMPVCar().start();
        nissanFactory.createSUVCar().start();

    }
}
