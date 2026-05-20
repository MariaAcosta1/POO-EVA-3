
package eva3_7_throws;

public class EVA3_7_THROWS {

    public static void main(String[] args) {
        try{
            //el error viene de pasar mal los datos, aqui es donde debe corregirse
            System.out.println("Resultado = " + division(10, 0));
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }                                        //throws es principalmente  para excepciones de tipo checked
    public static int division(int x, int y) throws Exception{
        int resu = 0;
        
        if(y == 0)//el error no se corrigue aqui, sino en la llamada de division
            //throws nos permite lanzar una excepcion de cualquier clase
            throw new Exception("El divisor no puede ser 0(cero), cambienlo a otro numero");
        resu= x / y;
        return resu;
    }
}
