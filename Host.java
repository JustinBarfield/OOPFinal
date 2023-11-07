import java.util.ArrayList;

public class Host<E> extends Employee {
    ArrayList<E> tables = new ArrayList<E>();
    public Host(String name, String position, boolean clockedIn) {
        super(name, position, clockedIn);
    }

    
}