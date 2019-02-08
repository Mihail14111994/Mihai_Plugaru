using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SOLID_principles.Plugaru_Mihail
{
    interface IWorkhard
    {
        void workhard();
    }

    interface IRest
    {
        void rest();
    }

    class Worker : IWorkhard, IRest
    {
        public void workhard()
        {
            // work
        }
        public void rest()
        {
            // rest
        }
    }

    class Computer : IWorkhard
    {
        public void workhard()
        {
            // work
        }
    }

    class InternWorker : IWorkhard, IRest
    {
        public void workhard()
        {
            // work
        }
        public void rest()
        {
            // rest
        }
    }

}
