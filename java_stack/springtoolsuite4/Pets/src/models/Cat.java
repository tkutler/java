package models;

public class Cat extends Animal implements Pet {
	public Cat (String name, String breed, int weight) {
		super(name, breed,weight);
		
	}

	@Override
	public String showAffection() {
		// TODO Auto-generated method stub
		return "the cat showed affection";
	}

}
