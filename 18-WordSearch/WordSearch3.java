/**
 * Creates a word search puzzle
 *
 */
import java.util.*;

public class WordSearch3{

    private char[][] board;
    public WordSearch3(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }
    public WordSearch3(){
	this(15,25);
    }
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }
    //29th line
    public boolean addWordHR(String w,int row, int col){
	int r = row, c = col;
	boolean Work = false;
	if (c+w.length()<=board[0].length && r>=0 && r<=board.length){
	    Work = true;}
	if (Work){
	    for (int i=0;i<w.length();i++){
		if (board[r][c] != '.'){
		    if (board[r][c]!= w.charAt(i)){
			Work = false;}
		}
		c++;} 
	}//if
	c = col; 
	if (Work){
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		c++;}}    
	return Work;
    }
    //49th line
    public boolean addWordHL(String w,int row, int col){
	int r = row, c = col;
	boolean Work = false;
	if (c-w.length()>=0 && r>=0 && r<=board.length){
	    Work = true;}
	if (Work){
	    for (int i=0;i<w.length();i++){
		if (board[r][c] != '.'){
		    if (board[r][c]!= w.charAt(i)){
			Work = false;}
		}
		c--;} 
        }//if
	c = col; 
	if (Work){
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		c--;
	    }}
	return Work;
    }

    public boolean addWordVU(String w, int row, int col){
	int r = row, c = col;
	boolean Work = false;
	if (r-w.length()>=0 && r<board.length && c>=0 && c<=board[0].length){
	    Work = true;}
	if (Work){
	    for (int i=0; i<w.length(); i++){
		if (board[r][c]!='.'){
		    if (board[r][c]!= w.charAt(i)){
			Work = false;}
		}
		r--;} 
        }//if
	r=row;
	if (Work){
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		r--;
	    }}
	return Work;
    }

    public boolean addWordVD(String w, int row, int col){
	int r = row, c = col;
	boolean Work = false;
	if (r+w.length()<=board.length && r>0 && c>=0 && c<=board[0].length){
	    Work = true;}
	if (Work){
	    for (int i=0; i<w.length(); i++){
		if (board[r][c]!='.'){
		    if (board[r][c]!= w.charAt(i)){
			Work = false;}
		}
		r++;} 
        }//if
	r=row;
	if (Work){
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		r++;
	    }}
	return Work;
    }

    public boolean addWordDDL(String w, int row, int col){
	int r = row, c = col;
	boolean Work = false;
	if (r>=0 && r+w.length()<=board.length && c-w.length()>=0 && c<=board[0].length){
	    Work = true;}
	if (Work){
	    for (int i=0; i<w.length(); i++){
		if (board[r][c]!='.'){
		    if (board[r][c]!= w.charAt(i)){
			Work = false;}
		}
		r++; c--;}
	}
	r = row; c= col;
	//System.out.println(Work);
	if (Work){
	    for (int i=0; i<w.length(); i++){
		 board[r][c]= w.charAt(i);
		 r++;c--;
	    }}
	 return Work;   
    }

    public boolean addWordDDR(String w, int row, int col){
	int r = row, c = col;
	boolean Work = false;
	if (r>=0 && r+w.length()<=board.length && c>=0 && c+w.length()<=board[0].length){
	    Work = true;}
	if (Work){
	    for (int i=0; i<w.length(); i++){
		if (board[r][c]!='.'){
		    if (board[r][c]!= w.charAt(i)){
			Work = false;}
		}
		r++; c++;}
	}
	r = row; c= col;
	//System.out.println(Work);
	if (Work){
	    for (int i=0; i<w.length(); i++){
		 board[r][c]= w.charAt(i);
		 r++;c++;
	    }}
	return Work;    
    }

    public boolean addWordDUR(String w, int row, int col){
	int r = row, c = col;
	boolean Work = false;
	if (r-w.length()>= 0 && r<board.length && c>=0 && c+w.length()<=board[0].length){
	    Work = true;}
	if (Work){
	    for (int i=0; i<w.length(); i++){
		if (board[r][c]!='.'){
		    if (board[r][c]!= w.charAt(i)){
			Work = false;}
		}
		r--; c++;}
	}
	r = row; c= col;
	//System.out.println(Work);
	if (Work){
	    for (int i=0; i<w.length(); i++){
		 board[r][c]= w.charAt(i);
		 r--;c++;
	    }}
	return Work;    
    }	
    

    public boolean addWordDUL(String w, int row, int col){
	int r = row, c = col;
	boolean Work = false;
	if (r-w.length()>= 0 && r<board.length && c-w.length()>=0 && c<=board[0].length){
	    Work = true;}
	if (Work){
	    for (int i=0; i<w.length(); i++){
		if (board[r][c]!='.'){
		    if (board[r][c]!= w.charAt(i)){
			Work = false;}
		}
		r--; c--;}
	}
	r = row; c= col;
	System.out.println(Work);
	if (Work){
	    for (int i=0; i<w.length(); i++){
		 board[r][c]= w.charAt(i);
		 r--;c--;
	    }}
	 return Work;   
    }

    public boolean addWord(String w){
	Random rand = new Random();
	int r=0;
	boolean Works=false;
	for (int i=5; i>0; i--){
		r=rand.nextInt(8);
		if (r==7){Works = addWordHR(w, rand.nextInt(15), rand.nextInt(25));}
		else if (r==6){Works = addWordHL(w, rand.nextInt(15), rand.nextInt(25));}
		else if (r==5){Works = addWordVU(w, rand.nextInt(15), rand.nextInt(25));}
		else if (r==4){Works = addWordVD(w, rand.nextInt(15), rand.nextInt(25));}
		else if (r==3){Works = addWordDDL(w, rand.nextInt(15), rand.nextInt(25));}
		else if (r==2){Works = addWordDDR(w, rand.nextInt(15), rand.nextInt(25));}
		else if (r==1){Works = addWordDUR(w, rand.nextInt(15), rand.nextInt(25));}
		else{Works = addWordDUL(w, rand.nextInt(15), rand.nextInt(25));}
	if (Works){ break;}
	}
	return Works;
}


    public static void main(String[] args) {
	WordSearch3 w = new WordSearch3();
	//System.out.println(w);
	/*
	  w.addWordHR("hello",3,20);
	  //w.addWordHR("look",3,8);
	  //w.addWordHR("looks",3,8);
	  //w.addWordHR("loh",3,8);
	  w.addWordHL("look",3,1);
	  w.addWordHL("look",3,5);
	  w.addWordHL("looks",3,5);
	  w.addWordHL("los",3,5);
	  w.addWordHR("hello",100,5);
	  w.addWordHR("hello",30,555);
	  w.addWordVU("hello", 5, 0);
	  w.addWordVU("hello", 5, 1);
	  w.addWordVU("hello", 4, 0);
	  w.addWordVU("hfllo", 5, 1);
	  w.addWordVU("shello", 6, 1);
	  w.addWordVD("hello", 5, 1);
	  w.addWordVD("hello", 5, 2);
	  w.addWordVD("hello", 4, 0);
	  w.addWordVD("hello", 3, 0);
	*/
	/*
      	w.addWordDDL("hello", 1, 1);
	w.addWordDDL("hello", 6, 5);
	w.addWordDDL("hello", 5, 24);
	w.addWordDDL("hellos", 5, 24);
	w.addWordDDL("hello", 5, 4);
	w.addWordDDL("hello", 5, 5);
	w.addWordDDL("hello", 8, 15);//
	w.addWordDDL("hello", -6, 1);//no work
	w.addWordDDL("hello", 10, 10);//no work
	*/
	/*
	w.addWordDDR("hello", 0, 5);
	w.addWordDDR("hello", 5, 20);
	//w.addWordDDR("hellos", 5, 25);
	w.addWordDDR("hello", 3, 4);
	w.addWordDDR("hello", 5, 5);
	*/
	/*
	w.addWordDUR("hello", 5, 0);
	w.addWordDUR("hello", 6, 5);
	w.addWordDUR("hello", 6, 6);
	w.addWordDUR("hello", 0, 0);
	w.addWordDUR("hello", 10, 20);
	w.addWordDUR("hello", 5, 19);
	*/
	/*
	w.addWordDUL("hello", 5, 0);
	w.addWordDUL("hello", 5, 5);
	w.addWordDUL("hello", 6, 6);
	w.addWordDUL("hello", 0, 0);
	w.addWordDUL("hello", 10, 20);
	w.addWordDUL("shello", 11, 21);
	w.addWordDUL("hello", 5, 19);
	*/
	System.out.println(w.addWord("Hello"));
	System.out.println(w.addWord("Hellos"));
	System.out.println(w.addWord("Hello"));
	System.out.println(w.addWord("Hellos"));	
	System.out.println(w.addWord("Hello"));	
	System.out.println(w.addWord("Hellos"));	
	System.out.println(w.addWord("Hello"));	
	System.out.println(w.addWord("Hellos"));	
	System.out.println(w.addWord("Hello"));	
	System.out.println(w);
    }
////////////////The board starts at 0, then 1 , 2, 3
}
