package homework7.tytneto.Factory;


import homework7.tytneto.Enum.Operation;
import homework7.tytneto.Model.Complex;
import homework7.tytneto.Model.ComplexExpression;

public interface ExpressionFactory {
    public ComplexExpression createExpression(Operation operation, Complex[] args);
}
