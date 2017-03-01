package modle.strategy;

/**
 * Created by mazhenhua on 2017/2/9.
 */
public class TripByTrain implements Trip {

    @Override
    public String execute() {
        System.out.println("火车票已经买好，随时可以出发。");
        return "";
    }
}
