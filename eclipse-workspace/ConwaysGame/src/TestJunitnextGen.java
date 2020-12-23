import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Ashish 2020501090
 *
 */
public class TestJunitnextGen {
	@Test
	public void testCase1() {
		boolean current[][] = {{false,false,false,false,false},{false,true,false,true,false},{false,false,false,true,false},{false,false,true,false,false},{false,false,false,false,false}};
		Board obj = new Board ();
		boolean [][] x = obj.nextGen(current);
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
		String expected = "false_false_false_false_false\n"
				+ "false_false_true_false_false\n"
				+ "false_false_false_true_false\n"
				+ "false_false_false_false_false\n"
				+ "false_false_false_false_false";
//		System.out.println(sol);
		Assertions.assertEquals(expected, sol);
	
	}
}
	
	


