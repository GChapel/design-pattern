/**
 * Created by gchapel on 19/12/14.
 */
public interface Subject {

    void Attach(Observer o);
    void Detach(Observer o);
    void NotifyAll();
}
