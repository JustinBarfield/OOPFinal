import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {

    private int size;
    private String name;
    private LocalDate dateReserved;
    private LocalTime timeCreated;
    private LocalTime timeReserved;

    public Reservation(int size, String name, LocalDate dateReserved, LocalTime timeCreated, LocalTime timeReserved) {
        this.size = size;
        this.name = name;
        this.dateReserved = dateReserved;
        this.timeCreated = timeCreated;
        this.timeReserved = timeReserved;
    }
}
