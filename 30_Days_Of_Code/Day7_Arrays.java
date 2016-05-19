import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = in.nextInt();
		}

		StringBuilder sb = new StringBuilder();

		for(int j = n - 1; j >= 0; j--)
		{
			sb.append(arr[j] + " ");
		}

		System.out.print(sb);

		in.close();
	}
}
