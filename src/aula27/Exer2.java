
package aula27;

import javax.swing.JOptionPane;

public class Exer2 {
    
    public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog(
                "Infome um numero"));
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i <= 10;i++){
            sb.append(String.format(" %d x %d = %d\n", num, i, (num*i)));
        }
        JOptionPane.showMessageDialog(null, sb.toString());
        
    }
    
    
    
}
