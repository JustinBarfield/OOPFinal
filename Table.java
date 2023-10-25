public class Table {
    private Boolean vacant;
    private int size;
    private Boolean clean;

    public Table(int size) {
        this.size = size;
        this.vacant = true;
        this.clean = true;
    }
}