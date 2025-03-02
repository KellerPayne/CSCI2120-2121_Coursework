//Computer is - an electronic but has more specific instance variables

public class Computer extends AbstractElectronic{

	private double screenSize;		//screen size will typically be larger for laptops; if 0 indicates item is desktop tower
	private boolean touchScreen;	//desktops and laptops may or may not be equipped with touchscreens
	private boolean isPortable;		//portability determines if the laptop is a desktop or a laptop computer
	private final String electronicType = "Computer";	//instance variable exclusive to computers

	//constructor used to instantiate both desktop and laptop computers
	public Computer(String brand, String processor, String operatingSystem, int totalGigsStorage, int totalGigsRAM, double screenSize, double price, boolean touchScreen, boolean isPortable){
		super(brand, processor, operatingSystem, price, totalGigsStorage, totalGigsRAM); //supers brand, processor, operatingSystem, price, totalGigsStorage, and totalGigsRAM instance variables from parent class
		this.screenSize = screenSize;		//sets screenSize instance variable to argument provided in constructor
		this.touchScreen = touchScreen;		//sets touchScreen capability instance variable to argument provided in constructor
		this.isPortable = isPortable;		//sets isPortable capability instance variable to argument provided in constructor
	}

	//returns screen size of desktop or laptop
	public double getScreenSize(){
		return this.screenSize;
	}

	//returns if the device has a touchscreen or not
	public boolean isTouchScreen(){
		return this.touchScreen;
	}

	//returns true for laptops and false for desktops
	public boolean isPortable(){
		return this.isPortable;
	}

	//returns "Computer" for all instances of this class
	public String getElectronicType(){
		return this.electronicType;
	}

	//sets screen size if error occurs during instantiation
	public void setScreenSize(double screenSize){
		this.screenSize = screenSize;
	}

	//sets touchscreen capability if error occurs during instantiation
	public void setTouchScreen(boolean touchScreen){
		this.touchScreen = touchScreen;
	}

	//sets device as either a laptop or desktop if error occurs during instantiation
	public void setIsPortable(boolean isPortable){
		this.isPortable = isPortable;
	}

	//Overridden toString() method from AbstractElectronic parent class to include screenSize, touchScreen, and isPortable instance variables
	@Override
	public String toString(){
		return "Electronic Type: " + electronicType + " Device brand: " + this.getBrand() + " Processor type: " + this.getProcessor() + " Operating System: " + this.getOperatingSystem() + " Total Gigs of storage: " + this.getTotalStorage() + " Total Gigs of RAM: " + this.getTotalRAM() + " Screen Size: "
				+ this.screenSize + " Touch Screen: " + this.touchScreen + " Portable: " + this.isPortable;
	}

}