
package eva3_3_try_catch;

public class EVA3_3_TRY_CATCH {

    public static void main(String[] args) {
        int x = 100, y = 0, resu = 0;
        try{ //es el codigo que se INTENTA ejecutar, pero puede generar una excepcion
        resu = x / y; //este codigo genera la excepcion
        System.out.println("esto nunca se ejecuta");
        }catch(ArithmeticException e){
            //QUE HACEMOS CON LA EXCEPCION
            //NADA IMPIDE QUE VUELVAN A GENERAR UNA EXCEPCION AQUI
            e.printStackTrace();
            System.out.println("Error: Division entre 0");
        }
        System.out.println("Division: " + resu);
    }
    
}
