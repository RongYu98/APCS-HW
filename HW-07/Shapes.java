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
} 

