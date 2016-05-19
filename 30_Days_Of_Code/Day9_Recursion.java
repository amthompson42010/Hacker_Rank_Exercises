import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = factorial(n);
		System.out.println(result);
		sc.close();
	}

	public static int factorial(int n ) {
		int res = 1;
		for(int i = 1; i <= n; i++)
		{
			res *= i;
		}

		return res;
	}
}
