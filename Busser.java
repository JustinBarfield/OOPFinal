import java.util.ArrayList;

public class Busser extends Employee {

    ArrayList<Table> tables = new ArrayList<Table>();//arraylist of tables that busser is responsible for

    public Busser(String name, String position, boolean clockedIn) {
        super(name, position, clockedIn);
    }
}