package modle.simpleFactory;

/**
 * Created by mazhenhua on 2017/2/9.
 */
public class CarFactory {

    public String createCar(String carType){
        Car car = null;
        switch (carType){
            case "Honda":
                car = new Honda();
                break;
            case "Mazda":
                car = new Mazda();
                break;
            case "Toyota":
                car = new Toyota();
                break;
            default:
                return "设备有限暂不支持生产" + carType;
        }
        return car.getCar();
    }

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        System.out.println(carFactory.createCar("Mazda"));
        System.out.println(carFactory.createCar("Audi"));
    }
}
