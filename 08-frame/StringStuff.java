public class StringStuff {
	public String frame(int r, int c) {
	String S = "";
	int Column;

	for (Column = c; Column > 0; Column = Column - 1){
		S = S + "*";}
	S = S + "\n";
	
	for (int Row = r; Row - 2> 0; Row = Row - 1){
		S = S + "*";
		for (Column = c; Column - 2 > 0; Column = Column - 1){
			S = S + " ";}
		S = S + "*";
		S = S + "\n";}

	for (Column = c; Column > 0; Column = Column - 1){
		S = S + "*";}
	S = S + "\n";

	return S;}

public String stringSplosion(String str) {
  String S = "";
  int Length = str.length();
  for (int X = 0; X <= Length; X = X + 1){
     S = S + str.substring(0, X);}
  return S;
}

public String stringX(String str) {
  int Length = str.length();
  if (str.length() < 2) {
    return str;}
  String S = str.substring(0,1);
  String Using = str.substring(0,1);
  for (int X = 1; X < Length - 1; X = X + 1) {
    if (str.substring(X, X + 1).equals("x"))
    {S = S;} else
    {S = S + str.substring(X, X + 1);}
  }
  S = S + str.substring(Length - 1, Length);
  return S;
}


}