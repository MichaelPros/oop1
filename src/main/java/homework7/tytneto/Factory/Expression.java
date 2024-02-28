package homework7.tytneto.Factory;


import homework7.tytneto.Enum.Operation;
//import homework7.Model.*;
import homework7.tytneto.Model.*;

public class Expression implements ExpressionFactory {
    @Override
    public ComplexExpression createExpression(Operation operation, Complex[] args) {
        if(operation.equals(Operation.ADDITION))
            return new Addition(args);
        else if (operation.equals(Operation.SUBSTRACTION))
            return new Subtraction(args);
        else if (operation.equals(Operation.MULTIPLICATION))
            return new Multiplication(args);
        else if (operation.equals(Operation.DIVISION_BY))
            return new DivisionBy(args);
        else return null;
    }


}