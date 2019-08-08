
public class Wizard extends Human {
	private Integer health = 50;
	private Integer intelligence = 8;
	public void heal(Human human) {
		human.health += this.intelligence;
		System.out.println("wizard healed "+ human);
	} 
	public void fireball(Human human) {
		human.health -= this.intelligence * 3;
		System.out.println("wizard threw fireball at  "+ human);
	}

}
