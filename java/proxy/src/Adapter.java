/**
 * Created by gchapel on 19/12/14.
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    Adapter() {
        adaptee = new Adaptee();
    }
    @Override
    public int getCpt() {
        adaptee.incrementCpt();
        return adaptee.getCpt();
    }
}
