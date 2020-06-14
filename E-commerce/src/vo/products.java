package vo;

public class products {

	private int id,cost,quantity,product_category_id;
	private String title,description;
	
	
	public products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public products(int cost, int quantity, int product_category_id, String title, String description) {
		super();
		this.cost = cost;
		this.quantity = quantity;
		this.product_category_id = product_category_id;
		this.title = title;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProduct_category_id() {
		return product_category_id;
	}
	public void setProduct_category_id(int product_category_id) {
		this.product_category_id = product_category_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
