package rockPaperScissors;

import java.util.ArrayList;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	    String first = scan.nextLine(); 
	    String second = scan.nextLine(); 
	    System.out.println(rockPaperScissorsFun(first, second));
		
	}
	public static String rockPaperScissorsFun(String first, String second) {
		ArrayList<String> list = new ArrayList<String>();
        list.add("scissors");
        list.add("rock");
        list.add("paper");
		
		int differ = list.indexOf(first) - list.indexOf(second);
		
		if(differ == 0) {
			return "TIE";
		}
		if((differ == 1) || (differ == -2)) {
			return "Player 1 wins";
		}else {
			return "Player 2 wins";
		}
	}

}