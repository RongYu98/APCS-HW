import java.io.*;
import java.util.*;

public class ArrayLists{
    public static void main(String[] args){

    int X=0;
    ArrayList<Integer> AL;
    AL = new ArrayList<Integer>();

    Random R = new Random();
    for (int i=0; i<100; i++){
    AL.add(i);  }

    Random r = new Random();

    //System.out.println(AL);
    for (int i=AL.size(); i>0; i--){
        X=r.nextInt(i);
    AL.add(AL.get(X));
    AL.remove(X);
    }
    //System.out.println(AL);

}
}