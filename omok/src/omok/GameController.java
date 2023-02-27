package omok;

import java.util.Random;
import java.util.Scanner;

public class GameController {
	Scanner scnr=new Scanner(System.in);
	Board board=new Board();
	public void computerGame() {
		// TODO Auto-generated method stub
		while(true) {
			//Player1 input
			
			System.out.println("Player 1 turn:");
			board.displayboard();
			System.out.println("Choose Row from 1-15");
			int row=scnr.nextInt();
			System.out.println("Choose Column from 1-15");
			int col=scnr.nextInt();
			//Gives user one opportunity to fix mistake then crashes
			
		if(!board.isValidPosition(row, col)) {
			System.out.println("Invalid podition try again.");
			System.out.println("Row");
				row=scnr.nextInt();
				System.out.println("Column");
				col=scnr.nextInt();
				board.placeStone(row, col, "player");
			}
			else {
			board.placeStone(row,col,"player");
			}
		//checks for winner on player1 side
		
		if(board.isWinner("player")) {
			System.out.println("You won, Congrats!!!");
			board.displayboard();
			return;
		}
		//input for CPU
		
			Random rand=new Random();
			int cpuRow=rand.nextInt(15)+1;
			int cpuCol=rand.nextInt(15)+1;
			board.placeStone(cpuRow, cpuCol, "cpu");
		if(board.isWinner("cpu")) {
			System.out.println("CPU has won");
			board.displayboard();
			return;
		}
		}
	}

	public void PVP() {
		// TODO Auto-generated method stub
		while(true) {
			//Player 1 turn
			
			System.out.println("Player 1 turn:");
			board.displayboard();
			System.out.println("Choose Row from 1-15");
			int row=scnr.nextInt();
			System.out.println("Choose Column from 1-15");
			int col=scnr.nextInt();
			//Gives user one opportunity to fix mistake then crashes
			
			if(!board.isValidPosition(row, col)) {
			System.out.println("Invalid podition try again.");	
			System.out.println("Row");
				row=scnr.nextInt();
				System.out.println("Column");
				col=scnr.nextInt();
				board.placeStone(row, col, "player");
			}
			else {
			board.placeStone(row,col,"player");
			}
			//Checks winner on Player 1 side
			
			if(board.isWinner("player")) {
				System.out.println("Player 1 wins, Congrats!!!");
				board.displayboard();
				return;
			}
			//Player 2 input
			
			System.out.println("Player 2 turn");
			board.displayboard();
			System.out.println("Choose Row from 1-15");
			int p2row=scnr.nextInt();
			System.out.println("Choose Column from 1-15");
			int p2col=scnr.nextInt();
			//Gives user one opportunity to fix mistake then crashes
			
			if(!board.isValidPosition(p2row, p2col)) {
				System.out.println("Invalid podition try again.");	
				System.out.println("Row");
					p2row=scnr.nextInt();
					System.out.println("Column");
					p2col=scnr.nextInt();
					board.placeStone(p2row, p2col, "player2");
				}
				else {
				board.placeStone(p2row,p2col,"player2");
				}
			//Checks winner on Player 2 side
			
			if(board.isWinner("player2")) {
				System.out.println("Player 2 wins. Congrats!!!");
				board.displayboard();
				return;
			}
	}
		
	}

}
