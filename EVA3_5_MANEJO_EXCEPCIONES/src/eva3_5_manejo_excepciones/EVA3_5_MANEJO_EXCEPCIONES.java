
package eva3_5_manejo_excepciones;

import java.util.Scanner;

public class EVA3_5_MANEJO_EXCEPCIONES {

    public static void main(String[] args) {
        int x, y = 0, resu;
        //ustedes solicitan del teclado los valores de X y de Y y muestran el resultado
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor de X: ");
        x = captu.nextInt();
        while(y == 0){
        System.out.println("Valor de Y: ");
        y = captu.nextInt();
        }
        resu = x / y;
        System.out.println(x + " / " + y + " = " + resu);
    }
    
}
