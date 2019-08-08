
public class Gorilla extends Mammal {
	public String throwSomething() {
		this.energyLevel -= 5;
		return "watchout! gorilla just threw something!";
	}
	public String eatBananas() {
		this.energyLevel += 10;
		return "yum!! the gorilla just ate a banana!";
	}
	public String climb() {
		this.energyLevel -= 10;
		return "amazing! the gorilla just climbed up the tree";
	}

}
