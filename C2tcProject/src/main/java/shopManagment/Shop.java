package shopManagment;

public class Shop {
	private int shopId;
	private String shopCategory;
	private String shopName;
	private String customers;
	private String shopStatus;
	private String leaseStatus;
	
	private ShopOwner shopOwner;
	private Employee shopEmployeeID;
	private Item item;
	
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopCategory() {
		return shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getCustomers() {
		return customers;
	}
	public void setCustomers(String customers) {
		this.customers = customers;
	}
	public String getShopStatus() {
		return shopStatus;
	}
	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}
	public String getLeaseStatus() {
		return leaseStatus;
	}
	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
	public ShopOwner getShopOwner() {
		return shopOwner;
	}
	public void setShopOwner(ShopOwner shopOwner) {
		this.shopOwner = shopOwner;
	}
	public Employee getShopEmployeeID() {
		return shopEmployeeID;
	}
	public void setShopEmployeeID(Employee shopEmployeeID) {
		this.shopEmployeeID = shopEmployeeID;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
}
