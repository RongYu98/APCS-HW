public class StringStuff{

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

//Classwork with Kathryn 
/*Working :)*/
public boolean lastDigit(int a, int b, int c) {
  int A = a % 10;
  int B = b % 10;
  int C = c % 10;
  if (A == B) {
  return true;
  } else if (A==C){
  return true;
  } else if (B==C){
  return true;
  } else return false;

}

public boolean nearHundred(int n) {
  return ((Math.abs(100 - n)) <= 10 ||(Math.abs(200 - n) <=10));
}

public int teaParty(int tea, int candy) {
  if (tea < 5 || candy < 5) {
   return 0;
   } else if (tea >= (candy * 2) || candy >= (tea * 2)) {
   	return 2;
   }
 	return 1;

}
}