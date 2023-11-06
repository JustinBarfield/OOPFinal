import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalTime;
import java.time.LocalDate;

public class ReservationRecord {
    public static void main(String[] args) {
        String filePath = "reservation_data.txt"; // Replace with your file path

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4) {
                    int size = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    LocalDate dateReserved = LocalDate.parse(parts[2]);
                    LocalTime timeReserved = LocalTime.parse(parts[3]);

                    
                    Reservation reservation = new Reservation(size, name, dateReserved, LocalTime.now(), timeReserved);
                    
                    System.out.println("Reservation: " + reservation.toString());
                } else {
                    System.out.println("Invalid data: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
