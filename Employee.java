public class Employee extends Resturant {

    private String name;
    private String position;
    private Boolean clockedIn;

    public Employee(String name, String position, Boolean clockedIn) {
        this.name = name;
        this.position = position;
        this.clockedIn = clockedIn;
    }
}