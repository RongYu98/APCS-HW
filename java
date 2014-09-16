
public class Driver {
       public static void main(String[] args){
       	      /* we are declaring G to be a local
	      variable of type Greeter(which is 
	      class we defined). In java we have
	      to say what type of stuff a variable 
	      hold
	      */
	      Greeter g;
	      /* 
	      1. allocate the memory for a new greeter instance
	      2. set up the greeter (java does this)
	      3. returns the memory adress (location) for it
	      4. stores that adress in G

	      g stroes the reference to the 
	      */
	      System.out.println(g)
	      
	      //call the greet method on g
	      g = new Greeter();

public class Driver2 {
       public static void main(String[] args) {
       Greeter g1 = new Greeter();
       greeter g2.g3
       g2 = new Greeter();
       g3=g1
       g1.greet();
       g2.greet();

       g1= new Greeter();
       //changes g1, not reassigning g3

       System.out.println(g1: +"g1);
       System.out.println(g2: +"g1);
       System.out.println(g3: +"g3);
}
}