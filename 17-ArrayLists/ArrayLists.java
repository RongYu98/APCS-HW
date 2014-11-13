import java.io.*;
import java.util.*;

public class ArrayLists{
    public static void main(String[] args){

/////////ArrayList (Works
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

///////////////Arrays (Can't find bug...)
/*
    
    int Z = 10;
    int[] IntArray = new int[Z];
    for (int i=0; i<Z; i++){
        IntArray[i]=i;}
    
    boolean is0up = false;
    int[] Newbie = IntArray;

    int t=0;
    while (t<IntArray.length){
        X=r.nextInt(Z);
        if (!(IntArray[X]==(0))){
            Newbie[t]=IntArray[X];
            IntArray[X]=0;
            t++;}
        else if(!is0up){
            Newbie[t]=IntArray[X];
            is0up=true;
            t++;
        } 
    }

    for (int i=0; i<Newbie.length; i++){
        System.out.print(Newbie[i]);
    }
    //System.out.println();
    for (int i=0; i<Newbie.length; i++){
        System.out.print(IntArray[i]);
    }
    //System.out.println();

*/


}
}