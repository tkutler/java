
public class Bat extends Mammal {
	private Integer energyLevel = 300;
	public void fly() {
		this.energyLevel -= 50;
		System.out.println ("wrrrrrrrrrrrrrrr");
		
	}
	public void eatHumans() {
		this.energyLevel += 25;
		System.out.println ("bat ate human");
	}
	public void attackTown () {
		this.energyLevel -= 100;
		System.out.println ("ahhhhhhhhhhh");
	}

}
