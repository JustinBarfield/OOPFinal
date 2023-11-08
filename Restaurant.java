public class Restaurant<E> {
    public E[][] tables;
//made a 2d array of type E to store all of the tables in, each index is a table
    public Restaurant(int rows, int columns) {
        
        tables = (E[][]) new Object[rows][columns];
        // need to initialize all of the indexes to have tables of varying sizes
    }

    

    public static void main(String[] args) {
        int rows = 3; 
        int columns = 4; 

        Restaurant<String> restaurant = new Restaurant<>(rows, columns);

        
    }
}
