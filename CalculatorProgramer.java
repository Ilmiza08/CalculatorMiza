
/**
 * class CalculatorProgramer here.
 *
 * @author Ilmiza
 * @version 0.1
 */
public class CalculatorProgramer extends Calculator{

     public int op1=0;
    public double op2=0;
    public static final String info = "Kalkulatorku";
    public static int jumlahobject = 0;

    /**
     * Constructor for objects of class Calculator
     */
    public CalculatorProgramer()
    {
        // initialise instance variables
        this.jumlahobject += 1;
    }
    
    /**
     * Constructor for objects of class Calculator
     * @param  double, double inisialisasi nilai dari op1 dan op2
    */
  
    public CalculatorProgramer(int op1, double op2)
    {
        this.op1 = op1;
        this.op2 = op2;
        this.jumlahobject += 1;
    
    }
    
    /**
     * Constructor for objects of class Calculator
     * @param  double, double inisialisasi nilai dari op1 dan op2
    */
  
    public CalculatorProgramer(double op2)
    {
        this.op2 = op2;
        this.jumlahobject += 1;
        
    
    }
    
    
    
    
    /**
     * set op1
     *
     * @param  double op1  
     * @return  void
     */
    public void setOp1(int op1)
    {
        this.op1 = op1;
    }
    
    
    /**
     * get op1
     *
     * @param  double op1  
     * @return  void
     */
    public double  getOp1()
    {
        return this.op1;
    }
    
    
    /**
     * jumlah tanpa parameter
     *
     * @param  
     * @return  double hasil penjumlahan op1 + op2
     */
    public double jumlah() 
    {
        return this.op1 + this.op2;
    }
    
     /**
     * jumlah dengan parameter
     *
     * @param  double op1
     *         double op2
     * @return double hasil penjumlahan op1 + op2
     */
    public double jumlah(int op1, double op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
        return jumlah();
    }
    
    /**
     * konversiBilanganDesimaltoHex
     *
     * @param  double op1
     *         double op2
     * @return double hasil penjumlahan op1 + op2
     */
    public String konversiBilanganDesimaltoHex(int op1) 
    {
        // buat konversi ke hex dengan java (tugas)
        String hasilKonversi = Integer.toHexString(op1) ;
        return hasilKonversi;
    }
    
    // method konversiBilanganDesimaltoBiner
    public String konversiBilanganDesimaltoBinner(int op1) 
    {
        // buat konversi ke hex dengan java (tugas)
        String hasilKonversi = Integer.toBinaryString(op1) ;
        return hasilKonversi;
    }
}
