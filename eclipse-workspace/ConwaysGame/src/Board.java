/**
 * 
 */

/**
 * @author USER
 *
 */
public class Board {
	public boolean[][] createBoard(int n, int l[][]) {
        boolean cglBoard[][] =new boolean[n][n];
        for (int i=0;i<l.length;i++){
            int row = l[i][0];
            int col = l[i][1];
            cglBoard[row][col]= true;
        }
//        System.out.println("CurrentGenration");
//        printBoard(cglBoard);
        return(cglBoard);
    }
	
	public String printBoard(boolean board[][]) {
        int col=board.length;
        int row=board.length;
        String con="";
        for (int i=0; i<board.length;i++){
            for (int j=0;j<board.length;j++){
                if(board[i][j]){
                    con+="*";
                }
                else{
                    con+="_";
                    if(j==col-1 && i<row-1){
                        con=con +"\n";
                    }
                }
            }   
        }
       // System.out.print(con);
        return con;
    }
	
	public boolean[][] nextGen(boolean [][]board) {
        boolean [][] gen = new boolean [board.length][board.length];
        for(int i=0;i<gen.length;i++){
            for(int j=0;j<gen.length;j++){
                gen[i][j]=false;
            }
        }
        for(int i=1;i<board.length-1;i++){
            for(int j=1;j<board.length-1;j++){
                int cnt=0;
                if(board[i-1][j-1]==true){
                    cnt+=1;
                }
                if(board[i-1][j]==true){
                    cnt+=1;
                }
                if(board[i-1][j+1]==true){
                    cnt+=1;
                }
                if(board[i][j-1]==true){
                    cnt+=1;
                }
                if(board[i][j+1]==true){
                    cnt+=1;
                }
                if(board[i+1][j-1]==true){
                    cnt+=1;
                }
                if(board[i+1][j]==true){
                    cnt+=1;
                }
                if(board[i+1][j+1]==true){
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
