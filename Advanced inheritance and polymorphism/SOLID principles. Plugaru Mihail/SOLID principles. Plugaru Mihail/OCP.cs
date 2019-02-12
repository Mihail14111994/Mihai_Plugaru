using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SOLID_principles.Plugaru_Mihail
{
    
    public class IAnswerCall
    {
        public virtual void AnswerCall( )
        {
             //pick up the phone
        }
    }

    public class AnswerCallPress : IAnswerCall 
    {
        public override void AnswerCall( )
        {
             //press the green button
        }
    }

    public class AnswerCallSlide : IAnswerCall
    {
        public override void AnswerCall( )
        {
             //slide the green button
        }
    }
}
