public class Driver{

	
	public static void main(String[] args){
		Rouge R = new Rouge();
		Warrior W = new Warrior();

		int Speed1=W.Speed();
		int Speed2=R.Speed();

/*		while (W.DEAD() && R.DEAD()) {
			if (Speed1 > Speed2){
				W.CalculateHealth();
				Speed2 = Speed2 + R.Speed();}
			else{
				R.CalculateHealth();
				Speed1 = Speed1 + W.Speed();}
*/
//doesn't work, there is a slight error, it says that it cannot find the symbol, 
//with the arrow pointing to the period in W.CalculateHealth and R.CalculateHealth
}



}

}