package aula27;

import javax.swing.JOptionPane;

public class Exer3 {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Números sorteados").append("\n");
        
        int soma = 0;
        for (int i = 1; i <= 3; i++) {
            int jogada = (int)(Math.random()*6)+1;
            soma += jogada;
            
            sb.append(String.format(
               "Jogada %d=%d\n", i, jogada
            ));
        }
        sb.append("Total = ").append(soma);
        JOptionPane.showMessageDialog(null, sb.toString());
        
    }
    
}
