
package character;


public class Monster {
	private int health,damage,defence,drop,level; 
	private final double factor = 0.7;
	private boolean isDefeated;
	//the potential drop of coins when the monster dies


	public Monster(int level){
		initialize(level);
	}
	//==================================== initialize ========================================================
	private void initialize(int level){
		this.level = level;
		this.isDefeated = false;
		this.health= (int) (100*(level)*factor);
		this.damage= (int) (11*(level)*factor);
		this.defence =(int) (3*(level)*factor);
		//generates a random number of coins drop when monster is defeated
		this.drop = (int)Math.random()*10*(level);
	}

	public void defeated(Player player) {
		isDefeated = true;
		player.setGold(player.getGold() + drop);
	}
	//==================================== get method ========================================================
	public int getDamage() {
		return damage;
	}

	public int getDefence() {
		return defence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public boolean isDefeated() {
		return isDefeated;
	}

	public String toString() {
		return String.valueOf(this.level);
	}
}

