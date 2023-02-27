
package exemplo2;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class Exer2 {
    
    public static void main(String[] args) {
        
        String nome = "joao da silva";
        double altura = 1.95;
        double peso = 92.58;
        
        double imc = (peso / (altura*altura) );
        
        JOptionPane.showMessageDialog(null,"Resultado: \n" + nome + String.format("\n imc = %.1f", imc));
        JOptionPane.showMessageDialog(null, "message", "Title", INFORMATION_MESSAGE);
    }
    
    
}
