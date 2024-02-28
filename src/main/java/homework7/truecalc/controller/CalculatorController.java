package homework7.truecalc.controller;

import homework7.truecalc.model.ComplexNumber;
import homework7.truecalc.model.Operation;

import java.util.HashMap;
import java.util.Map;

public class CalculatorController {
    private Map<String, Operation> operations = new HashMap<>();

    public void registerOperation(String operator, Operation operation) {
        operations.put(operator, operation);
    }

    public ComplexNumber performOperation(String operator, ComplexNumber a, ComplexNumber b) {
        Operation operation = operations.get(operator);
        if (operation != null) {
            return operation.calculate(a, b);
        }
        return null;
    }
}
