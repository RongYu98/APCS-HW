import java.util.*;
public class Interval{
    private int[] interval;
    private int low;
    private int high;
    private Random rnd;

    public Interval(int l, int h){
	low = l;
	high = h;
	interval = new int[2];
	interval[0] = low;
	interval[1] = high;
    }
    
    public Interval(){
	rnd = new Random();
	high = rnd.nextInt(41) - 20;
	low =  rnd.nextInt(41) - 20;
	if (low > high){
	    int n = low;
	    low = high;
	    high = n;
	}
	interval = new int[2];
	interval[0] = low;
	interval[1] = high;
	
    }

    public String toString(){
	String a = "";
	a="[";
	a+=interval[0];
	a+=" , ";
	a+=interval[1];
	a+="]";
	return a;
    }

    public int getLow(){
	return low;
    }

    public int getHigh(){
	return high;
    }

    public int compareTo(Interval other){
	if (this.getLow()>other.getLow()){
	    return 1;}
	else if (this.getLow()<other.getLow()){
	    return -1;}
	if (this.getHigh()==other.getHigh()){
	    return 0;}
	else if (this.getHigh()>other.getHigh()){
	    return 2;}
	else {
	    return -2;}
    }

    public static void main(String args[]){
	Interval[] INT  = new Interval[10];
	/*for (int i=0; i<10; i++){
	    INT[i] = new Interval();
	    System.out.println(INT[i]);
	}*/
	for (int i=0; i<10; i++){
	    INT[i]=new Interval();
	    System.out.print(INT[i] + " ");
	    //System.out.println(INT[i].getHigh());
	}
	System.out.println();
	for (int i=0; i<INT.length-1; i++){
	    System.out.println(INT[i].compareTo(INT[i+1]));
	}

    }
}
