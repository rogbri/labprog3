
package exemplo2;

import javax.swing.JOptionPane;

/**
 *
 * @author 834831
 */
public class ComandosDeEntrada2 {
    
    public static void main(String[] args) {
        
        String str1 = JOptionPane.showInputDialog(
            "Informe o primeiro valor"
        );
        
        String str2 = JOptionPane.showInputDialog(
            "Informe o segundo valor"
        );
        
        double soma = Double.parseDouble(str1)+
                      Double.parseDouble(str2);
        
        JOptionPane.showMessageDialog(
            null, "Soma = " + soma
        );
        
    }
    
}
