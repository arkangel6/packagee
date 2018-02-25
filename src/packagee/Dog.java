package packagee;

public class Dog extends Pet{
	String dog_sound;
	
	public Dog(String petName) {
		super (petName);
	}
	
	public String speak(){
		return dog_sound;
	}
}
