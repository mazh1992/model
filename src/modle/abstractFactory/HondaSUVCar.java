package modle.abstractFactory;

/**
 * Created by mazhenhua on 2017/2/16.
 */
public class HondaSUVCar extends SUVCar {
    @Override
    public void start() {
        System.out.println("生产了一台本田的SUV");
    }
}
