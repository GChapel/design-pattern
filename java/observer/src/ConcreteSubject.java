import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by gchapel on 19/12/14.
 */
public class ConcreteSubject implements Subject {

    private Set<Observer> observers;
    private int state;

    ConcreteSubject(){
        observers = new HashSet<Observer>();
        state = 0;
    }

    public void setState(int value){
        state = value;
        NotifyAll();
    }

    public int getState(){
        return state;
    }

    @Override
    public void Attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void Detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void NotifyAll() {
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()){
            it.next().Update();
        }
    }
}
