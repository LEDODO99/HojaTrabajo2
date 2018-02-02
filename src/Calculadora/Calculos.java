
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
        String[] expresionSeparada=expresion.split("");
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
                    if (sv.size() > 1)
                    {
                        double num2=sv.pop();
                        double num1=sv.pop();
                        double resultante = num1+num2;
                        sv.push(resultante);
                    }
                    else
                    {
                        return Double.NaN;
                    }
                }
                else if(expresionSeparada[i].equals("*"))
                {
                    if (sv.size() > 1)
                    {
                        double num2=sv.pop();
                        double num1=sv.pop();
                        double resultante = num1*num2;
                        sv.push(resultante);
                    }
                    else
                    {
                        return Double.NaN;
                    }
                }
                else if(expresionSeparada[i].equals("-"))
                {
                    if (sv.size() > 1)
                    {
                        double num2=sv.pop();
                        double num1=sv.pop();
                        double resultante = num1-num2;
                        sv.push(resultante);
                        }
                    else
                    {
                        return Double.NaN;
                    }
                }
                else if(expresionSeparada[i].equals("/"))
                {
                    if (sv.size()>1)
                    {
                        double num2=sv.pop();
                        double num1=sv.pop();
                        if(num2==0){
                            return Double.NaN;
                        }
                        double resultante = num1/num2;
                        sv.push(resultante);
                    }
                    else
                    {
                        return Double.NaN;
                    }
                }
            }
        }
            return sv.pop();
    }
}

