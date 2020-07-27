
public class Property {
	
	private String city, owner, propertyName;
	private double rentAmount;
	private Plot plot;
	
	public Property() {
		city = "";
		owner = "";
		propertyName = "";
		rentAmount = 0;
		this.plot = new Plot();
	}
	
	public Property(Property p) {
		this.city = p.city;
		this.owner = p.owner;
		this.propertyName = p.propertyName;
		this.rentAmount = p.rentAmount;
		this.plot = new Plot(p.plot);
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot();
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, 
			int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}
	
	public String getPropertyName() {
		return propertyName;
	}
	
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	public String getCity() {
		return city;
	}
	
	public Plot getPlot() {
		return plot;
	}
	
	public Plot setPlot(int x, int y, int width, int depth) {
		return new Plot(x, y, width, depth);
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public double getRentAmount() {
		return rentAmount;
	}
	
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	@Override
	public String toString() {
		return "Property Name: " + propertyName + "\n" 
			    + "Located in " + city + "\n" 
				+ "Belonging to: " + owner + "\n"
			    + "Rent Amount: " + rentAmount;
	}
}
