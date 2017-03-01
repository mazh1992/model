package modle.strategy;

/**
 * Created by mazhenhua on 2017/2/9.
 */
public class TripByBoot implements Trip {

    @Override
    public String execute() {
        System.out.println("100双鞋已经买好，随时可以出发。");
        return "";
    }
}
