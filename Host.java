import java.util.ArrayList;

public class Host<E> extends Employee {
    //seat tables in the smallest possible table, dont seat a party of 3 in a ten top
    //have a list of how many tables of each size?
    //list of how many parties of each size?

    ArrayList<E> tables = new ArrayList<E>();
    public Host(String name, String position, boolean clockedIn) {
        super(name, position, clockedIn);
    }

    
}