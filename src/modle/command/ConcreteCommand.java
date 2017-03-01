package modle.command;

/**
 * Created by mazhenhua on 2017/3/1.
 */
public class ConcreteCommand implements Command {

    private Receiver receiver;
    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }
    public void execute() {
        this.receiver.doSomething();
    }

}
