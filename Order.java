import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Order<E> {

    

    public Order() {
        ArrayList<E> order = new ArrayList<E>();

        String filePath = "reservation_data.txt"; //add text file with orders

        //add a variable to link an order with a table, need to "seat" a table before taking order so we can know what table they are at

        /* * try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {//read in data; put in an array reservationAttributes[]
            String line;
            while ((line = br.readLine()) != null) {
                String[] order = line.split(",");
                
                    Order order = new order();

                    // Add the Reservation to the ArrayList
                    order.add(order);
                } else {
                    System.out.println("Invalid data: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

    }
}