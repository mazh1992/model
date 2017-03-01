package modle.abstractFactory;

/**
 * Created by mazhenhua on 2017/2/16.
 */
public class NissanFactory extends CarFactory {

    @Override
    public SUVCar createSUVCar() {
        return new NissanSUVCar();
    }

    @Override
    public MPVCar createMPVCar() {
        return new NissanMPVCar();
    }
}
