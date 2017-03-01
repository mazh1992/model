package modle.template;

/**
 * Created by mazhenhua on 2017/2/15.
 */
public abstract class Refit {

    private void baoxiangang(){
        System.out.println("加装防撞钢梁");
    }

    private void jiaopan(){
        System.out.println("加装拖车绞盘");
    }

    private void tanzhaodeng(){
        System.out.println("假装探照灯");
    }

    private void jianzhen(){
        System.out.println("更换减震套装，提高地盘高度");
    }

    protected abstract void colour();

    protected void getJeepCar(){
        baoxiangang();
        jiaopan();
        colour();
        tanzhaodeng();
        jianzhen();
    }
}
