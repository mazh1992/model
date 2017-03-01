package modle.decorate;

/**
 * Created by mazhenhua on 2017/2/10.
 */
public class Test {

    public static void main(String[] args) {
        Car myCar = new MyCar();
        Pajero pajero = new Pajero(myCar);
        pajero.getCar();
        System.out.println("=========我是华丽的分割线============");
        Prado prado = new Prado(myCar);
        prado.getCar();

    }
}
