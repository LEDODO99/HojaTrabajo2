
/**
 *
 * @author Ana Lucía Hernández 17138. Luis Delgado 17187.
 */


package Calculadora;

public class Calculos implements calculadora{
    private StackVector<Double> sv;
    
    public Calculos()
    {
        sv = new StackVector<>();
    }
    @Override
    public double operar(String expresion)
    {
        String[] expresionSeparada=expresion.split(" ");
        int longitud=expresionSeparada.length;
        for (int i=0; i<longitud;i++)
        {
            try
            {
                sv.push(Double.parseDouble(expresionSeparada[i]));
            }
            catch(Exception e)
            {
                if(expresionSeparada[i].equals("+"))
                {
                    double num2=sv.pop();
                    double num1=sv.pop();
                    double resultante = num1+num2;
                    sv.push(resultante);
                }
                else if(expresionSeparada[i].equals("*"))
                {
                    double num2=sv.pop();
                    double num1=sv.pop();
                    double resultante = num1*num2;
                    sv.push(resultante);
                }
                else if(expresionSeparada[i].equals("-"))
                {
                    double num2=sv.pop();
                    double num1=sv.pop();
                    double resultante = num1-num2;
                    sv.push(resultante);
                }
                else if(expresionSeparada[i].equals("/"))
                {
                    double num2=sv.pop();
                    double num1=sv.pop();
                    double resultante = num1/num2;
                    sv.push(resultante);
                }
                else
                {
                    return Double.NaN;
                }
            }
        }
        if (sv.size()>1)
        {
            return Double.NaN;
        }
        else
        {
            return sv.pop();
        }
    }
}

