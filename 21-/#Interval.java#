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
	int high = rnd.nextInt(41) - 20;
	int low =  rnd.nextInt(41) - 20;
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
    
    public static void main(String args[]){
	Interval[] INT  = new Interval[10];
	for (int i=0; i<10; i++){
	    INT[i] = new Interval();
	    System.out.println(INT(i));
	}

    }
}
