
/**
 * Write a description of class CalculatorScientific here.
 *
 * @author Ilmiza
 * @version 22.04
 */
public class CalculatorScientific extends Calculator
{
    public double phi=0;
    
    
    int sisi;
    //public double r=0;
    
     /**
     * Constructor for objects of class Calculator
     */
    public CalculatorScientific()
    {
        // initialise instance variables luas lingkaran
        
    //    super.jumlahobject += 1;
       
    }
    
    /**
     * Constructor for objects of class Kalkulator
     * @param  double, double inisialisasi nilai dari op1 dan op2 
     * "Super" -> akses subclass(calculatorscientific) pada superclass(kalkulator)
    */
  
    public CalculatorScientific(double phi, double op1)
    {
        
        this.phi = phi;
        super.op1 = op1;
     //   super.jumlahobject += 1;
    
    }
    
    
    
    /*
     * Constructor for objects of class Kalkulator
     * @param  double, double inisialisasi nilai dari op1 dan op2
     *
     
    public CalculatorScientific(double phi, double r)
    {
        
        this.phi = phi;
      //  super.jumlahobject += 1;
        
    
    }
    */
    
    
    /**
     * menghitungFaktorial
     *
     * @param  int op1
     *         
     * @return int 4! = 4x3x2x1 (example)
     */
    public int menghitungFaktorial(int op1){
        // contoh
        if (op1 == 1 || op1 == 0)
        return 1;
        else
            return op1 * menghitungFaktorial(op1 - 1);
        //int hasil = 5;
        //return hasil;
    }
    
    // method menghitung luas lingkaran tanpa parameter
    public double luasLingkaran(double phi, double op1){
        
        return this.phi*(super.op1*super.op1);
        
    }
    
    

    
    // method menghitung luas bujur sangkar
    public double bujurSangkar(int sisi){
        double luas;
        luas=sisi*sisi;
        
        return luas;
        
    }

}
