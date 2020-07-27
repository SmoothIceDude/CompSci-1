
public class ManagementCompany {

	private final int MAX_PROPERTY = 5;
	private double mgmFeePer;
	private String name;
	private Property[] properties;
	private String taxID;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private Plot plot;

	public ManagementCompany() {
		mgmFeePer = 0;
		name = "";
		properties = new Property[MAX_PROPERTY];
		taxID = "";
		plot = new Plot();
	}

	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}

	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		this.plot = new Plot(x, y, width, depth);
		this.properties = new Property[MAX_PROPERTY];
	}

	public ManagementCompany(ManagementCompany otherCompany) {
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFeePer = otherCompany.mgmFeePer;
		this.plot = new Plot(otherCompany.plot);
		this.properties = new Property[otherCompany.MAX_PROPERTY];
	}

	public int MAX_PROPERTY() {
		return MAX_PROPERTY;
	}

	public int addProperty(Property property) {
		if (property == null) {
			return -2;
		}

		if (!plot.encompasses(property.getPlot())) {
			return -3;
		}

		for (int i = 0; i < properties.length; i++) {
			if (properties[i] != null) {
				if (properties[i].getPlot().overlaps(property.getPlot())) {
					return -4;
				}
			} else {
				properties[i] = property;
				return i;
			}
		}
		//If array is full returns -1
		return -1;
	}

	public int addProperty(String name, String city, double rent, String owner) {
		return addProperty(new Property(name, city, rent, owner));
	}

	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		return addProperty(new Property(name, city, rent, owner, x, y, width, depth));
	}

	public double totalRent() {
		double totalRent = 0;
		for (int i = 0; i < properties.length; i++) {
			totalRent = totalRent + properties[i].getRentAmount();
		}
		return totalRent;
	}

	public double maxRentProp() {
		
		double maxRentProp = 0;
		
		maxRentProp = properties[maxPropertyRentIndex()].getRentAmount();
		
		return maxRentProp;
	}

	private int maxPropertyRentIndex() {
		double maximumRentAmount = 0;
		int index = 0;

		for (int i = 0; i < properties.length; i++) {
			if (properties[i].getRentAmount() > maximumRentAmount) {
				maximumRentAmount = properties[i].getRentAmount();
				index = i;
			}
		}
		return index;
	}
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}

	private String displayPropertyAtIndex(int i) {
		return properties[i].toString();
	}

	@Override
	public String toString() {
		String listOfTheProperties = "";
		double totalManagementFee = ((totalRent() * mgmFeePer) / 100);

		for (int i = 0; i < MAX_PROPERTY; i++) {
			listOfTheProperties = listOfTheProperties + properties[i] + "\n";
		}
		return "List of the properties for " + name + ", taxID: " + taxID
				+ "\n__________________________________________________\n" + listOfTheProperties
				+ "\n__________________________________________________\n" + "total management Fee: "
				+ totalManagementFee;

	}
	
	public String getName() {
		return name;
	}
	
	public Plot getPlot() {
		return plot;
	}
}
