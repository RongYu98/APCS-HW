public class StringStuff{


//5 minutes
public String frontTimes(String str, int n) {
  String S = "";
  if (str.length()<3) {
    while (n>0) {
      S = S + str;
      n = n - 1;
      }
    return S;
    }
  else {
    String s = str.substring(0, 3);
    while (n>0) {
    S = S + s;
    n = n - 1;
    }
    return S;
    }
}

//5 minutes
public String stringBits(String str) {
  String S = "";
  while (str.length()>0) {
    S = S + str.substring(0, 1);
    if (str.length()<2) {
      str = str.substring(1);
      } else {
      str = str.substring(2);
      }
    }
  return S;
}

//6 minutes
public String stringYak(String str) {
  String S = "";
  while (str.length()>0) {
    if (str.substring(0,1).equals("y") && str.length()>2 && str.substring(2,3).equals("k")) {
      str = str.substring(3);
      }else{
      S = S + str.substring(0,1);
      str = str.substring(1);
      }
      }
  return S;
}

//9 minutes
public int stringMatch(String a, String b) {
  int C = 0;
  String A = "";
  String B = "";
  while (a.length()>1 && b.length()>1){
    A = a.substring(0,1) + a.substring(1,2);
    B = b.substring(0,1) + b.substring(1,2);
    if (A.equals(B)) {
      C = C + 1; 
      }
    a = a.substring(1);
    b = b.substring(1);
    }
  return C;
}


}