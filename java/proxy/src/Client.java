/**
 * Created by gchapel on 19/12/14.
 */
public class Client {

    public static void main(String args[]){
        Target adapter = new Adapter();
        System.out.println(adapter.getCpt());
        System.out.println(adapter.getCpt());
    }

}
