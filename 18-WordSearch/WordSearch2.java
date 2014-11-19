public class WordSearch2{

//I gave up on the first, so I worked on a new way...
//Then I killed it when I tried to add the work boolean...

private char[][] board;

public WordSearch2(int r, int c){
    board = new char[r][c];
    for (int i = 0; i < board.length; i++) {
    for (int j = 0; j < board[i].length; j++) {
        board[i][j]='.';
    }
    }
}

    public WordSearch2(){
    this(20,30);
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

    public void addWordHR(String w,int row, int col){
    int r = row, c = col;
    boolean Works = true;

    if (c+w.length()<=board[r].length){
    for (int i =0; i<w.length(); i++){
        if ((board[r][c]==w.charAt(i)) || (board[r][c] == '.')){System.out.println(board[r][c]);}

/* The problem is here board[r][c]. The code below printed out board[r][c] 
and it was L, when it should have been '.'*/

        else {Works = false; //System.out.println(i); System.out.println(board[r][c]);
            break;}

        c++;}
    }else{Works = false;}

    if (Works){
        for (int i=0;i<w.length();i++){
        board[r][c] = w.charAt(i);
        c++;}}    
    }


    public void addWordHL(String w,int row, int col){
    int r = row, c = col; 
    boolean Work = true;
    if (c-w.length()>=0){
    for (int i =0; i<w.length(); i++){
        if ((board[r][c]==w.charAt(i)) || (board[r][c] == '.')){}
        else {Work = false; 
            break;}
        c--;}
    }else{Work = false;}

    if (Work){
        for (int i=0;i<w.length();i++){
        board[r][c] = w.charAt(i);
        c--;
        }}
    }

    public static void main(String[] args) {
    WordSearch2 w = new WordSearch2();
    //System.out.println(w);
    w.addWordHR("hello",4,20);
    w.addWordHR("look",3,8);
    w.addWordHR("looks",3,8);
    //w.addWordHR("loos",3,8);
    w.addWordHL("look",3,1);
    w.addWordHL("look",3,5);

    System.out.println(w);
    }
}