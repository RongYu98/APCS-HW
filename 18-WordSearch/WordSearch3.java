/**
 * Creates a word search puzzle
 *
 */
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
    this(10,25);
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
    public void addWordHR(String w,int row, int col){
    int r = row, c = col;
    boolean Work = false;
    if (c+w.length()<=board[0].length && r>=0 && r<board.length){
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
    }
//49th line
    public void addWordHL(String w,int row, int col){
    int r = row, c = col;
    boolean Work = false;
    if (c-w.length()>=0 && r>=0 && r<board.length){
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
    }

    public void addWordVU(String w, int row, int col){
    int r = row, c = col;
    boolean Work = false;
    if (r-w.length()>=0 && r<board.length && c>=0 && c<board[0].length){
        Work = true;}
    if (Work){
    for (int i=0; i<w.length(); i++){
        if (board[r-1][c]!='.'){
            if (board[r-1][c]!= w.charAt(i)){
            Work = false;}
        }
        r--;} 
        }//if
    r=row;
    if (Work){
        for (int i=0;i<w.length();i++){
        board[r-1][c] = w.charAt(i);
        r--;
        }}
    }

    public void addWordVD(String w, int row, int col){
    int r = row, c = col;
    boolean Work = false;
    if (r+w.length()<=board.length && r>0 && c>=0 && c<board[0].length){
        Work = true;}
    if (Work){
    for (int i=0; i<w.length(); i++){
        if (board[r-1][c]!='.'){
            if (board[r-1][c]!= w.charAt(i)){
            Work = false;}
        }
        r++;} 
        }//if
    r=row;
    if (Work){
        for (int i=0;i<w.length();i++){
        board[r-1][c] = w.charAt(i);
        r++;
        }}
    //System.out.println(Work);
    }

    public static void main(String[] args) {
    WordSearch3 w = new WordSearch3();
    //System.out.println(w);
    w.addWordHR("hello",3,20);
    w.addWordHR("look",3,8);
    w.addWordHR("looks",3,8);
    w.addWordHR("loh",3,8);
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
    w.addWordVD("hello", -6, 1);

    System.out.println(w);
    }
}