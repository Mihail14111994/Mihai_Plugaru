using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp6
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] A = { 1, 1, 2, 5, 7, 7, 7, 9, 10, 15, 17 };
            int[] B = { 1, 5, 7, 9, 11, 12, 16, 100 };
            int[] C = new int[A.Length + B.Length];
            int[] D = new int[A.Length + B.Length];
            int d = 0, c =0, stop =1; 
        
            for (int i =0; i < A.Length; i++)
            {
                int k = 0;
                for (; k < i; k++)
                {
                    if (C[k] == A[i])
                        d++;
                }
                if (d == 0)
                   C[c++] = A[i];
                else d = 0;
            }
            for (int i = 0; i < B.Length; i++)
            {
                int k = 0;
                for (; k < c; k++)
                {
                    if (C[k] == B[i])
                        d++;
                }                   
                if (d == 0)
                   C[c++] = B[i];
                else d = 0;
            }

            while (stop != 0)
            {
                int aux;
                stop = 0;
                for (int i = 0; i < c; i++)
                    if (C[i] > C[i + 1])
                    {
                        aux = C[i];
                        C[i] = C[i + 1];
                        C[i + 1] = aux;
                        stop = 1;
                    }
            }

            foreach (var s in C)
            {
                Console.WriteLine("C contine : {0}", s);
            }
            Console.ReadKey();
        }
    }
}
