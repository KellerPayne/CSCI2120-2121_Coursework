import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.FileWriter;

public class CartoonCharacterSerializer {
	
	private static ObjectOutputStream outputCartoon;
	private static ObjectInputStream inputCartoon;
	private static PrintWriter writer;
	
	public static void serializeCharacter(CartoonCharacter character) throws IOException {
		try {
			// Create ObjectOutputStream with FileOutputStream
			FileOutputStream characterOutput = new FileOutputStream("characters.ser");
			outputCartoon = new ObjectOutputStream(characterOutput);
			// Write the CartoonCharacter object to the ObjectOutputStream
			outputCartoon.writeObject(character);
			// Close the ObjectOutputStream to ensure proper resource management
			outputCartoon.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static CartoonCharacter deserializeCharacter() throws IOException, ClassNotFoundException {
		CartoonCharacter cartoon = null;
		
		try {
			// Create ObjectInputStream with FileInputStream
			FileInputStream characterInput = new FileInputStream("characters.ser");
			inputCartoon = new ObjectInputStream(characterInput);
			// Read the CartoonCharacter object from the ObjectInputStream and cast it
			cartoon = (CartoonCharacter) inputCartoon.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return cartoon;
	}
	
	public static void printToFile(String stringToFile) throws FileNotFoundException, IOException {
		// Create PrintWriter with FileWriter
		FileWriter fileWriter = new FileWriter("CharacterFile.txt");
		writer = new PrintWriter(fileWriter);
		// Write the specified string to the file
		writer.write(stringToFile);
		// Print a formatted line to the file
		writer.format("%s", stringToFile);
		// Close the PrintWriter to ensure proper resource management
		writer.close();
	}

}
