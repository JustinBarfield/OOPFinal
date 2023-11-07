import java.util.ArrayList;

public class Cook<E> extends Employee {
    ArrayList<E> tables = new ArrayList<E>();
    public Cook(String name, String position, boolean clockedIn) {
        super(name, position, clockedIn);
    }

    
}