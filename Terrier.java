public class Terrier extends Dog{

	public Terrier(String name, double height, double weight){
		super(name, height, weight);
		this.isCrabby = false;
	}

	@Override
	public void move(){
		System.out.println("I run and jump because everything makes me excited!");
	}

	
}