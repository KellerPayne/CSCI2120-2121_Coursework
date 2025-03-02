//Main class for ElectronicsInventory
//Implement classes of type Computer and Phone
//Inheritance allows for objects of type Computer and Phone to be stored in an array of type AbstractElectronic
//Can be useful when storing information about devices in an inventory for a store

public class ElectronicsInventory{

	public static void main(String[] args){
		//Instantiations of type Computer and type Phone
		Computer surfaceLaptop = new Computer("Microsoft", "Qualcomm Snapdragon X Plus", "Windows 11 Home", 256, 16, 13.8, 999.99, true, true);
		Computer yogaSlim7X = new Computer("Lenovo", "Qualcomm Snapdragon X Elite", "Windows 11 Home", 512, 16, 14.5, 1999.99, true, true);
		Computer galaxyBook4Edge = new Computer("Samsung", "Qualcomm Snapdragon X Elite", "Windows 11 Home", 512, 16, 13.2,  899.99, true, true);
		Computer inspironDesktop3030 = new Computer("Dell", "Intel Core i7 14th Generation", "Windows 11 Home", 1000, 16, 0, 949.99, false, false);
		Phone iPhone15ProMax = new Phone("Apple", "Apple A17", "Apple iOS 17", 1399.99, 512, 512, 6.7, true, "AT&T/Verizon");
		Phone iPhone15 = new Phone("Apple", "Apple A16", "Apple iOS 17", 929.99, 256, 256, 6.1, true, "AT&T/Verizon");
		Phone galaxyS24 = new Phone("Samsung", "Qualcomm Snapdragon 8 Gen 3 for Galaxy", "Android 14", 719.99, 8, 8, 6.2, true, "AT&T/Verizon/Unlocked");
		Phone ipDeskPhone = new Phone("Ooma", "", "", 56.99, 0, 0, 2.2, false, "Home Internet Service");

		//Initialization of AbstractElectronic array
		//Storing of devices of type Computer and Phone in AbstractElectronic array
		AbstractElectronic[] electronicsInventory = new AbstractElectronic[]{surfaceLaptop, yogaSlim7X, galaxyBook4Edge, inspironDesktop3030, iPhone15ProMax, iPhone15, galaxyS24, ipDeskPhone};

		//Calls toString() method on all devices stored in AbstractElectronic array to print out device information
		for(AbstractElectronic electronics : electronicsInventory){
			System.out.println(electronics.toString());
		}



	}
}