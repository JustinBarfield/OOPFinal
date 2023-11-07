import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ReservationRecord {



 //need to sort the reservations by day and time to determine which ones come first; set a time range of a few days for testing purposes??
 //once sorted they can go into an array that can be fed into an algorithm for putting the reservations into tables
 // algorithm should go day by day, then hour by hour, then fill in the tables preferable lowest to highest index to make it easier to understand how many at one time



    public static void main(String[] args) {
        String filePath = "reservation_data.txt"; //add text file with reservations
        List<Reservation> reservations = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {//read in data; put in an array reservationAttributes[]
            String line;
            while ((line = br.readLine()) != null) {
                String[] reservationAttributes = line.split(",");
                if (reservationAttributes.length >= 4) {
                    int size = Integer.parseInt(reservationAttributes[0]);
                    String name = reservationAttributes[1];
                    LocalDate dateReserved = LocalDate.parse(reservationAttributes[2]);
                    LocalTime timeReserved = LocalTime.parse(reservationAttributes[3]);

                    // Create a Reservation with the data
                    Reservation reservation = new Reservation(size, name, dateReserved, LocalTime.now(), timeReserved);

                    // Add the Reservation to the ArrayList
                    reservations.add(reservation);
                } else {
                    System.out.println("Invalid data: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


        
       
    

   


