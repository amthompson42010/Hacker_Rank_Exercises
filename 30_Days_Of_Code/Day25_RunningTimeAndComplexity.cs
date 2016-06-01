using System;
using System.Collections.Generic;
using System.IO;
class Solution
{
    static void Main(String[] args)
    {
        int T = int.Parse(Console.ReadLine());
        int n;
        
        for (int i = 0; i < T; i++)
        {
            n = int.Parse(Console.ReadLine());
            
            if (IsPrime(n))
                Console.WriteLine("Prime");
            else
                Console.WriteLine("Not prime");
        }
    }
    
    static bool IsPrime(int n)
    {        
        if (n <= 1)
            return false;
        else if (n <= 3)
            return true;
        else if (n % 2 == 0 || n % 3 == 0)
            return false;
        
        int i = 5;
        while (i * i <= n)
        {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
            i += 6;
        }
        
        return true;
    }
}
