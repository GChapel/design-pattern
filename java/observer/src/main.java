/**
 * Created by gchapel on 19/12/14.
 */
public class main {

    public static void main(String args[]){
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.Attach(observer);
        subject.setState(3);

    }
}
