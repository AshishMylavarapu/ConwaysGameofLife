import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Ashish 2020501090
 /**Created a test class for print board  */

public class TestJunitPrintBoard {
	@Test								/**Assigning the inputs */
	public void testCase1() {
		boolean current[][] = {{false,false,false,false,false},{false,true,false,true,false},{false,false,false,true,false},{false,false,true,false,false},{false,false,false,false,false}};
		Board obj = new Board ();
		String sol = obj.printBoard(current);
		String expected = "_____\n"
				+ "_*_*_\n"
				+ "___*_\n"					/**Expected output */
				+ "__*__\n"
				+ "_____";
//		System.out.println(sol);
		Assertions.assertEquals(expected, sol);
	
	}


}
