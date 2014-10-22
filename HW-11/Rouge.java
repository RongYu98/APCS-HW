public class Rouge extends BaseChar {
	int Health = super.Health;
	int Strength = super.Strength;
	int Dexterity = super.Dexterity + 5;
	boolean NotDead = true;
	String Name = "RougeKing";
	int EHealth = 100;
	String EName = "Enemy";


	public void CaculateHealth(){
		EHealth = EHealth - Strength;
		System.out.println(Name + " attacks Enemy " + EName);
		if (EHealth >0) {
			System.out.println(EName + " has " + EHealth + " left");}
		else {
			System.out.println(EName + " is now dead");
			NotDead = false;}
}
		

	public boolean DEAD (){
		return NotDead;}

	public int Speed(){
		return Dexterity;}


}
