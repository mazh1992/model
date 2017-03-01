package modle.Publish_Subscribe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mazhenhua on 2017/2/16.
 */
public class DFStores implements Stores_4s {

    private List<Observer> ownerList = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        ownerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        ownerList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer: ownerList) {
            observer.updateCar(message);
        }
    }

    public static void main(String[] args) {
        Stores_4s stores = new DFStores();
        Owner owner = new Owner("张三");
        Owner owner1 = new Owner("李四");
        Owner owner2 = new Owner("王五");

        stores.attach(owner);
        stores.attach(owner1);
        stores.attach(owner2);

        stores.notify("发动机故障，需要召回换发动机。");

    }
}
