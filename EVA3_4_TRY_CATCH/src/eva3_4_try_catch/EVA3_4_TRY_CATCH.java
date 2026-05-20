
package eva3_4_try_catch;

public class EVA3_4_TRY_CATCH {

    public static void main(String[] args) {
        int x = 10, y = 0, resu = 0;
        String cade = null;
        try{
            resu = x/ y;
            System.out.println("Terminamos la division");
            System.out.println(cade.length());
            System.out.println("Terminas la operación con la cadena");
        /*}catch(RuntimeException e){
            e.printStackTrace();
        }*/
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(NullPointerException e){
            e.printStackTrace();
        }
        System.out.println("Fin del programa");
    }
    
}
