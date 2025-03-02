//Parent class of all electronic devices
//This class is intended to set up a parent class of electronics for a store to be able to keep an inventory of all electronics they have at their location
//This class allows stores to keep track of computers, both desktop and laptops, as well as phones

public abstract class AbstractElectronic{	

	//Instance variables applicable to all electronics
	private String brand;		//all electronic devices will have a brand
	private String processor;		//all computers and phones will contain a processor
	private String operatingSystem;		//all computers and phones will contain an operating system
	private double price;		//all electronic devices have a price
	private int totalGigsStorage;		//all computers and phones will have a total amount of storage
	private int totalGigsRAM;		//all computers and phones will have a total amount of RAM

	//constructor for all electronics, subclasses will super this constructor in their individual constructors
	public AbstractElectronic(String brand, String processor, String operatingSystem, double price, int totalGigsStorage, int totalGigsRAM){
		this.brand = brand;
		this.processor = processor;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.totalGigsStorage = totalGigsStorage;
		this.totalGigsRAM = totalGigsRAM;
	}

	//Returns the brand
	public String getBrand() {
		return this.brand;
	}

	//Returns processor type
	public String getProcessor(){
		return this.processor;
	}

	//returns operating system
	public String getOperatingSystem(){
		return this.operatingSystem;
	}

	//returns price
	public double getPrice(){
		return this.price;
	}

	//returns total amount of storage in GB
	public int getTotalStorage(){
		return this.totalGigsStorage;
	}

	//returns total amount of RAM in GB
	public int getTotalRAM(){
		return this.totalGigsRAM;
	}

	//sets the brand if error occurs during instantiation
	public void setBrand(String brand){
		this.brand = brand;
	}

	//sets the processor type if error occurs during instantiation
	public void setProcessor(String processor){
		this.processor = processor;
	}

	//sets the operating system type if error occurs during instantiation
	public void setOperatingSystem(String operatingSystem){
		this.operatingSystem = operatingSystem;
	}

	//sets price if price change is necessary
	public void setPrice(double price){
		this.price = price;
	}

	//sets total storage if error occurs during instantiation
	public void setTotalStorage(int totalGigsStorage){
		this.totalGigsStorage = totalGigsStorage;
	}

	//sets total RAM if error occurs during instantiation
	public void setTotalRAM(int totalGigsRAM){
		this.totalGigsRAM = totalGigsRAM;
	}

	//toString() method specific to AbstractElectronic class
	//Can be overwritten by subclasses if necessary
	public String toString(){
		return " Device brand: " + this.brand + " Processor type: " + this.processor + " Operating System: " + this.operatingSystem + " Total Gigs of Storage: " + this.totalGigsStorage + " Total Gigs of RAM: " + this.totalGigsRAM + " Price: $" + this.price;	
	}

}