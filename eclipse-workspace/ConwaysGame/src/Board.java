/**
 * 
 */

/**
 * @author Ashish 2020501090
 * /**CREDITS Took help from sri charan for the corner cases of next generation */
/**This class contains all the methods related to board like create board, print board and nextgeneration */
 
 /** creation of board */
public class Board {
	public boolean[][] createBoard(int n, int l[][]) {	/** creation of board method */
        boolean cglBoard[][] =new boolean[n][n];		/** creation of 2d boolean array */
        for (int i=0;i<l.length;i++){
            int row = l[i][0];
            int col = l[i][1];								/** checking the livecells and making them true */
            cglBoard[row][col]= true;
        }
//        System.out.println("CurrentGenration");
//        printBoard(cglBoard);
        return(cglBoard);
    }
	
	public String printBoard(boolean board[][]) {  /** creation of printboard method */
//        int col=board.length;
//        int row=board.length;
        String con="";
        for (int i=0; i<board.length;i++){
            for (int j=0;j<board.length;j++){
                if(board[i][j]){
                    con+="*";
                }
                else{
                    con+="_";
//                    if(j==col-1 && i<row-1){
//                        con=con +"\n";
//                    }
                }
            }  
            if(i<board.length-1) {
            con = con +"\n";
            }
        }
       // System.out.print(con);
        return con;
    }
	
	public boolean[][] nextGen(boolean [][]board) {		/** creation of nextgeneration method  used to develop the next generation*/
        boolean [][] gen = new boolean [board.length][board.length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                gen[i][j]=false;
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                int cnt=0;
                int x = i -1;
                int y = j-1;
                if (x<0) {
                	x = board.length-1;
                }
                if (y <0) {
                	y =board.length-1;
                }
                if(board[x][y]==true){
                    cnt+=1;
                }
                if(board[x][j]==true){
                    cnt+=1;
                }																
                if(board[x][(j+1)%board.length]==true){
                    cnt+=1;
                }
                if(board[i][y]==true){
                    cnt+=1;
                }
                if(board[i][(j+1)%board.length]==true){
                    cnt+=1;
                }
                if(board[(i+1)%board.length][y]==true){
                    cnt+=1;
                }
                if(board[(i+1)%board.length][j]==true){
                    cnt+=1;
                }
                if(board[(i+1)%board.length][(i+1)%board.length]==true){
                    cnt+=1;
                }
                if(board[i][j]==true){
                    if(cnt==2 || cnt==3){
                        gen[i][j]=true;     
                    }
                }
                else{
                    if(cnt==3){
                        gen[i][j]=true;
                    }
                }
            }    
        }
        return gen;
    }

}
