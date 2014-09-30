public class Driver {
	public static void main(String[] args) {
		StringStuff S = new StringStuff();
		System.out.println(S.frontTimes("HI", 3));
		System.out.println(S.stringBits("HIHIHIHI"));
		System.out.println(S.stringYak("yakHIHIyak"));
		System.out.println(S.stringMatch("HIHIHI", "HIHIHI"));
}}