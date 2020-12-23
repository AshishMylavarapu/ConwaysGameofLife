import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author USER
 *
 */
public class TestJunitcreateBoard {
	@Test
	public void testcase2() {
		int n =5;
		
	
		int current [][]= {{2,1},{2,4},{3,4},{4,3}};
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
		}
		String expected="false_false_false_false_false\n"
				+ "false_false_false_false_false\n"
				+ "false_true_false_false_true\n"
				+ "false_false_false_false_true\n"
				+ "false_false_false_true_false";
		Assertions.assertEquals(expected, sol);

	}
	
}
