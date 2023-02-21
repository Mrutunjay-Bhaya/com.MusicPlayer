

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class SongsLibrary {

	public void allSongs() {

		Set<String> allSongs = new HashSet<String>();
		allSongs.add("s1");
		allSongs.add("s2");
		allSongs.add("s3");
		allSongs.add("s4");
		allSongs.add("s5");
		allSongs.add("s6");
		allSongs.add("s7");
		allSongs.add("s8");
		allSongs.add("s9");
		allSongs.add("s10");
		allSongs.add("s11");
		allSongs.add("s12");
		allSongs.add("s13");
		allSongs.add("s14");
		allSongs.add("s15");
		allSongs.add("s16");

		System.out.print("All Songs List: " + allSongs);
		System.out.println();

		LinkedList<String> recentPlaySongs = new LinkedList<String>();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Song From All Songs List: ");
		System.out.println();
		while(true) {
			String userInput = sc.next();
			if (allSongs.contains(userInput)) {
				if (!(recentPlaySongs.contains(userInput))) {
					if (recentPlaySongs.size() > 2) {
						recentPlaySongs.removeFirst();
					}
					recentPlaySongs.add(userInput);
				}
				System.out.println("Recent Play Songs Is: " + recentPlaySongs);
				System.out.print("Enter A Song From All Songs List: ");
				System.out.println();
			} else {
				System.out.println("This songs is Not Found In Library");
				System.out.print("Enter A Song From All Songs List: ");
			}

		}
	}

	@Test
	public void testRecentPlayList() {
		SongsLibrary cd = new SongsLibrary();
		cd.allSongs();

	}

}
