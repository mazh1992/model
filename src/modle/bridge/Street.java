package modle.bridge;

/**
 * Created by mazhenhua on 2017/3/1.
 */
public class Street extends AbstractRoad {

    @Override
    public void run() {
        aCar.run();
        System.out.println("在市区街道行驶");
    }
}
