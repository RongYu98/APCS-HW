public class Mage extends Basechar{ 

    private int manna = 200; 
    private String name = "Mage?";

    public void Default(String newName, int Mana){
	String name = newName;
	int manna = Mana;
	System.out.println("Mage name is " + name + ". My mana is "+ manna);
}

    public int getManna(){ 
	return manna; 
    } 
}
