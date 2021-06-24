
//Ben Carrier 300290267
import static org.junit.Assert.*;
import org.junit.*;

public class TestTrie {
	private LowerCaseTrie testTrie;

	@Before
	public void initialize() {
		testTrie = new LowerCaseTrie();
	}

	@Test
	public void testAdd() {
		testTrie.add("water");
		testTrie.add("gold");
		testTrie.add("snow");
		testTrie.add("ski");
		assertTrue(testTrie.contains("water"));
	}

	@Test
	public void testAdd2() {
		testTrie.add("water");
		testTrie.add("gold");
		testTrie.add("snow");
		testTrie.add("ski");
		assertFalse(testTrie.contains("snowboard"));
	}
	
	@Test
	public void testAdd3() {
		testTrie.add("water");
		testTrie.add("gold");
		testTrie.add("snow");
		testTrie.add("ski");
		testTrie.add("");
	}
	
	@Test
	public void testAdd4() {
		testTrie.add("water");
		testTrie.add("gold");
		testTrie.add("snow");
		testTrie.add("ski");
	}
	
	@Test
	public void testAdd5() {
		testTrie.add("water");
		testTrie.add("gold");
		testTrie.add("snow");
		testTrie.add("ski");
		testTrie.add("happy");
		testTrie.add("unhappy");
		assertTrue(testTrie.contains("unhappy"));
	}
	
	@Test
	public void testAdd6() {
		testTrie.add("water");
		testTrie.add("gold");
		testTrie.add("snow");
		testTrie.add("ski");
		testTrie.add("happy");
		testTrie.add("unhappy");
		assertTrue(testTrie.contains("happy"));
	}

	@Test
	public void testAddRemove() {
		testTrie.add("water");
		testTrie.add("gold");
		testTrie.add("snow");
		testTrie.add("ski");
		testTrie.remove("snow");
		assertFalse(testTrie.contains("snow"));
	}

	@Test
	public void testAddRemove2() {
		testTrie.add("water");
		testTrie.add("gold");
		testTrie.add("snow");
		testTrie.add("ski");
		testTrie.remove("water");
		testTrie.add("snowboard");
		assertFalse(testTrie.contains("water"));
		assertTrue(testTrie.contains("snowboard"));
	}

	@Test
	public void testAddRemove3() {
		testTrie.add("water");
		testTrie.add("gold");
		testTrie.add("snow");
		testTrie.add("ski");
		testTrie.remove("ski");
		testTrie.add("snowboard");
		assertTrue(testTrie.contains("snowboard"));
	}
	
	@Test
	public void testAddRemove4() {
		testTrie.add("water");
		testTrie.add("gold");
		testTrie.add("snow");
		testTrie.add("ski");
		testTrie.remove("water");
		assertFalse(testTrie.contains("water"));
	}
	
	@Test
	public void testAddRemove5() {
		testTrie.add("water");
		testTrie.add("gold");
		testTrie.add("snow");
		testTrie.add("ski");
		testTrie.add("happy");
		testTrie.add("unhappy");
		testTrie.remove("happy");
		assertTrue(testTrie.contains("unhappy"));
	}
	
	@Test
	public void testAddRemove6() {
		testTrie.add("water");
		testTrie.add("gold");
		testTrie.add("snow");
		testTrie.add("ski");
		testTrie.add("happy");
		testTrie.add("unhappy");
		testTrie.remove("unhappy");
		assertFalse(testTrie.contains("unhappy"));
	}

}