
public class Gorilla extends Mammal {

	public void throwSomething() {
		this.energyLevel -= 5;
		System.out.println ("watchout! gorilla just threw something!");
	}
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println ("yum!! the gorilla just ate a banana!");
	}
	public void climb() {
		this.energyLevel -= 10;
		System.out.println ("amazing! the gorilla just climbed up the tree");
	}

}
