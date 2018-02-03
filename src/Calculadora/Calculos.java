
/**
 *
 * @author Ana Lucía Hernández 17138. Luis Delgado 17187.
 */


package Calculadora;

public class Calculos implements calculadora{
    StackVector<Double> x = new StackVector<Double>();
    double d2;
    double d3 = Double.NaN;
    double n1,n2;
    
    @Override
    public double operar(String expresion) 
    {       
       if(expresion.length()<=3){
           x.push(Double.NaN);
       }else{
        for(int i=0;i<expresion.length();i++)
        {
            
            try
            {
               
               double d1 =  Double.parseDouble(Character.toString(expresion.charAt(i)));    
               x.push(d1);
                
           }catch(Exception e)
           {
               switch (expresion.charAt(i)) 
               {
                    case '+':
                       n1=x.pop();
                       n2=x.pop();
                       d2 =  n2+n1;
                       x.push(d2);            
                       break;
                       
                   case '-':
                       n1=x.pop();
                       n2=x.pop();
                       d2 =  n2-n1;
                       x.push(d2);            
                       break;
                          
                       
                    case '*':
                       n1=x.pop();
                       n2=x.pop();
                       d2 =  n2*n1;
                       x.push(d2);            
                       break; 
                    
                       
                    case '/':
                       n1=x.pop();
                       n2=x.pop();
                       if (n1==0) 
                        {
                            d2=d3;                            
                        }
                        else
                        {
                            d2=n2/n1;
                        }
                       x.push(d2);            
                       break;   
                }
            }
            }
        
       }
        return x.pop();
       }
    }
    

