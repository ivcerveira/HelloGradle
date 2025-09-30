using System;

class Program
{
    static void Main(string[] args)
    {
        int n = 10;  // número de elementos da série de Fibonacci
        int[] fibonacci = new int[n];

        fibonacci[0] = 0;  // primeiro número da série
        fibonacci[1] = 1;  // segundo número da série

        for (int i = 2; i < n; i++)
        {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        Console.WriteLine("Os 10 primeiros números da série de Fibonacci são:");

        for (int i = 0; i < n; i++)
        {
            Console.Write(fibonacci[i] + " ");
        }

        Console.WriteLine();
    }
}