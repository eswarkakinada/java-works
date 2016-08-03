import java.util.List;
import java.util.ArrayList;;
public class Supplier {
	
	private int id;
	private String name;
	private String address;
	ArrayList<Product> eswar=new ArrayList<Product>();

	public Supplier(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}	
 	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Supplier(int id, String name, String address, ArrayList<Product> eswar) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.eswar = eswar;
	}


}
