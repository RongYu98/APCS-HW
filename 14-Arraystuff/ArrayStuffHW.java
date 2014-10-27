import java.util.*;
public class ArrayStuffHW {

	public int Find(int n, int[] A) {
		for (int i=0; i< A.length; i++){
			if (A[i] == n){
				return i;}
			}
		return -1;
	}

	public int Maxval(int[] A) {
		int Compare = A[0];
		for (int i=0; i<A.length; i++){
			if (Compare<A[i]) {
				Compare = A[i];}
			}
		return Compare;
		}



	public static void main(String[] args){
		Random rnd;
		int[] anArray = new int[100];
		rnd = new Random();
		for (int i=0;i<anArray.length;i++){
	   		anArray[i] = 75+rnd.nextInt(76);}

		ArrayStuffHW Work = new ArrayStuffHW();
		
		System.out.println(Work.Maxval(anArray));
		System.out.println(Work.Find(109, anArray));
	}

}