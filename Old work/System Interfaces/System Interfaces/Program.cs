using System;
using System.Collections;
using static AnglesEnum;

class App
{
    static void Main()
    {
        Angle a = new Angle("a", 3, 36, 53);
        Angle b = new Angle("b", 4, 27, 45);
        Angle c = new Angle("c", 8, 4, 38);
        Angle[] anglesArray = new Angle[3] {a,b,c};   

        Angles anglesList = new Angles(anglesArray);
        foreach (Angle ang in anglesList)
            Console.WriteLine("Angle "+ang.angName + " " + ang.angDegree + "^ " 
                              + ang.angMinutes + "' " + ang.angSeconds+"\"");

        Angle d = new Angle();
        d = a + b;
        Console.WriteLine("Angle " + d.angName + " " + d.angDegree + "^ "
                              + d.angMinutes + "' " + d.angSeconds + "\"");

        if (c != d)
            Console.WriteLine("Angles are not equall");
        else Console.WriteLine("Angles {0} and {1} are equall\n", c.angName, d.angName);

        var obj = new Angle();
        obj[0] = d;
        obj[1] = a;
        obj[2] = c;
        obj[3] = b;

        Console.WriteLine("Indexerul pentru 4 obiecte tip Angle :\n{0}\n{1}\n{2}\n{3}\n", obj[0], obj[1], obj[2], obj[3]);

        ArrayList dimensions = new ArrayList();
        
        Random rnd = new Random();
       
        for (int ctr = 1; ctr <= 10; ctr++)
        {
            int degrees = rnd.Next(0, 179);
            DegreeDimens temp = new DegreeDimens();
            temp.Dimension = degrees;
            dimensions.Add(temp);
        }

        dimensions.Sort();

        foreach (DegreeDimens temp in dimensions)
            Console.WriteLine(temp.Dimension);


        Console.ReadKey();
    }
}
public class Angle
{
    public Angle() { }
    public Angle(string angName, int angDegree, int angMinutes, int angSeconds)
    {
        this.angName = angName;
        this.angDegree = angDegree;
        this.angMinutes = angMinutes;
        this.angSeconds = angSeconds;
    }

    public string angName;
    public int angDegree;
    public int angMinutes;
    public int angSeconds;

    public static Angle operator +(Angle a, Angle b)
    {
        Angle angSum = new Angle();
        angSum.angName = a.angName + b.angName;
        angSum.angDegree = a.angDegree + b.angDegree;
        angSum.angMinutes = a.angMinutes + b.angMinutes;
        angSum.angSeconds = a.angSeconds + b.angSeconds;
        if(angSum.angSeconds >= 60)
        {
            angSum.angSeconds = angSum.angSeconds - 60;
            angSum.angMinutes = angSum.angMinutes+1;
        }
        if (angSum.angMinutes >= 60)
        {
            angSum.angMinutes = angSum.angMinutes - 60;
            angSum.angDegree = angSum.angDegree + 1;
        }
        return angSum;
    }
    public static bool operator ==(Angle a, Angle b)
    {
        bool status = false;
        if (a.angDegree == b.angDegree && a.angMinutes == b.angMinutes
           && a.angSeconds == b.angSeconds)
        {

            status = true;
        }
        return status;
    }
    public static bool operator !=(Angle a, Angle b)
    {
        bool status = false;

        if (a.angDegree != b.angDegree || a.angMinutes != b.angMinutes ||
           a.angSeconds != b.angSeconds)
        {

            status = true;
        }
        return status;
    }
    private Angle[] angIndex = new Angle[44];
    public Angle this[int indexang]
    {
        get
        {
            return angIndex[indexang];
        }
        set
        {
            angIndex[indexang] = value;
        }
    }
}

public class Angles : IEnumerable
{
    private Angle[] _angles;
    public Angle this[int angindex]
    {
        get
        {
            return _angles[angindex];
        }
        set
        {
            //_angles[angindex] = value;
        }
    }
    public Angles(Angle[] angArray)
    {
        _angles = new Angle[angArray.Length];

        for (int i = 0; i < angArray.Length; i++)
        {
            _angles[i] = angArray[i];
        }
    }

    // GetEnumerator method.
    IEnumerator IEnumerable.GetEnumerator()
    {
        return (IEnumerator)GetEnumerator();
    }

    public AnglesEnum GetEnumerator()
    {
        return new AnglesEnum(_angles);
    }
}

public class AnglesEnum : IEnumerator
{
    public Angle[] _angles;

    int position = -1;

    public AnglesEnum(Angle[] list)
    {
        _angles = list;
    }

    public bool MoveNext()
    {
        position++;
        return (position < _angles.Length);
    }

    public void Reset()
    {
        position = -1;
    }

    object IEnumerator.Current
    {
        get
        {
            return Current;
        }
    }

    public Angle Current
    {
        get
        {
            try
            {
                return _angles[position];
            }
            catch (IndexOutOfRangeException)
            {
                throw new InvalidOperationException();
            }
        }
    }
    public class DegreeDimens : IComparable
    {        
        protected double angDegree;
        public int CompareTo(object obj)
        {
            if (obj == null) return 1;

            DegreeDimens degreeValue = obj as DegreeDimens;
            if (degreeValue != null)
                return this.angDegree.CompareTo(degreeValue.angDegree);
            else
                throw new ArgumentException("Need a number");
        }

        public double Dimension
        {
            get
            {
                return this.angDegree;
            }
            set
            {
                this.angDegree = value;
            }
        }
    }
}

