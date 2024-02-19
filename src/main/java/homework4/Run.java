package homework4;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.divSingle(33, 678.243));
        System.out.println(calculator.divCollection(Arrays.asList(10,20,30,40,50,60)));
        System.out.println(calculator.sumCollection(Arrays.asList(234,-124,55,7.3)));
        System.out.println(calculator.multiCollection(Arrays.asList(8.2, 73, 1, 4.66)));
        System.out.println(calculator.multiSingle(43,565.55));
        System.out.println(calculator.binar(4353.134));

    }
}
