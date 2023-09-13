package studio2;
import java.util.Scanner;
import java.util.Random;
public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("How much money are you starting with");
		int start = in.nextInt();
		System.out.println("What is the winning chance?");
		double winChance = in.nextDouble();
		System.out.println("What is your win limit?");
		int limit = in.nextInt();
		
		int success = 0;
		int ruin = 0;
		System.out.println("How many simulations are you running?");
		int totalSimulations = in.nextInt();
		for (int i = 0; i<totalSimulations; i++) {
			int amount = start;
			while (amount>0&&amount<limit) {
				double random = Math.random();
				if (winChance>=random) {
					amount = amount + 1;
				}
				if (winChance < random) {
					amount = amount - 1;
				}
				if (amount==limit) {
					success = success + 1;
					System.out.println("Simulation " + i + ": " + amount + " WIN");

					

				}
				if (amount==0) {
					ruin = ruin + 1;
					System.out.println("Simulation " + i + ": " + amount + " LOSE");
					
				}

			}


		}
		System.out.println("For " + totalSimulations + " simulations you have won " + success + " times and have lost " + ruin + " times");


	}
}


