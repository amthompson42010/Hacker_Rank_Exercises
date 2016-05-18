import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble();
		int tipPercent = scan.nextInt();
		int taxPercent = scan.nextInt();
		scan.close();

		double test = ((double)tipPercent / 100);
		double tip = mealCost * test;
		double tax = mealCost * ((double)taxPercent / 100);
		double sum = mealCost + tip + tax;

		int totalCost = (int)Math.round(sum);
		System.out.println("The total meal cost is " + totalCost + " dollars.");
	}
}
