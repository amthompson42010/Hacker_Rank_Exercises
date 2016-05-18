import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);
		int j = scan.nextInt();
		double r = scan.nextDouble();
		String e = scan.nextLine();
		while(scan.hasNext()) {
			e = scan.nextLine();
		}

		System.out.println(""+(i + j));
		System.out.println(""+(d + r));

		String n = s + e;
		System.out.println(n);

		scan.close();
	}
}
