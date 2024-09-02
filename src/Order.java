import java.text.DateFormat;
import java.util.Date;


public class Order {

    private String customerName;
    private Sandwich sandwich;
    private String timestamp;

    public Order(String customerName, Sandwich sandwich) {
        this.customerName = customerName;
        this.sandwich = sandwich;
        Date now = new Date();
        DateFormat defaultDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        this.timestamp = defaultDate.format(now);
    }


    public String toString() {
        return timestamp + "\t" + customerName + "\t" + sandwich.toString();
    }
	
	
}