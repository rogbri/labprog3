
package exemplo2;

import javax.swing.JOptionPane;

public class CalculoImc {
    
    public static void main(String[] args) {
        
        String str1 = JOptionPane.showInputDialog(
            "Informe o peso: "
        );
        
        String str2 = JOptionPane.showInputDialog(
            "Informe a altura: "
        );
        
        double imc = (Double.parseDouble(str1)/Math.pow(
                       Double.parseDouble(str2), 2));
        
        JOptionPane.showMessageDialog(
            null, "imc = " + imc
        );
        
        
    }
    
    
}
