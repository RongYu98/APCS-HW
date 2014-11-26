public  class Sarray{
    private String[] data;
    private int last;
    
    public Sarray(){
	this(10);
    }

    public Sarray(int n){
	data=new String[n];
	last=0;
    }

    public String toString(){
	String Answer = "";
	for (int i=0;i<data.length;i++){
	    Answer+=data[i];
	    Answer+=", ";
	}return Answer;
    }
    public boolean add(String n){
    if (last==data.length-1){
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
	System.out.println(V);
	System.out.println(V.add("hi"));
	System.out.println(V.size());
	System.out.println(V.get(0));
	System.out.println(V.add("go and die"));
	//System.out.println(V.remove(0));
	System.out.println(V);
    }
}
