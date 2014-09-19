public class Driver2{
    /*
    public static void main(String[] args){
	Greeter g1= new Greeter();
	g1.setGreeting("Hi there!");
	System.out.println(g1.greet());
    */
    System.outprintln("before the constructor is called");
    Greeter g2= new Greeter("Howdy");
	System.out.println("Afetr the constructor");
	System.out.println(g2.greet());

    }
}
