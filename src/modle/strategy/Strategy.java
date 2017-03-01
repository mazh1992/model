package modle.strategy;

/**
 * Created by mazhenhua on 2017/2/9.
 */
public class Strategy {

    public void trip(String tripModle){
        Trip trip = null;
        switch (tripModle) {
            case "car":
                trip = new TripByCar(); // 开车去西藏
                break;
            case "Train":
                trip = new TripByTrain(); // 坐火车去西藏
                break;
            case "Boot":
                trip = new TripByBoot(); //徒步去西藏
                break;
            default:
                System.out.println("不支持" + "出行方式"); // 不能做飞机，因为直接升到高海拔，高反受不了
        }
        if (trip != null){
            trip.execute();
        }


    }


    public static void main(String[] args) {
        Strategy strategy = new Strategy();
        strategy.trip("Train");
        strategy.trip("Boot");
        strategy.trip("car");
        strategy.trip("airplane");
    }
}
