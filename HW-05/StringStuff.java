public String nonStart(String a, String b) {
 
	String NewA = a.substring(1);
  
	String NewB = b.substring(1);
  
	return(NewA+NewB);

}


public String makeAbba(String a, String b) {

	return (a + b + b + a);

}

public int diff21(int n) {
  
	if (n>21) {
  
	return ((n-21)*2);
  
	} else 
  
	return (21-n);

}
