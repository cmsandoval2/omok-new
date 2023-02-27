package omok;

import java.util.Random;
import java.util.Scanner;

public class GameController {
	Scanner scnr=new Scanner(System.in);
	Board board=new Board();
	public void computerGame() {
		// TODO Auto-generated method stub
		//while(!board.isFull()||!board.isWinner()) {
		while(true) {
		board.displayboard();
		System.out.println("Choose Row from 1-15");
		int row=scnr.nextInt();
		System.out.println("Choose Column from 1-15");
		int col=scnr.nextInt();
		board.placeStone(row,col,"player");
		if(board.isWinner("player")) {
			System.out.println("You won, Congrats!!!");
			board.displayboard();
			return;
		}
		Random rand=new Random();
		int cpuRow=rand.nextInt(15)+1;
		int cpuCol=rand.nextInt(15)+1;
		board.placeStone(cpuRow, cpuCol, "cpu");
		if(board.isWinner("cpu")) {
			System.out.println("CPU has won");
			board.displayboard();
			return;
		}
		//board.displayboard();
		}
	}

	public void PVP() {
		// TODO Auto-generated method stub
		while(true) {
			board.displayboard();
			System.out.println("Choose Row from 1-15");
			int row=scnr.nextInt();
			System.out.println("Choose Column from 1-15");
			int col=scnr.nextInt();
			board.placeStone(row,col,"player");
			if(board.isWinner("player")) {
				System.out.println("You won, Congrats!!!");
				board.displayboard();
				return;
			}
			System.out.println("Player 2 turn");
			System.out.println("Choose Row from 1-15");
			int p2row=scnr.nextInt();
			System.out.println("Choose Column from 1-15");
			int p2col=scnr.nextInt();
			board.placeStone(p2row,p2col,"player2");
	}
		
	}

}
