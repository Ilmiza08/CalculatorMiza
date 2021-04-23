
/**
 * class CalcuatorTriDegree here.
 *
 * @author Ilmiza
 * @version 23.04
 */
public  class CalculatorTriDegree extends CalculatorTrigonometri
{
    /**
     * Constructor for objects of class CalculatorTriDegree
     */
    public CalculatorTriDegree()
    {
       
    }
    /**
     * konversi
     *
     * @param  double sudut
     * @return void
     */
    public void konversi(double sudut)
    {
        super.sudut = Math.toRadians(sudut);
    }
}
