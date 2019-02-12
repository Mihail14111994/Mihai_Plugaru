using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Basic_CSharp
{
    
    public class Employee
    {        
        private string name;
        private int age;
        public string gen;
        public static int employeeNumber;
        static Employee()
        {
            employeeNumber=0;
        }
        public static int AddEmployee()
        {
            return employeeNumber++;
        }
        public Employee(string name, int age, string gen)
        {
            this.name = name;
            this.age = age;
            this.gen = gen;
        }            
    }
    class RegisterEmployees 
    {
        //static Employee a = new Employee("Abc" , 12);
        static void Main(string[] args)
        {
            string empage;
            string ename;
            string egen;         
            string nextemp ="yes";
            while (nextemp != "no")
            {                
                Console.Write("Enter the employee's name        : ");
                ename = Console.ReadLine();
                Console.Write("Enter the employee's age         : ");
                empage = Console.ReadLine();
                int eage = Int32.Parse(empage);
                Console.Write("Enter the employee's gender(m/f) : ");
                egen = Console.ReadLine();
                Employee e = new Employee(ename, eage, egen);

                Employee.AddEmployee();

                Console.WriteLine("Number of potential employees: {0}",
                              Employee.employeeNumber);

                object o = eage;
                ListUnbox.Enlist(o);

                Console.Write("Introduce another employee? ('no' - exit)");
                nextemp = Console.ReadLine();
                RetireAge.ShowGender(ref e.gen);
                Console.WriteLine("Gender of last recorded emp.: " + e.gen);
                RetireAge.ShowRetireAge(out int retAge);
                Console.WriteLine("Retiring age for employees is: " + retAge);
            }
            Console.WriteLine("Number of successful registered employees is : {0} ", ListUnbox.EmpNumber());
            
            Console.ReadKey();
        }
    }
    class ListUnbox
    {
        private static List<object> list = new List<object>();
        public static void Enlist(object o)
        {
            list.Add(o);
        }
        public static int EmpNumber()
        {
            int empnumber = 0;
            foreach (object o in list)
            {
                int oage = (int)o;
                if ((oage < 30) && (oage > 20))                
                    empnumber++ ;                                
            }
            return empnumber;
        }
    }
    static class RetireAge
    {
        public static void ShowRetireAge(out int retireAge) => retireAge = 65;
        public static void ShowGender(ref string empgen)
        {
            if (empgen == "m")
                empgen = "Masculin"; 
            else if(empgen == "f")
                empgen = "Feminin";
            else empgen = "unknown info";

        }
    }    
}
