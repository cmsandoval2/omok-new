package omok;

import java.util.Scanner;

public class ConsoleUI {
	Scanner scnr=new Scanner(System.in);
	GameController g=new GameController();
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
	//System.out.println("Choose Game mode 1 for computer game or 2 for PVP");
	//System.out.println("Choose Row");
	//int row=scnr.nextInt();
	//System.out.println("Choose Column");
	//int col=scnr.nextInt();
	//System.out.println(row+" "+col);
	
}

}
