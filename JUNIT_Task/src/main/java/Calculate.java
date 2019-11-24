public class Calculate {

//    public double multiply(double firstNumber, double secondNumber) – where numbers could not be smaller than 0
//    and
//    bigger then 100(0=> ? <= 100),
//    if conditions are not matched return 0

//    b. public int subtract(int firstNumber, int secondNumber) – where both numbers could not be smaller than 0
//    and
//    firstNumber could not be smaller than secondNumber,
//    if conditions are not matched return -1

//    c. public double divide(double numberToBeDivided, double divisor) – where numbers could not be smaller than 0
//    and numberToBeDivided could not be smaller than divisor,
//    if conditions are not matched return 0

    public static double multiply(double firstNumber, double secondNumber){
        double result = 0;
        if(firstNumber >= 0 && firstNumber <= 100 && secondNumber >= 0 && secondNumber <= 100)
            result = firstNumber * secondNumber;
        return result;
    }

    public static int substract(int firstNumber, int secondNumber){
        int result = -1;
        if(firstNumber >= secondNumber && secondNumber >= 0)
            result = firstNumber - secondNumber;
        return result;
    }

    public static double divide(double numberToBeDivided, double divisor){
        double result = 0;
        try{
        if(numberToBeDivided >= divisor && divisor >= 0)
            result = numberToBeDivided / divisor;}
        catch (Exception e){
            System.out.println("Dividing by ZERO!");
        }
        return result;
    }
}
