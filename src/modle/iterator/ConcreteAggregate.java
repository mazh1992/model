package modle.iterator;

/**
 * Created by mazhenhua on 2017/2/27.
 */
public class ConcreteAggregate extends Aggregate {

    private Object[] objArray = null;

    public ConcreteAggregate(Object[] objArray){
        this.objArray = objArray;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public Object getElement(int index){

        if(index < objArray.length){
            return objArray[index];
        }else{
            return null;
        }
    }

    public int size(){
        return objArray.length;
    }
}
