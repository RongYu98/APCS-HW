public  class Sarray{
    private String[] data;
    private int last;
    
    public Sarray(){
	this(5);
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
    
    /*public set(int index, int i){
    int Z;
    Z = data[index];
    data[index]=i;
    return Z;
    }*/

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
    
    public static void main(String[] args){
	Sarray V = new Sarray();
	//System.out.println(V);
	System.out.println(V.add("aa"));
	System.out.println(V.add("ab"));
	System.out.println(V.add("bb"));
	System.out.println(V.add("bc"));
	System.out.println(V.add("cc"));
	System.out.println(V.add("cd"));
	System.out.println(V.add("dd"));
	System.out.println(V.add("de"));
	System.out.println(V.add("ee"));
	System.out.println(V.add("ef"));
	System.out.println(V.add("ff"));
	System.out.println(V.add("aa"));
	System.out.println(V.add("ab"));
	System.out.println(V.add("bb"));
	System.out.println(V.add("bc"));
	System.out.println(V.add("cc"));
	System.out.println(V.add("cd"));
	System.out.println(V.add("dd"));
	System.out.println(V.add("de"));
	System.out.println(V.add("ee"));
	System.out.println(V.add("ef"));
	System.out.println(V.add("ff"));
	//System.out.println(V.size());
	//System.out.println(V.get(0));
	//System.out.println(V.add("go and die"));
	//System.out.println(V.remove(0));
	System.out.println(V);
	V.iSort();
	System.out.println(V);
    }
}
