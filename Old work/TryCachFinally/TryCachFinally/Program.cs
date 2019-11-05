using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TryCachFinally
{
    class Program
    {
        static void Main(string[] args)
        {
            TryCachFinal trycachfinal = new TryCachFinal();
            trycachfinal.ReadFile(0);
        }
    }
    class TryCachFinal
    {
        public void ReadFile(int index)
        {
            string path = "test.txt";
            System.IO.StreamReader file = new System.IO.StreamReader(path);
            char[] buffer = new char[100];
            try
            {
                file.ReadBlock(buffer, index, buffer.Length);
            }
            catch (System.IO.IOException e)
            {               
                Console.WriteLine("Error reading from {0}. Message = {1}", path, e.Message);
            }
            finally
            {
                foreach(var c in buffer)
                Console.Write(c);
                if (file != null)
                {
                    file.Close();
                }
            }
            Console.ReadKey();
        }

    }
}
