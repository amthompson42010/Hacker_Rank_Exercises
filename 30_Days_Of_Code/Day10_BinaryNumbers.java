import java.io.*;
import java.util.*;

public class Solution {

	public static String DecimalToBinary(String binary, int n) {
		if(n == 0)
		{
			return binary;
		}

		int remainder = n % 2;
		binary = remainder + binary;
		n /= 2;
		return DecimalToBinary(binary, n);
	}

	public static int count(String binary) {
		int count = 0, max = 0;
		for(int i = 0; i < binary.length(); i++)
		{
			if(bianry.charAt(i) == '1')
			{
				count++;
				if(count > max)
				{
					max = count;
				}
			}
			else
			{
				if(count > max)
				{
					max = count;
				}
				count = 0;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int decimal = input.nextInt(), total = 0;
		String binary = "";
		binary = DecimalToBinary(binary, decimal);
		total = count(binary);
		System.out.println(total);
	}
}
