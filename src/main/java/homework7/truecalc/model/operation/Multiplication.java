package homework7.truecalc.model.operation;

import homework7.truecalc.model.ComplexNumber;
import homework7.truecalc.model.Operation;

public class Multiplication implements Operation {


    @Override
    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b) {
        double realResult = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginaryResult = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new ComplexNumber(realResult, imaginaryResult);
    }
}