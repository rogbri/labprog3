
package exemplo2;

import java.util.Scanner;

public class ComandosDeEntrada {

    public static void main(String[] args) {
        
        //entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor: ");
        int valor1 = entrada.nextInt();
        
        System.out.println("Informeo segundo valor: ");
        int valor2 = entrada.nextInt();
        
        System.out.println("nome= " + (valor1+valor2));
        
        
    }

    
}
