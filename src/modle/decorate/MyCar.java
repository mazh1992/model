package modle.decorate;

/**
 * Created by mazhenhua on 2017/2/10.
 */
public class MyCar implements Car {

    @Override
    public void getCar() {
        System.out.println("这里是家用车原型。");
    }

}
