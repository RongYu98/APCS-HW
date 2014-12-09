import java.util.*;
import java.io.*;
public  class Sarray{
    private String[] data;
    private int last;
    
    public Sarray(){
	this(20000);
    }

    public Sarray(int n){
	data=new String[n];
	last=0;
    }

    public String[] getData(){
	return data;
    }

    public void iSort(){
	int n=0;
	for (n=0; n<data.length; n++){
		Sorter(data, n);}
    }
    public boolean Sorter(String[] ArrayS, int n){
	//see if 0 to n is properly sorted
	String word = ArrayS[n];
	int i;
	for (i=n; i>0 && word.compareTo(ArrayS[i-1])<0; i--){
	    ArrayS[i]=ArrayS[i-1];}
	ArrayS[i]=word;
	return true;
    }
    
    public void sSort(){
	String smallest;
	for (int i=0; i<data.length; i++){
	    int n=i;
	    smallest=data[i];
	    for (int z=i; z<data.length; z++){
		if (smallest.compareTo(data[z])>0){
		    smallest=data[z];
		    n=z;}
	    }
	    data[n]=data[i];
	    data[i]=smallest;	    
	}
    }
    
    public void bSort(){
	for (int i=0; i<data.length; i++){
	    for (int z=0; z<data.length-1; z++){
		String str;
		if (data[z].compareTo(data[z+1])>0){
		    str=data[z];
		    data[z]=data[z+1];
		    data[z+1]=str;}
	    }
	}
    }

    public void BuiltIn(){
	/*built in sorter. If only a fraction, Array.sort(data, 0, n)*/
	Arrays.sort(data);
	//for arrayLists, Collections.sort(data)
    }
    
    public String toString(){
	String Answer = "";
	for (int i=0;i<data.length;i++){
	    Answer+=data[i];
	    Answer+=", ";
	}return Answer;
    }
    public boolean add(String n){
    if (last==data.length){
        String[] ph = data;
        data = new String[data.length+1];
        for ( int i=0; i<ph.length;i++){
        data[i]=ph[i];
        }
    }
        data[last]=n;
        last++;
        return true;
    }

    public void add(int index, String n){
    if (data.length-1==last){
        String PlaceHolder[] = data;
        data = new String[data.length+1];
        for (int i=0;i<index; i++){
	    data[i]=PlaceHolder[i];
        }
        data[index]=n;
        for (int i=index+1; i<data.length+1; i++){
	    data[i]=PlaceHolder[i-1];
        }
    } else {
        for (int i=last+1; i>index; i--){
        data[i] = data[i-1];}
        data[index]= n;}
    last++;
    }

    
    public String get(int index){
    if (index>data.length){
        throw new ArrayIndexOutOfBoundsException();}
    else {
        return data[index];}
    }
    
    public int size(){
    return last;
    }

    public String remove(int index){
	String X = data[index];
	for (int i=index; i<last; i++){
	    data[i]=data[i+1];
	}
	data[last]=null;
	last--;
	return X;
    }

    public void ADDY(int x){
	for (int i=0; i<x; i++){
	    add("a");
	    add("b");
	    add("c");
	    add("d");
	    add("e");
	    add("f");
	    add("g");
	    add("h");
	    add("i");
	    add("j");
	    add("k");
	    add("l");
	    add("m");
	    add("n");
	    add("o");
	    add("p");
	    add("q");
	    add("r");
	    add("s");
	    add("t");
	}
    }
    public static void main(String[] args){
	Sarray V = new Sarray();
	//System.out.println(V);
	V.ADDY(1000);
	V.add("aa");
	V.add("ab");
	V.add("bb");
	V.add("bc");
	V.add("cc");
	V.add("cd");
	V.add("dd");
	V.add("de");
	V.add("ee");
	V.add("ef");
	V.add("ff");
        V.add("aa");
	V.add("ab");
	V.add("bb");
	V.add("bc");
	V.add("cc");
	V.add("cd");
	V.add("dd");
	V.add("de");
	V.add("ee");
	V.add("ef");
	V.add("ff");
	//System.out.println(V.size());
	//System.out.println(V.get(0));
	//System.out.println(V.add("go and die"));
	//System.out.println(V.remove(0));
	//System.out.println(V);
	
	//V.bSort(); //1.981
	//V.sSort(); //0.934
	//V.iSort(); //0.612
	//ISort is faster
	//V.BuiltIn(); //0.445

	/* The builtin one is a lot faster than the i,b,
	   s sorts that I wrote
	   I ran the code with everythign blacked out, and
	   the code takes .450 to add all the things....
	   So my data is very inaccurate with the times
	*/
	
	//System.out.println(V);
    }
}
