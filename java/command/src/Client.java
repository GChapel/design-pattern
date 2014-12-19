/**
 * Created by gchapel on 19/12/14.
 */
public class Client {

    public static void main(String args[]){
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();
        Command cmd = new ConcreteCommand(receiver);
        invoker.setCommand(cmd);
        invoker.setState(5);
    }
}
