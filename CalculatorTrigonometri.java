
/**
 * Abstract class CalculatorTrigonometri - write a description of the class here
 *
 * @author ilmiza
 * @version 23.04
 */
public abstract class CalculatorTrigonometri extends Calculator
{
    protected double sudut;
   
   public abstract void konversi(double sudut);
   
   public double sin()
   {
       return Math.sin(this.sudut); 
   }
   
   public double cos()
   {
       return Math.cos(this.sudut);
       
    }
    public double tan()
    {
        return Math.tan(this.sudut);
    }
   
}
