import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author USER
 *
 */
public class TestJunitPrintBoard {
	@Test
	public void testCase1() {
		boolean current[][] = {{false,false,false,false,false},{false,true,false,true,false},{false,false,false,true,false},{false,false,true,false,false},{false,false,false,false,false}};
		Board obj = new Board ();
		String sol = obj.printBoard(current);
		String expected = "_____\n"
				+ "_*_*_\n"
				+ "___*_\n"
				+ "__*__\n"
				+ "_____";
//		System.out.println(sol);
		Assertions.assertEquals(expected, sol);
	
	}


}
