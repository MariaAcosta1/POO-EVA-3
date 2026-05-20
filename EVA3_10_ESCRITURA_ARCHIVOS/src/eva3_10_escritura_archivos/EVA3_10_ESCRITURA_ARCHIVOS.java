
package eva3_10_escritura_archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EVA3_10_ESCRITURA_ARCHIVOS {

    public static void main(String[] args) {
        String ruta = "C:\\archivos\\";  //Tiene que estar en disco local para que funcione
        try {
            writeUsingFiles(ruta, "Ola");
            writeUsingBufferedWriter(ruta, "Adiós");
            writeUsingFileWriter(ruta, "Balas noches");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void writeUsingFiles(String ruta, String texto) throws IOException{
        System.out.println("Escritura de archivos usando Files");
        Path path = Paths.get(ruta + "archivoFiles.txt");
        Files.write(path, texto.getBytes());
    }
    public static void writeUsingBufferedWriter(String ruta, String texto) throws FileNotFoundException, IOException{
        System.out.println("Lectura usando buffered writer");
        File source = new File(ruta + "archivoBufferedWriter.txt");
        FileOutputStream fos = new FileOutputStream(source);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter (osw);
        bw.write(texto);
        bw.newLine();
        bw.write(texto + "\n");
        bw.newLine();
        bw.write(texto + "\n");
        bw.newLine();
        bw.write(texto + "\n");
        bw.newLine();
        bw.close();
    }
    public static void writeUsingFileWriter(String ruta, String texto) throws IOException{
        System.out.println("Lectura usando filewriter");
        File source = new File(ruta + "archivoFileWriter.txt");
        FileWriter fileWriter = new FileWriter(source);
        fileWriter.write(texto);
        fileWriter.close();
    }
}
