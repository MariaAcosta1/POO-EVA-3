
package eva3_1_excepciones_unchecked;

public class EVA3_1_EXCEPCIONES_UNCHECKED {

    public static void main(String[] args) {
        //CHECKED --> LO VEREMOS EN MANEJO DE ARCHIVOS
        //UNCHECKED --> ERRORES LÓGICOS, PREVENIBLES CON BUENAS PRÁCTICAS
        //ARITHMETIC EXCEPTION --> DIVISION ENTRE CERO
        /*int x = 100, y = 0, resu;
        resu = x / y;
        System.out.println("Resu x / y = " + resu);
        
        //arrayindexoutofboundsexception
        int[] arreglo = new int[5]; //Es de 0-4
        System.out.println(arreglo[3]);
        */
        
        //NULLPOINTEREXCEPTION
        String cade = null;
        System.out.println(cade.length());//cuando queremos usar un objeto no instanciado
    }
    
}
