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
		System.out.println(BCA[i]);
	}

	/* this part doesn't work, it points to the period and says that
	it cannot find the symbol 
	for (int i=0; i<BCA.length-1; i++){
		System.out.println(BCA[i].compareTo(BCA[i+1]));}
	*/

	Arrays.sort(BCA); 
	//This doesn't work, says baseChar cannot be cast to java.lang.comparable
	//But this is exactly the same as the classwork, I can't find the problem


	for (int i=0; i<5; i++){
		System.out.println(BCA[i]);
	}
	
}
}