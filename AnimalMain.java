public class AnimalMain{

	public static void main(String[] args){

		Dog snoopy = new Dog("Snoopy", 26.0, 50.0);
		
		Terrier jennie = new Terrier("Jennie", 10.0, 22.0);

		Snake noodle = new Snake();

		Bird flappy = new Bird();

		Fish swimmy = new Fish();


		Dog[] myDogs = new Dog[]{jennie, snoopy};

		for(Dog dog : myDogs){
			System.out.println(dog.toString());
		}


		Animal[] myAnimals = new Animal[]{snoopy, jennie, noodle, flappy, swimmy};

		for(Animal animal : myAnimals){
			animal.move();
		}
	}

}