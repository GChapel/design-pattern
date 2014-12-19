/**
 * Created by gchapel on 19/12/14.
 */
public class Invoker {

    private Command cmd;
    private int state;

    public void setCommand(Command cmd){
        this.cmd = cmd;
    }

    public void setState(int newState){
        state = newState;
        cmd.execute();
    }
}
