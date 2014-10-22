public class Driver{
	public static void main(String[] args){
		StringStuff A = new StringStuff();
		System.out.println(A.nonStart("HH", "II!"));
		System.out.println(A.makeAbba("HI", "!"));
		System.out.println(A.diff21(22));
		System.out.println(A.lastDigit(11, 21, 12));
		System.out.println(A.nearHundred(101));
		System.out.println(A.teaParty(5, 10));
		}
}
