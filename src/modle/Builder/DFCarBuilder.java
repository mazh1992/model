package modle.Builder;

/**
 * Created by mazhenhua on 2017/2/16.
 */
public class DFCarBuilder extends Builder {

    private Car dfCar = new Car();

    @Override
    public void buildEngine(String engine) {
        dfCar.setEngine(engine);
    }

    @Override
    public void buildTransmission(String transmission) {
        dfCar.setTransmission(transmission);
    }

    @Override
    public void buildChassis(String chassis) {
        dfCar.setChassis(chassis);
    }

    @Override
    public Car create() {
        return dfCar;
    }
}
