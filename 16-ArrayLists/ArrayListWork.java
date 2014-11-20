import java.io.*;
import java.util.*;

public class ArrayListWork{

    public static void main(String[] args){

        ArrayList<Integer> AL = new ArrayList<Integer>();

        Random R = new Random();
        for (int i=0; i<50; i++){
            AL.add(R.nextInt(2));    }

        System.out.println(AL);

        for (int i=0; i<AL.size(); i++) {
            if (i+1<AL.size()){
                if ( AL.get(i)==AL.get(i+1) ){
                    AL.remove(i+1);
	  i=i-1;
         }  }  }
        System.out.println(AL);
        }
}