package Logic;

public class Calculator_Model {
    private Double result;
    private Double operand1;
    private Double operand2;


    public Double add(Double operand1, Double operand2)
    {
        result = operand1 + operand2;
        return result;
    }
    public Double Div(Double operand1, Double operand2)
    {
        if(operand2 != 0.0)
            {
                result = operand1/operand2;
                return result;
            }
        else{
            throw new ArithmeticException("Dividing by zero is not allowed");
        }
    }
    public Double Multi(Double operand1, Double operand2)
    {
        result = operand1 * operand2;
        return  result;
    }

    public Double Sub(Double operand1, Double operand2)
    {
        result = operand1 - operand2;
        return  result;
    }
}
