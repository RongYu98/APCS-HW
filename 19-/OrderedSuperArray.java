public class OrderedSuperArray extends Sarray{
    
    private String[] data;
    private int last;
    
    public OrderedSuperArray(){
	this(10);
    }

    public OrderedSuperArray(int n){
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
    /*
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
    */
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
    /*
    public OrderedSuperArray(){
	super(10);}	
    */
    public boolean add(String n){
	if (data.length==super.size()){
	    //This means that the array is full
	    String [] PlaceHolder=data;
	    data = new String[data.length+1];

	    String a;
	    int z=PlaceHolder.length-1;
	    for (int i=0; i<PlaceHolder.length; i++){
		a=data[i];
		if (n.compareTo(a)>0){}
		else{z=i-1; break;}}
	    
	    for (int i=0; i<z; i++){
		data[i]=PlaceHolder[i];}
	    data[z]=n;
	    for (int i=z-1; i<PlaceHolder.length; i++){
		data[i+1]=PlaceHolder[i];
	    }
		
	}
	return true;}

    public static void main(String[] arfs){}
}
