import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ClassNotFoundException;

public class CartoonCharacterRunner {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		CartoonCharacter rick = new CartoonCharacter("Rick", 70, "Wubba lubba dub dub!\n");
		CartoonCharacter morty = new CartoonCharacter("Morty", 14, "Aaaaawwwww jeeeeeeezzzz..." + System.getProperty("line.separator"));
		CartoonCharacter character = null;
		
		CartoonCharacterSerializer.serializeCharacter(rick);
		character = CartoonCharacterSerializer.deserializeCharacter();
		System.out.println(character);
	}

}
