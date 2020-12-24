import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Ashish 2020501090
 * 
 *
 */
/**created test class for create board */
public class TestJunitcreateBoard {
	@Test
	public void testcase2() {
		int n =5;
		
	
		int current [][]= {{2,1},{2,4},{3,4},{4,3}};  			/**Assigining inputs for creating a board*/
		Board obj = new Board();
		boolean [][] x = obj.createBoard(n,current);
		String sol = "";
		for (int i=0;i<x.length;i++) {
			for (int j=0;j<x.length;j++) {
				sol += x[i][j];
				if (j<x.length-1) {
					sol+= "_";
				}
				
			}
			if (i<x.length-1) {
				sol+="\n";
			}
		}														/**Expected output */
		String expected="false_false_false_false_false\n"
				+ "false_false_false_false_false\n"
				+ "false_true_false_false_true\n"
				+ "false_false_false_false_true\n"
				+ "false_false_false_true_false";
		Assertions.assertEquals(expected, sol);

	}
	
}
