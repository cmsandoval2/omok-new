package omok;

import java.util.Scanner;

public class ConsoleUI {
	Scanner scnr=new Scanner(System.in);
	GameController g=new GameController();
	//Introduction to the game board and will call on GameController to continue the game forward
public void intro() {
	System.out.println("Welcome");
	System.out.println("Choose game mode 1 for computer 2 for PVP, or 3 to quit game");
	int num=scnr.nextInt();
	switch(num) {
	case 1:
		g.computerGame();
		break;
	case 2:
		g.PVP();
	case 3:
		break;	
	default:
			break;
	}
	
}

}
