package modle.iterator;

/**
 * Created by mazhenhua on 2017/2/27.
 */
public class Test {

    public void operation(){
        Object[] objArray = {"One","Two","Three","Four","Five","Six"};
        //创建聚合对象
        Aggregate agg = new ConcreteAggregate(objArray);
        //循环输出聚合对象中的值
        Iterator it = agg.createIterator();
        while(!it.isDone()){
            System.out.println(it.currentItem());
            it.next();
        }
    }
    public static void main(String[] args) {

        Test client = new Test();
        client.operation();
    }
}
