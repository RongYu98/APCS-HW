public class OrderedSuperArray extends Sarray{

    private String[] data;
    private int last = 0;

    public OrderedSuperArray(){
	data=super.getData();
    }

    public String toString(){
	String Answer = "";
	for (int i=0;i<data.length;i++){
	    Answer+=data[i];
	    Answer+=", ";
	}return Answer;
    }

    public void Add(String S){
	if (last==data.length){
	    String[] ph= data;
	    data=new String[ph.length+1];
	    for (int i=0; i<ph.length; i++){
	        data[i]=ph[i];}
	}
	if (last==0){
	    data[0]=S;
	    last++;}
	else {
	    int z=0;
	    for (int i=0; i<data.length;i++){
	        if (data[i]==null){
	            z=i; break;}
	        else {
	            if (S.compareTo(data[i])<0){
		z=i; break;}
	            }
	    }
	    for (int i=data.length-1;i>z;i--){
	        data[i]=data[i-1];}
	    data[z]=S;
	}
    }
		

    public static void main(String[] args){
	OrderedSuperArray X = new OrderedSuperArray();
	System.out.println(X);
	X.Add("ba");
	X.Add("asa");
	X.Add("ca");
	X.Add("sa");
	X.Add("ha");
	X.Add("aa");
	System.out.println(X);
	}
}
