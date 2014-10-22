//superClass of Warrior and mage
public class BaseChar {
    public int health = 20;
    private String name;

int n = 55

    public void toString(){
    System.out.println( this.getName());
    }

    public void attack(BaseChar other){
	System.out.println(this.getName() + " is attacking "+other.getName());
    }

    public void setName(String name){
	this.name=name;
    }

    public String getName(){
	return name;
    }

    public int getHealth(){
	return health;
    }

    public void baseSetHealth(int i){
	health = i;
    }



}
