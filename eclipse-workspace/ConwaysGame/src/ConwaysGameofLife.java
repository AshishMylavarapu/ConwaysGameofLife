/**
 * 
 */

/**
 * @author USER
 *
 */
public class ConwaysGameofLife {
	public String start(String input, int n, int [][] livecells, String generation) {
		boolean condition;
		if(input.equals("start")) {
			condition = true;
		}
		else {
			condition=false;
		}
		if(condition) {
			Board obj = new Board();
			if (generation.equals("current")) {
				return obj.printBoard(obj.createBoard(n, livecells));
				}
			else {
				return obj.printBoard(obj.nextGen(obj.createBoard(n, livecells)));
			}
			
		}
		return "";
	}

}
