
package exemplo2;

public class Exer1 {
    
    public static void main(String[] args) {
        
    double notaParc = 7.0;
    double notaFin = 8.0;
    double media = ((notaParc + notaFin) / 2);
    
        System.out.println("Nota final: " + media);
    
        System.out.println(String.format("Nota final: %.1f", media));
            
    }
}
