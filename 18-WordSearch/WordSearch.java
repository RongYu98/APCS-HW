public class WordSearch{

//I butchered my code.... it doesn't even work now...
//And I have no idea why......
//This is the first version I tried

private char[][] board;
boolean Works;
public WordSearch(int r, int c){
    board = new char[r][c];
    for (int i = 0; i < board.length; i++) {
    for (int j = 0; j < board[i].length; j++) {
        board[i][j]='.';
    }
    }
}
    public WordSearch(){
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
    Works = true;
    if (c+w.length()<=board[r].length){
        for (int i=0;i<w.length();i++){
            if (!(board[r][c]=='.')){
                if (!(board[r][c]==w.charAt(i))){
                    Works = false;
                    break;}
                }
            c++;
        }
    }else {Works = false;}
    if (Works){
        for (int i=0;i<w.length();i++){
        board[r][c] = w.charAt(i);
        c++;}}    
    }


    public void addWordHL(String w,int row, int col){
    int r = row, c = col;
    Works = true;
    if (c-w.length()>=0){
        for (int i=0;i<w.length();i++){
            if (!(board[r][c]=='.')){
                if (!(board[r][c]==w.charAt(i))){
                    Works = false;
                    break;}
            }
            c--;
        }
    }else {Works = false;}

    if (Works){
        for (int i=0;i<w.length();i++){
        board[r][c] = w.charAt(i);
        c--;
        }}
    }
    public static void main(String[] args) {
    WordSearch w = new WordSearch();
    //System.out.println(w);
    w.addWordHR("hello",3,25);
    w.addWordHR("look",3,8);
    w.addWordHR("look",3,10);
    w.addWordHR("looks",3,10);
    w.addWordHL("look",3,8);
    w.addWordHL("look",3,5);
    w.addWordHL("look",3,1);

    System.out.println(w);
    }
}