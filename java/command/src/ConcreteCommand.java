/**
 * Created by gchapel on 19/12/14.
 */
public class ConcreteCommand implements Command{

    private Receiver receiver;

    ConcreteCommand(Receiver r){
        receiver = r;
    }
    @Override
    public void execute() {
        receiver.fireEvent();
    }
}
