using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes
{
    class Program
    {
        static void Main(string[] args)
        {
            BaseClass basec = new BaseClass("da", 1);
            basec.field2 = 2;
            DerivedClass derivc = new DerivedClass("nu", 4);
            Console.WriteLine();
            OverloaadingClass.InstantiatingMethod();
            Console.WriteLine();
            OverridingClass.OverridingMethods();


            Console.ReadLine();
        }
    }
    class Methods
    {
        public void Do(object o)
        {
            Write("object", o);
        }
        public void Do(BaseClass b)
        {
            Write("Base", b);
        }
        public void Do(DerivedClass d)
        {
            Write("Derived", d);
        }
        private static void Write(string method, object obj)
        {
            Console.WriteLine("Metoda ({0}) obiectul {1}", method, obj.GetType().Name);
        }
    }
    class OverloaadingClass
    {
        public static void InstantiatingMethod()
        {
            object o1 = new object();
            object o2 = new BaseClass();
            object o3 = new DerivedClass();
            BaseClass bc1 = new BaseClass();
            BaseClass bc2 = new DerivedClass();
            DerivedClass dc = new DerivedClass();
        
            Methods methods = new Methods();

            methods.Do(o1);
            methods.Do(o2);
            methods.Do(o3);

            methods.Do(bc1);
            methods.Do(bc2);

            methods.Do(dc);
        }
    }
    class OverridingClass
    {
       public static void OverridingMethods()
       {
           BaseClass bc = new BaseClass();
           DerivedClass dc = new DerivedClass();
           BaseClass bcdc = new DerivedClass();

           bc.Method1();
           bc.Method2();       
           
           dc.Method1();
           dc.Method2();
        
           bcdc.Method1();
           bcdc.Method2();             
       }
    }

    class BaseClass
    {
        private string _field1;
        private int    _field2;
        public int field2 { set; get; }
        public BaseClass() { }
        public BaseClass(string field1, int field2)
        {
            this._field1 = field1;
            this._field2 = field2;
            Console.WriteLine("base field1  " + _field1);
            Console.WriteLine("base field2  " + _field2);
        }
        public virtual void Method1()
        {
            Console.WriteLine("Base - Method1");
        }

        public virtual void Method2()
        {
            Console.WriteLine("Base - Method2");
        }
    }

    class DerivedClass : BaseClass
    {
        //private string _field1;
        //private int _field2;
        public DerivedClass() { }
        public DerivedClass(string field1, int field2)  : base(field1,field2) { }
        //{
        //    Console.WriteLine("Derived field1" + _field1);
        //    Console.WriteLine("Derived field1" + _field2);
        //}        
        public override void Method1()
        {
            Console.WriteLine("Derived - Method1");
        }

        public new void Method2()
        {
            Console.WriteLine("Derived - Method2");
        }
    }
}
