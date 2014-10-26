public class StoryPart1 {
	String Str = new String ("Even in the earliest recorded history, The Dungeon was recorded as the place where monsters come out of. Thoughout time, there have been many recorded raids conducted by the monsters inside. Hence, there have been many attempts to explore it, to take back all the riches that were stolen. Some explorers came back with gold, others with artifacts and treasures beyond belief. Many however, were never seen again.");

	String Pt2 = "It had become a tradition, a rite of passage, for young men to venture down into the darkness. If they came back with riches, then they were considered warriors. Of they did not, then there name would be carved onto the memorial stone along with other people who never came back.";

	String Pt3 = "However, everything changed starting from two years ago. That was when a demon lord, Thanatos, arose from the darkness and declared himself the king of The Dungeon. From there he rallied the monsters under his banner. And a month ago, assualted the capital, and kidnapped the princess.";

	String Pt4 = "His ultimatum was simple, the king, who was now way past his prime, would have a month to bless his marriage with his daughter, and in doing so, legitimize his takeover of the human kingdom.";

	String Pt5 = "Distraught and desperate to save his only offspring, he declared that whoever saves the princess will be granted any request that he could grant. All over the kingdom, many answered the call. Warriors, knights, mercenaries, for glory, gold, or the throne, all stormed into the dungeon. A few days later, another wave swept in, only to find the first group slaughtered, their corpses decorating the dungeon floor, their blood painting the walls.";

	String Pt6 = "After that, many went home. The king despaired, and his health deteriated. Having no choice, he turned to the gods. Praying for help, the king recieved an answer, you, their avatar.";


	public void StoryBegin()
		throws InterruptedException {
		int Len=Str.length();
		for (int X = 0; X < Len; X++) {
			System.out.print(Str.substring(X, X +1));
			Thread.sleep(20);
			}
		System.out.println("\n");

		Len=Pt2.length();
		for (int X = 0; X < Len; X++) {
			System.out.print(Pt2.substring(X, X +1));
			Thread.sleep(20);
			}
		System.out.println("\n");

		Len=Pt3.length();
		for (int X = 0; X < Len; X++) {
			System.out.print(Pt3.substring(X, X +1));
			Thread.sleep(20);
			}
		System.out.println("\n");

		Len=Pt4.length();
		for (int X = 0; X < Len; X++) {
			System.out.print(Pt4.substring(X, X +1));
			Thread.sleep(20);
			}
		System.out.println("\n");

		Len=Pt5.length();
		for (int X = 0; X < Len; X++) {
			System.out.print(Pt5.substring(X, X +1));
			Thread.sleep(20);
			}
		System.out.println("\n");

		Len=Pt6.length();
		for (int X = 0; X < Len; X++) {
			System.out.print(Pt6.substring(X, X +1));
			Thread.sleep(20);
			}
		System.out.println("\n");
		
	}



}