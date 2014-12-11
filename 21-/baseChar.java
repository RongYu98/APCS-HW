import java.io.*;
import java.util.*;


public class baseChar implements Comparable{
    private String name;
    private int Health;
    private int Strength;
    private int Precision;

    public int compareTo(Object other){
	baseChar o = (baseChar) other;
	return (this.name.compareTo(o.name));
	}
    
    public baseChar(){
	Random randint = new Random();
	int X = randint.nextInt(5);
	if (X==4){
	    setName("Mage");}
	else if (X==3){
	    setName("Angel");}
	else if (X==2){
	    setName("DemonSlayer");}
	else if (X==1){
	    setName("King");}
	else {
	    setName("Overlord");}
    }
	


    public void setName(String newName) {
	name = newName;
    }
    public String toString() {
	return name;
    }
    public void setHealth(int newHP){
	Health = newHP;
    }
    public void setStrength(int newStrength){
	Strength = newStrength;
    }
    public void setPrecision(int newPrecision){
	Precision = newPrecision;
    }
    public int getHealth(){
	return Health;
    }
    public int getStrength(){
	return Strength;
    }
    public int getPrecision(){
	return Precision;
    }
    public String attack(baseChar other) {
	if (canHit(Precision)) {
	    other.Health-=Strength;
	    return (this + " attacks "+ other);
	} else {
	    return (this + " attacks "+ other + " and misses");
	}
    }
    public boolean canHit(int x) {
	Random randint = new Random();
	return (x >= randint.nextInt(10));
    }


    public static void main(String args[]){
	baseChar[] BCA = new baseChar [10];
	String[] strs= new String[BCA.length];
	for (int i=0; i<BCA.length; i++){
	    BCA[i]= new baseChar();}
	for (int i=0; i<BCA.length; i++){
	    //System.out.println(BCA[i]);}
	}
	Arrays.sort(BCA);
	for (int i=0; i<BCA.length; i++){
	    System.out.println(BCA[i]);}
	}

}
