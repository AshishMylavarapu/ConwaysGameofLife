import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * 
 */

/**
 * @author USER
 *
 */
public class TestJunitGame {
	@Test
	public void testStartOne() {
		String str = "start";
		int n = 5;
		int [][] livecells = {{1,1},{2,2},{3,3}};
		String gen ="current";
		ConwaysGameofLife con = new ConwaysGameofLife();
		String newPrint = con.start(str, n, livecells, gen);
		String testing ="_____\n"
				+ "_*___\n"
				+ "__*__\n"
				+ "___*_\n"
				+ "_____";
		Assertions.assertEquals(testing,newPrint);
	}
	@Test
	public void testStartTwo() {
		String str = "end";
		int n = 5;
		int [][] livecells = {{1,1},{2,1},{3,1}};
		String gen ="current";
		ConwaysGameofLife con = new ConwaysGameofLife();
		String newPrint = con.start(str, n, livecells, gen);
		String testing ="";
		Assertions.assertEquals(testing,newPrint);
	}
	@Test
	public void testStartThree() {
		String str = "start";
		int n = 5;
		int [][] livecells = {{1,1},{1,3},{2,2},{2,3},{3,1},{3,3}};
		String gen ="next";
		ConwaysGameofLife con = new ConwaysGameofLife();
		String newPrint = con.start(str, n, livecells, gen);
		String testing ="_____\n"
				+ "___*_\n"
				+ "_*_*_\n"
				+ "___*_\n"
				+ "_____";
		Assertions.assertEquals(testing,newPrint);
	}

}
