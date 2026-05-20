
package eva3_6_manejo_excepciones;

import java.util.Scanner;

public class EVA3_6_MANEJO_EXCEPCIONES {

    public static void main(String[] args) {
        int x, y = 0, resu = 0;
        Scanner c = new Scanner(System.in);
        System.out.println("Valor de X: ");
        x = c.nextInt();
        while(true){
        System.out.println("Valor de Y: ");
        y = c.nextInt();
        c.nextLine();
            boolean bande;
        try{
            resu = x / y;
            bande = true;
        }catch(ArithmeticException e){
            System.out.println("El valor de la Y no puede ser 0(cero). Intente con numero diferente");
            bande = false;
        }
        if(bande)
            break;
        }
        System.out.println(x + " / " + y + " = " + resu);
    }
    
}
