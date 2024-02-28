package homework7.truecalc.model.operation;

import homework7.truecalc.model.ComplexNumber;
import homework7.truecalc.model.Operation;

public class Subtraction implements Operation {
    @Override
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        double realResult = a.getReal() - b.getReal();
        double imaginaryResult = a.getImaginary() - b.getImaginary();
        return new ComplexNumber(realResult, imaginaryResult);
    }
}
