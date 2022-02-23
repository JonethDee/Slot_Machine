import java.util.Scanner;

public class SlotMachine extends SpinGenerator{

	public static void main(String[] args) {
		System.out.println("How many spins? (1-1000)");
		Scanner scnr = new Scanner (System.in);
		int spins = scnr.nextInt();
		
		
		
		while(spins < 1 || spins > 1000) {
			System.out.println("Sorry, please enter a valid number of spins");
			spins = scnr.nextInt();
		}
		generateSpins(spins);
		int wins = checkWins();
		System.out.print("You won " + wins + " times");
	}

}
