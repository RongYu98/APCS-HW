//subclass of BaseChar
public class Warrior extends BaseChar {
    
    public void warriorSetHealth(int i){
	health = i;
    }
    //Doesn't work if Health is private

    private int healthboost=5;
    private int health=12345;
    //Will not matter since the getHealth is from Basechar

    public int getHealth(){
	return health;
    }
    //will return this level of health

    public int getHigherHealth(){
	return super.health;
    }
    // will return the superclass level

    public Warror(String n){
	setname(n);
    }



}
