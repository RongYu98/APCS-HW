public class Shapes { 
	public String box(int r, int c){ 
		String s= ""; 
		int row = 0; 
		int col; 
		while (row<r){ 
			col = c; 
			 while (col>0){ 
				s = s + "*"; 
				col=col-1; 
				} 
			s=s+"\n"; 
			row=row+1; 
			} 
		return s; 
   		} 

	
	public String tri1(int h){
		int x = h;
		int length = 1;
		String A = "";
		while (x>0) {
			int lengthB = length;
			while (lengthB>0) {
				A = A + "*";
				lengthB = lengthB - 1;
			} A = A + "\n";
			x = x - 1;
			length = length + 1;}
		return A;
		}

	public String tri2(int h){
		int NewH= h;
		int x = NewH;
		int Colum = 1;
		
		String A = "";
		while (NewH > 0){
			while (x > Colum) {
				A = A + " ";
				x = x -1;
			} 
			x = h;
			int StandColum = Colum;
			while (Colum > 0) {
				A = A + "*";
				Colum= Colum -1;
				}
			StandColum = StandColum + 1;
			Colum = StandColum;
			A = A + "\n";
			NewH= NewH - 1;	
			}
		return  A;
}

	public String tri3(int h){
    		int Height = h;
    		int Column = 1;
    		int NewColumn = Column;
   		String S = "";
   		while (h > 0) {
			NewColumn = Column;
        			while ((Height - NewColumn) > 0) {
        				S = S + ".";
        				NewColumn = NewColumn + 1; }
        			NewColumn = Column;
        			while ((NewColumn - 1) > 0) {
        				S = S + "*";
            				NewColumn = NewColumn - 1;}
        			S = S + "*";
        			NewColumn = Column;
        			while ((NewColumn - 1) > 0) {
        				S = S + "*";
            				NewColumn = NewColumn - 1;}
			NewColumn = Column;
        			while ((Height - NewColumn) > 0) {
       				S = S + ".";
        				NewColumn = NewColumn + 1; }
        			Column = Column + 1;
        			h = h - 1;
			S = S + "\n"; }
    return S;}


	public String diamond(int h){
		int H = h;
		String S = "";
		int Counter = 1;
		int Half = h / 2;
		int UsingCounter = Counter;
		int X;

		//BEGINING
		while (Half > 0) {
		X = 0;
		while (((H - Counter) / 2) - X > 0) {
			S = S + " ";
			X = X + 1;}

		UsingCounter = Counter;
		while (UsingCounter > 0) { 
			UsingCounter = UsingCounter - 1;
			S = S + "*";}

		X = 0;
		while (((H - Counter) / 2) - X > 0) {
			S = S + " ";
			X = X + 1;}

		S = S + "\n";
		Half = Half - 1;
		Counter = Counter + 2; }

		//MIDDLE
		while (H > 0) {
			S = S + "*";
			H = H - 1;}

		S = S + " \n";
		Half = h / 2;
		
		//END
		Counter = Half + 2;
		UsingCounter = Counter;
		X = Half + 1;
		int x = X;
		while (Half > 0) {
			while (Half - X < 0){
				S = S + " ";
				X = X - 1;}
		
		while (UsingCounter > 0) {
			S = S + "*";
			UsingCounter = UsingCounter - 1; }

		X =x;
			while (Half - X < 0){
				S = S + " ";
				X = X - 1;}
		
		S = S + "\n";
		Half = Half - 1;
		X =x;
		Counter = Counter - 2;
		UsingCounter = Counter;
		}


	return S;
	}
//Is there a easier way? This took me around 2 hours.


	public String tri4(int h){
		String S = "";
		int H = h;
		int HH = H;
		int Counter = 0;
		int UsingCounter = Counter;

		while (H > 0){
			HH = H;
			while (UsingCounter > 0){
				S = S + " ";
				UsingCounter = UsingCounter - 1;}
			while (HH > 0) {
				S = S + "*";
				HH = HH - 1;}
			Counter = Counter + 1;
			UsingCounter = Counter;
			S = S + "\n";
			H = H - 1;}

		return S; }
} 

