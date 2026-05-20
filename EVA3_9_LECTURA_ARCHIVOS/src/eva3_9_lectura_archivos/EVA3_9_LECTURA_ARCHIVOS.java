
package eva3_9_lectura_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class EVA3_9_LECTURA_ARCHIVOS {

    public static void main(String[] args) {
            String ruta = "C:\\archivos\\prueba.txt"; //Tiene que estar en disco local para que funcione
        try {
            readUsingFiles(ruta);
            readUsingScanner(ruta);
            readUsingBufferedReader(ruta);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    /*Files lee todo el archivo y lo envia como un String*/
    public static void readUsingFiles(String ruta) throws IOException{
        System.out.println("Lectura de archivos usando Files");
        Path path = Paths.get(ruta);
        String cade = Files.readString(path);
        System.out.println(cade);
    }
    /*Lee el archivo linea por linea*/
    public static void readUsingScanner(String ruta) throws FileNotFoundException{
        System.out.println("Lectura de archivos usando Scanner");
        File source = new File(ruta);
        Scanner scanner = new Scanner(source);
        String cade;
        int cont = 1;
        while(scanner.hasNextLine()){//si no hay "nextLine" se acabo 
            cade = scanner.nextLine();
            cont++;
            System.out.println(cade);
        }
        scanner.close();
    }
    public static void readUsingBufferedReader(String ruta) throws FileNotFoundException, IOException{
        System.out.println("Lectura usando buffered reader");
        File source = new File(ruta);
        FileInputStream fis = new FileInputStream(source);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String cade;
        while((cade = br.readLine())!=null){
            System.out.println(cade);
        }
        br.close();
    }
}
