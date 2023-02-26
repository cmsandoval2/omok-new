package omok;

import java.util.Scanner;

public class GameController {
	Scanner scnr=new Scanner(System.in);
	Board board=new Board();
	public void computerGame() {
		// TODO Auto-generated method stub
		while(!board.isFull()||board.isWinner()) {
		board.displayboard();
		System.out.println("Choose Row");
		int row=scnr.nextInt();
		System.out.println("Choose Column");
		int col=scnr.nextInt();
		board.placeStone(row,col);
		}
	}

	public void PVP() {
		// TODO Auto-generated method stub
		
	}

}
