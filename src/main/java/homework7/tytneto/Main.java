package homework7.tytneto;


import homework7.tytneto.Model.Complex;
import homework7.tytneto.Parser.ExpressionParser;
import homework7.tytneto.Testing.Testing;

public class Main {
    public static void main(String[] args) {

        Testing testing=new Testing();
        testing.test();
        System.out.println("Test successfully passed!");

        ExpressionParser expressionParser=new ExpressionParser(args);
        System.out.println(expressionParser.validForTrueFloats());
        Complex result = expressionParser.resultforTrueFloats();
        System.out.println("Re:"+result.getRe()+" Im:"+result.getIm());




    }
}