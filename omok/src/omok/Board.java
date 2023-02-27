package omok;

public class Board {
	public char[][] board= {
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.','.','.','.','.','.','.'}};
public void displayboard() {
	int num=1;
	System.out.println("X  1  2  3  4  5  6  7  8  9 10  11 12 13 14 15");
	System.out.println("y---------------------------------------------------");
	for(char[] row:board) {
		System.out.print(num);
		for(char c: row) {
			System.out.print("  "+c);
		}
		num++;
		if(num==9) {
			num=1;
		}
		System.out.println();
	}
}

public boolean isFull() {
	// TODO Auto-generated method stub
	
	return false;
}
public boolean isWinner(String player) {
	// TODO Auto-generated method stub
	if(player=="player") {
		//Horizontal
	for(int i=0;i<board.length;i++) {
		for(int j=0;j<board[i].length-3;j++) {
			if(board[i][j]=='X'&&board[i][j+1]=='X'&&board[i][j+2]=='X'&&board[i][j+3]=='X'&&board[i][j+4]=='X') {
				return true;
			}
		}
	}
			//vertical
		for(int i=0;i<board.length-3;i++) {
			for(int j=0;j<board[i].length;j++) {
		 if(board[i][j]=='X'&&board[i+1][j]=='X'&&board[i+2][j]=='X'&&board[i+3][j]=='X'&&board[i+4][j]=='X') {
				return true;
			}
			}
		}
		for(int i=board.length-3; i>=0; i--) {
		    for(int j=0; j<board[i].length-3; j++) {
		        if(board[i][j]=='X'&&board[i+1][j+1]=='X'&&board[i+2][j+2]=='X'&&board[i+3][j+3]=='X'&&board[i+4][j+4]=='X') {
		            return true;
		        }
		    }
		}
		//Ascending diagonal
		//for(int i=4;i<board.length;i++) {
			//for(int j=4;j<board[i].length;j++) {
				//if(board[i][j]=='X'&&board[i+1][j-1]=='X'&&board[i+2][j-2]=='X'&&board[i+3][j-3] =='X'&&board[i+4][j-4]=='X') {
					//return true;
		//}
			//}
		//}
		//Descending diagonal
		for(int i=4;i<board.length;i++) {
			for(int j=4;j<board[i].length;j++) {
				if(board[i][j]=='X'&&board[i-1][j-1]=='X'&&board[i-2][j-2]=='X'&&board[i-3][j-3] =='X'&&board[i-4][j-4]=='X') {
					return true;
		}
			}
		}
	}
	if(player=="cpu"||player=="player2") {
		//Horizontal
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length-3;j++) {
				if(board[i][j]=='O'&&board[i][j+1]=='O'&&board[i][j+2]=='O'&&board[i][j+3]=='O'&&board[i][j+4]=='O') {
					return true;
				}
			}
		}
				//vertical
			for(int i=0;i<board.length-3;i++) {
				for(int j=0;j<board[i].length;j++) {
			 if(board[i][j]=='O'&&board[i+1][j]=='O'&&board[i+2][j]=='O'&&board[i+3][j]=='O'&&board[i+4][j]=='O') {
					return true;
				}
				}
			}
			//Ascending diagonal
			for(int i=board.length-5; i>=0; i--) {
			    for(int j=0; j<board[i].length-4; j++) {
			        if(board[i][j]=='X'&&board[i+1][j+1]=='X'&&board[i+2][j+2]=='X'&&board[i+3][j+3]=='X'&&board[i+4][j+4]=='X') {
			            return true;
			        }
			    }
			}
			//for(int i=3;i<board.length;i++) {
				//for(int j=0;j<board[i].length-3;j++) {
			 //if (board[i][j]=='O'&&board[i-1][j+1]=='O'&&board[i-2][j+2]=='O'&&board[i-3][j+3]=='O'&&board[i-4][j-4]=='O')
	           //     return true;
				//}
			//}
			//Descending diagonal
			for(int i=4;i<board.length;i++) {
				for(int j=4;j<board[i].length;j++) {
					if(board[i][j]=='O'&&board[i-1][j-1]=='O'&&board[i-2][j-2]=='O'&&board[i-3][j-3] =='O'&&board[i-4][j-4]=='O') {
						return true;
			}
				}
			}
	}
	return false;
}
public void placeStone(int row,int col,String user) {
	// TODO Auto-generated method stub
	char symbol=' ';
	if(user.equals("player")) {
		symbol='X';
	}else if(user.equals("cpu")||user.equals("player2")){
		symbol='O';
	}
	board[row-1][col-1]=symbol;	
	
}
	
}

