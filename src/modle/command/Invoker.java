package modle.command;

/**
 * Created by mazhenhua on 2017/3/1.
 */
public class Invoker {

    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void action(){
        this.command.execute();
    }
}
