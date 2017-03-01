package modle.decorate;

/**
 * Created by mazhenhua on 2017/2/10.
 */
public abstract class JeepCar implements Car{

    private Car car;

    public JeepCar(Car car) {
        this.car = car;
    }

    @Override
    public void getCar() {
        car.getCar();
    }

    protected void baoxiangang(){
        System.out.println("加装防撞钢梁");
    }

    protected void jiaopan(){
        System.out.println("加装拖车绞盘");
    }

    protected void tanzhaodeng(){
        System.out.println("假装探照灯");
    }

    protected void jianzhen(){
        System.out.println("更换减震套装，提高地盘高度");
    }
}
