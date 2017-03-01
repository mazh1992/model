package modle.Adapter;

/**
 * Created by mazhenhua on 2017/2/17.
 */
public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void methodA() {
        this.adaptee.methodA();
    }

    @Override
    public void methodB() {
        System.out.println("methodB");
    }
}
