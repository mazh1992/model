package modle.template;

/**
 * Created by mazhenhua on 2017/2/15.
 */
public class HomeCar extends Refit {

    @Override
    protected void colour() {
        System.out.println("我要喷成红色");
    }

    public static void main(String[] args) {
        HomeCar homeCar = new HomeCar();

        homeCar.getJeepCar();
    }
}
