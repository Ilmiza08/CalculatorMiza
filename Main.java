/**
 * class Main 
 *
 * @author Ilmiza
 * @version 0.1
 */
public class Main
{
    public static void main(String args[])
    {
       System.out.println(Calculator.info);
       
    Calculator calculator1 = new Calculator();
    Calculator calculator4 = new Calculator();
    Calculator calculator2 = new Calculator(3,5);
    Calculator calculator3 = new Calculator(3);
       
       System.out.println("Nilai awal setelah konstruktor dipanggil");
       System.out.println("Nilai op2 Constructor tanpa parameter: "+calculator1.op2);
       System.out.println("Nilai op2 Constructor dengan 2 parameter: "+calculator2.op2);
       System.out.println("Nilai op2 Constructor dengan 3 parameter: "+calculator3.op2);
       
       System.out.println("Nilai op1 Constructor tanpa parameter: "+calculator1.getOp1());
       System.out.println("Nilai op1 Constructor dengan 2 parameter: "+calculator2.getOp1());
       System.out.println("Nilai op1 Constructor dengan 3 parameter: "+calculator3.getOp1());
        
       System.out.println("");
       System.out.println(Calculator.jumlahobject);
       
       System.out.println("");
       double hasil1 = calculator1.jumlah();
       double hasil2 = calculator1.jumlah(5, 4);
       System.out.println("Hasil penjumlahan method jumlah tanpa parameter: "+ hasil1);
       System.out.println("Hasil penjumlahan method jumlah dengan parameter: "+ hasil2);
       
       System.out.println("");
       double kurang1 = calculator1.kurang();
       double kurang2 = calculator1.kurang(5, 4);
       System.out.println("Hasil pengurangan method kurang tanpa parameter:  " + kurang1);
       System.out.println("Hasil pengurangan  method kurang dengan parameter:  "+ kurang2);
       
       System.out.println("");
       double perkalian1 = calculator1.perkalian();
       double perkalian2 = calculator1.perkalian(5, 4);
       System.out.println("Hasil perkalian method kali tanpa parameter:  " + perkalian1);
       System.out.println("Hasil perkalian  method kali dengan parameter:  "+ perkalian2);
       
       System.out.println("");
       double pembagian1 = calculator1.pembagian();
       double pembagian2 = calculator1.pembagian(5, 4);
       System.out.println("Hasil pembagian method bagi tanpa parameter:  " + pembagian1);
       System.out.println("Hasil pembagian  method bagi dengan parameter:  "+ pembagian2);
       
         CalculatorScientific cs = new CalculatorScientific();
       System.out.println("Penjumlahan dari 4 + 5 = "+ cs.jumlah(4,5));
       System.out.println("Faktorial dari 5! adalah "+ cs.menghitungFaktorial(5));
       System.out.println("Luas Bujur Sangkar dengan sisi 5 sisi adalah "+ cs.bujurSangkar(5));
       System.out.println("luas lingkarannya adalah "+ cs.luasLingkaran(3.14, 10));
       //System.out.println(CalculatorScientific.jumlahobject);
       
       CalculatorScientific cs2 = new CalculatorScientific(2,3);
       System.out.println("");
       System.out.println("Percobaan Calcul Scientific dengan parameter dari Kalkulator");
       System.out.println(cs2.op1);
       System.out.println(cs2.op2);
       
       CalculatorProgramer cp = new CalculatorProgramer();
       System.out.println("\n Kalkulator Programmer");
       System.out.println("Konversi 7070 ke Hexadesimal adalah = "+ cp.konversiBilanganDesimaltoHex(7070));
       System.out.println("Konversi 7070 ke Binner adalah = "+ cp.konversiBilanganDesimaltoBinner(7070));       
    

    }
    
}