package modle.strategy;

/**
 * Created by mazhenhua on 2017/2/9.
 */
public class TripByCar implements Trip {

    @Override
    public String execute() {
        System.out.println("汽车已经准备好，随时可以出发。");
        return "";
    }
}
