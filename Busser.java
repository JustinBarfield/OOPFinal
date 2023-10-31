import java.util.ArrayList;

public class Busser extends Employee {

    ArrayList<Table> tables = new ArrayList<Table>();

    public Busser(String name, String position, boolean clockedIn) {
        super(name, position, clockedIn);
    }
}