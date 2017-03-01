package modle.Builder;

/**
 * Created by mazhenhua on 2017/2/16.
 */
public class Dirextor {

    Builder builder = null;

    public Dirextor(Builder builder) {
        this.builder = builder;
    }

    public Car createCar(String engine, String transmission, String chassis){
        this.builder.buildChassis(chassis);
        this.builder.buildEngine(engine);
        this.builder.buildTransmission(transmission);
        return builder.create();
    }

    public static void main(String[] args) {
        Builder builder = new DFCarBuilder();
        Dirextor dirextor = new Dirextor(builder);
        Car myCar = dirextor.createCar("地球梦科技发动机", "爱信9AT自动变速箱", "标志的底盘");
        System.out.println(myCar.toString());
    }
}
