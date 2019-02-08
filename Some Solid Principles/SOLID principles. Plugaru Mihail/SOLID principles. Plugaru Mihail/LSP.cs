using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SOLID_principles.Plugaru_Mihail
{
    interface IWork
    {
        string GetEmployeeWork(int EmpId);
    }

    interface ISalary
    {
        string GetEmployeeSalary(int EmpId);
    }

    public class Employee : IWork, ISalary
    {
        public string GetEmployeeSalary(int EmpId)
        {
            return "Work type";
        }

        public string GetEmployeeWork(int EmpId)
        {
            return "Salary amount";
        }
    }

    public class InternEmployee : IWork
    {
        public string GetEmployeeWork(int EmpId)
        {
            return "Work type";
        }
    }
}
