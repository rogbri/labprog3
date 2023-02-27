
package exemplo2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Triangulo {
   
    public static void main(String[] args) {
        
        /*
        double base;
        double altura;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digita a base do triangulo: ");
        base = entrada.nextDouble();
        
        System.out.println("Digite a altura: ");
        altura = entrada.nextDouble();
        
        double area = (base*altura)/2;
        
        System.out.println(String.format("Area do riangulo: %.2f", area));
        */
        
        String str1 = JOptionPane.showInputDialog(
            "Informe a base do triangulo: "
        );
        
        String str2 = JOptionPane.showInputDialog(
            "Informe a base: "
        );
        
        double area2 = (Double.parseDouble(str1)*
                       Double.parseDouble(str2))/2;
        
        JOptionPane.showMessageDialog(
            null, "area = " + area2
        );
        
    }
    
}
