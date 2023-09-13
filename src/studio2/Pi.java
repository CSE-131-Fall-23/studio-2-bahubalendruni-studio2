package studio2;
import java.util.Scanner;
import java.util.Random;

public class Pi {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		// area of square is diameter of circle squared and area of circle is pi r^2 or pi * d^2 / 4. 
		// As such the proportion of darts in the circle but not the square should be pi/4
		
		double hits = 0;
		System.out.println("How many total throws?");
		double Throws = in.nextDouble();
		
		for (int i=0; i<Throws; i++) {
			double x = Math.random();
			double y  = Math.random();
            double distance = Math.sqrt(Math.pow(x-0.5, 2) + Math.pow(y-0.5, 2));
            if (distance <= 0.5) {
                hits = hits + 1;
            }
	}
		System.out.println(hits);
		System.out.println(Throws);
		System.out.println("PI as estimated is " + 4.0*(hits/Throws) + ".");

}
}
