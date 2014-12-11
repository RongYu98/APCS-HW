import java.io.*;
import java.util.*;
public class StuyabloSort extends baseChar implements Comparable{

    public int compareTo(Object other){
	baseChar o = (baseChar) other;
	return (this.compareTo(o));
	}

    public static void main(String args[]){
	baseChar[] BCA = new baseChar [10];
	String[] strs= new String[BCA.length];
	for (int i=0; i<BCA.length; i++){
		BCA[i]= new baseChar();}
	for (int i=0; i<BCA.length; i++){
	    //System.out.println(BCA[i]);
	}


	Arrays.sort(BCA); 
	for (int i=0; i<5; i++){
		System.out.println(BCA[i]);
	}
	
}
}
