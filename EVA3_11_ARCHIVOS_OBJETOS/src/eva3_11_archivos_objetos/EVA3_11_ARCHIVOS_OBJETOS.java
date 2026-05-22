
package eva3_11_archivos_objetos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_11_ARCHIVOS_OBJETOS {

    public static void main(String[] args) {
        String ruta = "C:\\archivos\\archivosDas.dat";
        try{
            writeObject(ruta);
            readObject(ruta);
        } catch (IOException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_11_ARCHIVOS_OBJETOS.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public static void writeObject(String ruta) throws IOException{
        System.out.println("Escritura de objetos usando objecoutputstram");
        File source = new File(ruta);
        FileOutputStream fos = new FileOutputStream(source);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Persona("1", "2", 60));
        oos.writeObject(new Persona("1", "3", 57));
        oos.writeObject(new Persona("2", "1", 37));
        oos.writeObject(new Persona("2", "2", 29));
        oos.close();
    }
    public static void readObject(String ruta) throws FileNotFoundException, IOException, ClassNotFoundException{
        System.out.println("Lectura de objetos usando objectinputstream");
        File source = new File(ruta);
        FileInputStream fis = new FileInputStream(source);
        ObjectInputStream ois = new ObjectInputStream(fis);
        while(true){
        Persona perso = (Persona)ois.readObject();
        System.out.println("Nombre: " + perso.getNombre());
        System.out.println("Apellidos: " + perso.getApellidos());
        System.out.println("Edad: " + perso.getEdad());
        //Para controlar la lectura, se debe capturar la excepcion
        }
        //ois.close();
    }
}

class Persona implements Serializable{
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
    }
    
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}