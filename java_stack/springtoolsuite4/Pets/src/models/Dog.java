package models;

public class Dog extends Animal implements Pet {
	public Dog (String name, String breed, int weight) {
		super(name, breed,weight);
		
	}

	@Override
	public String showAffection() {
		if (this.weight > 30) {
		return this.name +"the" + this.breed + "sat next to you";
		}
		else {
			return this.name + "the" + this.breed + "curled up in your lap";
		}
	}

}
