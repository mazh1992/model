package modle.Publish_Subscribe;

/**
 * Created by mazhenhua on 2017/2/16.
 */
public class Owner implements Observer {

    private String ownerName;

    public Owner(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void updateCar(String message) {
        System.out.println(ownerName + "-" + message);
    }
}
