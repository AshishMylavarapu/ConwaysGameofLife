import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * 
 */

/**
 * @author Ashish 2020501090
 *
 */
public class TestJunitGame {
	@Test
	public void testStartOne() {
		String str = "start";
		int n = 5;
		int [][] livecells = {{1,1},{2,2},{3,3}};
		String shift ="finite";
		int gen =1;
		ConwaysGameofLife con = new ConwaysGameofLife();
		String newPrint = con.start(str, n, livecells,shift, gen);
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
//		String gen ="current";
		String shift ="finite";
		int gen =1;
		ConwaysGameofLife con = new ConwaysGameofLife();
		String newPrint = con.start(str, n, livecells,shift, gen);
		String testing ="";
		Assertions.assertEquals(testing,newPrint);
	}
	@Test
	public void testStartThree() {
		String str = "start";
		int n = 5;
		int [][] livecells = {{1,1},{1,3},{2,2},{2,3},{3,1},{3,3}};
//		String gen ="next";
		String shift ="finite";
		int gen =2;
		ConwaysGameofLife con = new ConwaysGameofLife();
		String newPrint = con.start(str, n, livecells,shift, gen);
		String testing ="_____\n"
				+ "___**\n"
				+ "_____\n"
				+ "___*_\n"
				+ "_____";
		Assertions.assertEquals(testing,newPrint);
	}
	@Test
	public void testStartFour() {
		String str = "start";
		int n = 5;
		int [][] livecells = {{1,1},{1,3},{2,2},{2,3},{3,1},{3,3}};
//		String gen ="next";
		String shift ="infinite";
		int gen =2;
		ConwaysGameofLife con = new ConwaysGameofLife();
		String newPrint = con.start(str, n, livecells,shift, gen);
		String testing ="_____\n"
				+ "_____\n"
				+ "_____\n"
				+ "_____\n"
				+ "_____";
		Assertions.assertEquals(testing,newPrint);
	}
	@Test
	public void testStartFive() {
		String str = "start";
		int n = 5;
		int [][] livecells = {{1,1},{1,3},{2,2},{2,3},{3,1},{3,3}};
//		String gen ="next";
		String shift ="finite";
		int gen =5;
		ConwaysGameofLife con = new ConwaysGameofLife();
		String newPrint = con.start(str, n, livecells,shift, gen);
		String testing ="_____\n"
				+ "_____\n"
				+ "_____\n"
				+ "_____\n"
				+ "_____";
		Assertions.assertEquals(testing,newPrint);
	}

}
