
package eva3_8_custom_exception;

public class EVA3_8_CUSTOM_EXCEPTION {

    public static void main(String[] args) {
        try {
            //throw new Miexcepcion("Excepcion personalizada");
            throw new MicheckedException("Excepcion personalizada");
        } catch (MicheckedException ex) {
            System.getLogger(EVA3_8_CUSTOM_EXCEPTION.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
}
class Miexcepcion extends RuntimeException{

    public Miexcepcion(String message) {
        super(message);
    }
    
}
class MicheckedException extends Exception{

    public MicheckedException(String message) {
        super(message);
    }
    
}