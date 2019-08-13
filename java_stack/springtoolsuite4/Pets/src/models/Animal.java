package models;

public class Animal {
protected String name;
protected String breed;
protected int weight;
public Animal(String name2, String breed2, int weight2) {
	this.name = name2;
	this.breed = breed2;
	this.weight = weight2;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBreed() {
	return breed;
}
public void setBreed(String breed) {
	this.breed = breed;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}

}
