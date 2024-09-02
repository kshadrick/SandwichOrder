import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SandwichIO {

    public static void writeOrderToFile(Order order) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("orderline.txt", true))) {
            writer.write(order.toString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }
    }
	
	
}
