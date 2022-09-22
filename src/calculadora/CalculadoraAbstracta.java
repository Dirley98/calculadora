package calculadora;

/**
 *
 * @author Dirley Rocio
 */
public class CalculadoraAbstracta implements Numero{

    @Override
    public double suma(double num1, double num2) {        
        return num1+num2;
    }

    @Override
    public double resta(double num1, double num2) {
       return num1-num2;
    }

    @Override
    public double multiplicacion(double num1, double num2) {
    return num1*num2;
    }

    @Override
    public double division(double num1, double num2) {
    return num1/num2;
    }
    
}
