import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.ConcurrentSkipListSet;

public class TimeTests {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> arraylist = new ArrayList<>();

		LowerCaseTrie trie = new LowerCaseTrie();
		LinkedList<String> linkedlist = new LinkedList<>();
		HashSet<String> hashset = new HashSet<>();
		ConcurrentSkipListSet<String> skiplist = new ConcurrentSkipListSet<>();

		FileReader f = new FileReader("englishWords.txt");
		Scanner sc = new Scanner(f);
		System.out.print("Loading all words... ");
		while (sc.hasNext()) {
			String s = sc.nextLine();
			arraylist.add(s);
		}
		sc.close();
		System.out.println("Done");

		int numTrials = 200000;

		// test the time it takes to do this
		// read the time before and after this for-loop
		long startTimeAdd = System.currentTimeMillis();
		for (int i = 0; i < numTrials; i++) {
			int randomIndex = (int) (Math.random() * arraylist.size());
			String randomWord = arraylist.get(randomIndex);
			// add this randomWord to a data structure you are testing
			//trie.add(randomWord);
			linkedlist.add(randomWord);
			// hashset.add(randomWord);
			// skiplist.add(randomWord);
		}
		long endTimeAdd = System.currentTimeMillis();
		long elapsedTimeAdd = (endTimeAdd - startTimeAdd);
		;
		System.out.println("Add method:");
		System.out.println("Time Elapsed: " + elapsedTimeAdd + " milliseconds.");

		long startTimeContains = System.currentTimeMillis();
		for (int i = 0; i < numTrials; i++) {
			int randomIndex = (int) (Math.random() * arraylist.size());
			String randomWord = arraylist.get(randomIndex);
			//trie.contains(randomWord);
			linkedlist.contains(randomWord);
			// hashset.contains(randomWord);
			// skiplist.contains(randomWord);
		}
		long endTimeContains = System.currentTimeMillis();
		long elapsedTimeContains = (endTimeContains - startTimeContains);
		System.out.println("Contains method:");
		System.out.println("Time Elapsed: " + elapsedTimeContains + " milliseconds.");

		long startTimeRemove = System.currentTimeMillis();
		for (int i = 0; i < numTrials; i++) {
			int randomIndex = (int) (Math.random() * arraylist.size());
			String randomWord = arraylist.get(randomIndex);
			// trie.remove(randomWord);
			linkedlist.remove(randomWord);
			// hashset.remove(randomWord);
			// skiplist.remove(randomWord);
		}
		long endTimeRemove = System.currentTimeMillis();
		long elapsedTimeRemove = (endTimeRemove - startTimeRemove);
		System.out.println("Remove method:");
		System.out.println("Time Elapsed: " + elapsedTimeRemove + " milliseconds.");
		// report your findings for time required for add/contains/remove
		// for each of the data structures linkedlist/hashset/skiplist/trie

	}
}
