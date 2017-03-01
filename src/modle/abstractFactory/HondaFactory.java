package modle.abstractFactory;

/**
 * Created by mazhenhua on 2017/2/16.
 */
public class HondaFactory extends CarFactory {

    @Override
    public SUVCar createSUVCar() {
        return new HondaSUVCar();
    }

    @Override
    public MPVCar createMPVCar() {
        return new HondaMPVCar();
    }
}
