
package aula27;

import java.text.DecimalFormat;

public class FormatNumero {
 
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat();
        
        double vl = 70.25;
        df.applyPattern("#0.00");
        System.out.println(df.format(vl));
        
        double v2 = 2583.65;
        df.applyPattern("R$ #,##0.00");
        System.out.println(df.format(v2));
    }
    
    
}
