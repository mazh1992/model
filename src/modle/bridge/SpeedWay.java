package modle.bridge;

/**
 * Created by mazhenhua on 2017/3/1.
 */
public class SpeedWay extends AbstractRoad {

    @Override
    public void run() {
        aCar.run();
        System.out.println("在高速公路行驶");
    }
}
