
package exemplo2;

public class Conversor {
    
    public static void main(String[] args) {
        
        String a = "10";
        String b = "20";
        String c = a+b;
        System.out.println(c);
        
        //converter as variaveis para int
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = x+y;
        
        System.out.println(z);
        
        //em double
        double i = Double.parseDouble(a);
        double j = Double.parseDouble(b);
        double k = i+j;
        
        System.out.println(k);
        
        //converter int para string
        String s = String.valueOf(k);
        System.out.println(s);
    }
    
}
