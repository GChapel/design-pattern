/**
 * Created by gchapel on 19/12/14.
 */
public class ConcreteObserver implements Observer {


    @Override
    public void Update() {
        System.out.println("The state has changed");
    }
}
