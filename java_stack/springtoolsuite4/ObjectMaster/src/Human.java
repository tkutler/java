
public class Human {
	protected int health = 100;
	protected int stealth = 3;
	protected int strength = 3;
	protected int intelligence = 3 ; 
	
	public void attack(Human human) {
		human.health -= this.strength;
		System.out.println (human + " was attacked");
		
	}

}
