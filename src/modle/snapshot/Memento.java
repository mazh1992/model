package modle.snapshot;

/**
 * Created by mazhenhua on 2017/2/17.
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
