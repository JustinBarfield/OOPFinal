import java.util.ArrayList;

public class Busser<E> extends Employee {
    ArrayList<E> tables = new ArrayList<E>();
    public Busser(String name, String position, boolean clockedIn) {
        super(name, position, clockedIn);
    }

    
}