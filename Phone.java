//Phone is - an electronic but has more specific instance variables

public class Phone extends AbstractElectronic{

	private double screenSize;		//screen size for phones is usually not very large; utilizing primitive type double allows for optimal storage usage
	private boolean touchScreen;		//most modern phones will be equipped with touchscreen if a cellphone; however, not all phones have touchscreens, requiring this instance variable
	private String carrier;		//instance variables exclusive to a phone
	private final String electronicType = "Phone";		//instance variable exclusive to all instances of this class

	//constructor used to instantiate phone objects
	public Phone(String brand, String processor, String operatingSystem, double price, int totalGigsStorage, int totalGigsRAM, double screenSize, boolean touchScreen, String carrier){
		super(brand, processor, operatingSystem, price, totalGigsStorage, totalGigsRAM);		//supers brand, processor, operatingSystem, price, totalGigsStorage, and totalGigsRAM instance variables from parent class
		this.screenSize = screenSize;		//sets screenSize instance variable to argument provided in constructor
		this.touchScreen = touchScreen;		//sets touchScreen capability instance variable to argument provided in constructor; false indicates a landline phone
		this.carrier = carrier;		//sets carrier instance variable to argument provided in constructor
	}

	//returns screen size
	public double getScreenSize(){
		return this.screenSize;
	}

	//returns touchscreen capabilities
	//returns false if phone is a landline
	public boolean isTouchScreen(){
		return this.touchScreen;
	}

	//returns carrier information
	public String getCarrier(){
		return this.carrier;
	}

	//will return "Phone" for all instances of this class
	public String getElectronicType(){
		return this.electronicType;
	}

	//sets screenSize instance variable if error occurs during instantiation
	public void setScreenSize(double screenSize){
		this.screenSize = screenSize;
	}

	//sets touchScreen instance variable if error occurs during instantiation
	public void setTouchScreen(boolean touchScreen){
		this.touchScreen = touchScreen;
	}

	//sets carrier instance variable if error occurs during instantiation
	public void setCarrier(String carrier){
		this.carrier = carrier;
	}

	//overridden toString() method from parent class to include screenSize, touchScreen, and carrier information
	@Override
	public String toString(){
		return "Electronic Type: " + electronicType + " Device brand: " + this.getBrand() + " Processor type: " + this.getProcessor() + " Operating System: " + this.getOperatingSystem() + " Total Gigs of storage: " + this.getTotalStorage() + " Total Gigs of RAM: " + this.getTotalRAM() + " Screen Size: "
				+ this.screenSize + " Touch Screen: " + this.touchScreen + " Carrier: " + this.carrier;
	}
}