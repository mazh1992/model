package modle.factory;

/**
 * Created by mazhenhua on 2017/2/14.
 */
public class Test {

    public static void main(String[] args) {
        CarFactory carFactory = new DFCarFactory();
        Honda ca = carFactory.createCar(Honda.class);
        System.out.println(ca.getCar());
        Mazda ca1 = carFactory.createCar(Mazda.class);
        System.out.println(ca1.getCar());
        Toyota ca2 = carFactory.createCar(Toyota.class);
        System.out.println(ca2.getCar());
    }


}


/*
    public static void main(String[] args) {
        Car2Factory car2Factory = new HondaFactory();
        Car honda = car2Factory.createCar();
        System.out.println(honda.getCar());

        Car2Factory car2Factory1 = new MazdaFactory();
        Car mazda = car2Factory1.createCar();
        System.out.println(mazda.getCar());

        Car2Factory car2Factory2 = new ToyotaFactory();
        Car toyota = car2Factory2.createCar();
        System.out.println(toyota.getCar());
    }*/
