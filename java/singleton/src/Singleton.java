/**
 * Created by gchapel on 20/12/14.
 */
public class Singleton {

    private static Singleton object;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(object == null){
            object = new Singleton();
        }
        return object;
    }

}
