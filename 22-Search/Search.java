import java.util.*;
import java.io.*;

public class Search{

    Comparable[] a;
    int last = 0;

    public Search(int num){
	a= new Comparable[num];

    }

    public String toString(){
	String s="";
	for (int i=0; i<a.length; i++){
	    s=s+a[i] + "  ";
	}
	return s;
}
	
    public void SortIt(){
	Arrays.sort(a);
    }

    public void add(Comparable O){
	if (last==a.length){
	    Comparable[] b = a;
	    a = new Comparable[a.length + 1];
	    for (int i=0; i<b.length;i++){
		a[i]=b[i];}
	}//expanision if
	a[last]=O;
	last++;    
    }

    public Comparable LSearch(Comparable item){
	for (int i=0; i<a.length; i++){
	    if (a[i]==item){
		return a[i];}
	}
	return null;
    }

    public Comparable BSearch(Comparable item){
	SortIt();
	int high=a.length-1;
	int low=0; 	
	for (int i=0; i<a.length; i++){
	    int mid = (high+low)/2;
	    if (item.compareTo(a[mid])==0){
		return a[mid];}
	    if (item.compareTo(a[mid])>0){
		low=mid;}
	    else {
		high=mid;}
	}
	return null;
    }

    public Comparable RBSearch(Comparable item){
	SortIt();
	int high=a.length-1;
	int low=0; 
	int mid=(high+low)/2;
	if (item.compareTo(a[mid])==0){
	    return a[mid];}
	else if (item.compareTo(a[mid])>0){
		return RBSearch(item, mid,high);}
	else {
		return RBSearch(item, low,mid);}
    }
    public Comparable RBSearch(Comparable item, int low, int high){
	if (high==low+1){
	    return null;}
	int middle=(high+low)/2;
	if (item.compareTo(a[middle])==0){
	    return a[middle];}
	else if (item.compareTo(a[middle])>0){
		return RBSearch(item, middle,high);}
	else {
		return RBSearch(item, low, middle);}
    }

    public static void main(String args[]){
	Search x=new Search(100);
	Random r = new Random();
	for (int i=0; i<80000; i++){
	    x.add(r.nextInt(100));
	}
	//System.out.println(x)
	//for (int i=0; i<5; i++){
	    int y =r.nextInt(100);
	    System.out.println(y); 
	    //System.out.println(x.LSearch(y)); //20 seconds
	    //System.out.println(x.BSearch(y));  //14 seconds
	    //System.out.println(x.RBSearch(y));  //19 seconds?
	//}
	//System.out.println(x);
	/* the RBSearch is way slower than the BSearch
	     the BSearch is faster whent the number is near the middle or end
	     the LSearch is faster when the number was generated earlier */
    }
	
}
