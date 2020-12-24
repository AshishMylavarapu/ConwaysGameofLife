/**
 * 
 */

/**
 * @author Ashish 2020501090
 *Creating a class ConwaysGameofLife
 */
public class ConwaysGameofLife {
	public String start(String input, int n, int [][] livecells, String shift, int generation) {
		boolean condition;
		if(input.equals("start")) {
			condition = true;					/** if we enter start then will create board */
		}
		else {
			condition=false;
		}
		if(condition) {													/**checking the finite case */				
			Board obj = new Board();
			switch(shift) {
			case "finite":
			{
				boolean[][] nextgen = null;
				boolean[][] curgen =null;
				for (int i=0;i<generation;i++) {
					if(i==0) {
						curgen=obj.createBoard(n, livecells);
						
					}
					else {
						nextgen=obj.nextGen(curgen);
						if(obj.printBoard(curgen).equals(obj.printBoard(nextgen))) {
							break;
						}
						curgen = nextgen;
					}
					
				}
				return obj.printBoard(curgen);
				
			}
			case "infinite":
			{
																	/**checking the infinite case */
				boolean[][] nextgen = null;
				boolean[][] curgen =null;
				for (int i=0;;i++) {
					if(i==0) {
						curgen=obj.createBoard(n, livecells);
						
					}
					else {
						nextgen=obj.nextGen(curgen);
						if(obj.printBoard(curgen).equals(obj.printBoard(nextgen))) {
//							System.out.print(i);
							break;
						}
						curgen = nextgen;
					}
					
				}
				return obj.printBoard(curgen);
				
			}
				
			}
//			if (generation.equals("current")) {
//				return obj.printBoard(obj.createBoard(n, livecells));
//				}
//			else {
//				return obj.printBoard(obj.nextGen(obj.createBoard(n, livecells)));
//			}
			
		}
		return "";
	}

}
