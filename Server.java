import java.util.ArrayList;

public class Server<E> extends Employee {
    
    ArrayList<E> tables = new ArrayList<E>();
    public Server(String name, String position, boolean clockedIn) {
        super(name, position, clockedIn);
    }

    
}



