public class Minotaur extends mammal implements Pet, Horned{

	public Minotaur(String name){
		this.setName(name);
	}

	public void changeName(String n){
		this.setName(n);
	}
	public void stab(){
		System.out.println("STABBY STABBY");
	}
}
