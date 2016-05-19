import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for(int i = 0; i < 6; i++)
		{
			for(int j = 0; j < 6; j++)
			{
				arr[i][j] = in.nextInt();
			}
		}

		int count = 0;
		int count1 = 0;
		int count2 = 0;
		for(int i = 2; i < 6; i++)
		{
			for(int j = 2; j < 6; j++)
			{
				int sum = arr[i - 2][j - 2] + arr[i - 2][j - 1] + arr[i - 2][j] + arr[i - 1][j - 1] + [i][j - 2] + arr[i][j];
				if(sum >= count)
				{
					count = sum;
					count1++;
				}
				if(count1 == 0)
				{
					if(sum > count2 || count2 == 0)
					{
						count2 = sum;
					}
				}
			}
		}

		if(count1 != 0)
		{
			System.out.println(count);
		}
		else
		{
			System.out.println(count2);
		}
	}
}
