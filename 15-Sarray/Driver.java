public class Driver{
	public static void main(String[] args){
		Sarray V = new Sarray();
		//System.out.println(V.add(10));
		//System.out.println(V.size());
		//System.out.println(V.get(0));
		//System.out.println(V.set(0, 20));
		//System.out.println(V.get(0));
		//System.out.println(V.remove(0));
		try {
			V.get(20);
		} catch (Exception e){
			System.out.println("YAY! It doesn't work!!!!");
		}
	}
}