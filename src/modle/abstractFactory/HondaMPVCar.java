package modle.abstractFactory;

/**
 * Created by mazhenhua on 2017/2/16.
 */
public class HondaMPVCar extends MPVCar {

    @Override
    public void start() {
        System.out.println("生产了一辆本田的MPV");
    }
}
