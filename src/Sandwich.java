import java.util.ArrayList;
import java.util.List;

public class Sandwich {

	 private String bread;
	 private List<String> vegetables;
	 private String meat;
	 private double price;
	    
	 public Sandwich() {
	        vegetables = new ArrayList<>();
	    }

	    public void setBread(String bread, double price) {
	        this.bread = bread;
	        this.price += price;
	    }

	    public void addVegetable(String vegetable, double price) {
	        vegetables.add(vegetable);
	        this.price += price;
	    }

	    public void setMeat(String meat, double price) {
	        this.meat = meat;
	        this.price += price;
	    }

	    public double getPrice() {
	        return price;
	    }


	    public String toString() {
	        return bread + "\t" + String.join(", ", vegetables) + "\t" + meat + "\t$" + String.format("%.2f", price);
	    }	
	
}
