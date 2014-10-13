public class Warrior extends BaseChar {
	int Health = super.Health + 10;
	int Strength = super.Strength + 5;
	int Dexterity = super.Dexterity;
	boolean NotDead = false;
	String Name = "WarriorKing";
	int EHealth = 100;
	String EName = "Enemy";


	public void CaculateHealth(){
		EHealth = EHealth - Strength;
		System.out.println(Name + " attacks Enemy " + EName);
		if (EHealth >0) {
			System.out.println(EName + " has " + EHealth + " left");}
		else {
			System.out.println(EName + " is now dead");
			NotDead = true;}
}
		
			 
	public boolean DEAD (){
		return NotDead;}

	public int Speed(){
		return Dexterity;}

}
