import java.util.ArrayList;

public class Cook<E> extends Employee {
    ArrayList<E> orders = new ArrayList<E>();//arraylist of orders cook is responsible for
    public Cook(String name, String position, boolean clockedIn) {
        super(name, position, clockedIn);
    }

    
}